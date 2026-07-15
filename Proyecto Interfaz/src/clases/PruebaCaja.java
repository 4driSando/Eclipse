package clases;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PruebaCaja {

	public static void main(String[] args) {

		Producto leche = new Producto("Leche", 0.89);
		Producto pan = new Producto("Pan", 0.69);
		Producto huevos = new Producto("Huevos", 1.59);

		// clave: producto, valor: cantidad comprada de ese producto
		Map<Producto, Integer> ticket = new HashMap<Producto, Integer>();

		DefaultListModel<String> modeloTicket = new DefaultListModel<String>();
		JList<String> ticketList = new JList<String>(modeloTicket);
		modeloTicket.addElement("Bienvenido/a a Caja AhorraMas");

		JFrame ventana = new JFrame("Caja AhorraMas");
		JPanel panelProductos = new JPanel(new GridLayout(0, 2));
		JScrollPane scroll = new JScrollPane(ticketList);

		ventana.add(scroll, BorderLayout.WEST);
		ventana.add(panelProductos, BorderLayout.CENTER);

		JButton botonLeche = new JButton("Leche");
		panelProductos.add(botonLeche);
		botonLeche.addActionListener(e -> {
			ticket.merge(leche, 1, Integer::sum);
			actualizarLista(ticket, modeloTicket);
		});

		JButton botonPan = new JButton("Pan");
		panelProductos.add(botonPan);
		botonPan.addActionListener(e -> {
			ticket.merge(pan, 1, Integer::sum);
			actualizarLista(ticket, modeloTicket);
		});

		JButton botonHuevos = new JButton("Huevos");
		panelProductos.add(botonHuevos);
		botonHuevos.addActionListener(e -> {
			ticket.merge(huevos, 1, Integer::sum);
			actualizarLista(ticket, modeloTicket);
		});

		// --- Panel inferior: total + botones de total y limpiar ---
		JPanel panelInferior = new JPanel(new FlowLayout());
		JLabel labelTotal = new JLabel("Total: 0.00€");
		JButton botonTotal = new JButton("Cobrar / Ver total");
		JButton botonLimpiar = new JButton("Limpiar ticket");

		panelInferior.add(labelTotal);
		panelInferior.add(botonTotal);
		panelInferior.add(botonLimpiar);
		ventana.add(panelInferior, BorderLayout.SOUTH);

		botonTotal.addActionListener(e -> {
			double total = calcularTotal(ticket);
			labelTotal.setText("Total: " + String.format("%.2f", total) + "€");
		});

		botonLimpiar.addActionListener(e -> {
			ticket.clear();
			actualizarLista(ticket, modeloTicket);
			labelTotal.setText("Total: 0.00€");
		});

		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(1000, 650);
		ventana.setVisible(true);

	}

	// Reconstruye la lista visual entera a partir del Map
	private static void actualizarLista(Map<Producto, Integer> ticket, DefaultListModel<String> modeloTicket) {
		modeloTicket.clear();
		modeloTicket.addElement("Bienvenido/a a Caja AhorraMas");

		for (Map.Entry<Producto, Integer> entrada : ticket.entrySet()) {
			Producto producto = entrada.getKey();
			int cantidad = entrada.getValue();
			double subtotal = producto.getPrecio() * cantidad;

			String linea = producto.getNombre() + " x" + cantidad + " — " + String.format("%.2f", subtotal) + "€";
			modeloTicket.addElement(linea);
		}
	}

	// Suma precio * cantidad de todas las líneas del ticket
	private static double calcularTotal(Map<Producto, Integer> ticket) {
		double total = 0;
		for (Map.Entry<Producto, Integer> entrada : ticket.entrySet()) {
			total += entrada.getKey().getPrecio() * entrada.getValue();
		}
		return total;
	}

}