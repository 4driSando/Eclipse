package utils;

public class Password {

	/**
	 * Valida si una contraseña es segura. Criterios: 
	 * 1. Al menos 8 caracteres. 
	 * 2. No puede contener espacios en blanco. 
	 * 3. Debe tener al menos un carácter especial (?, !, @, #, $).
	 * 
	 * @param password La cadena a validar.
	 * @return true si cumple todo, false en caso contrario.
	 */

	public static boolean esSegura(String password) {

		if (password == null || password.length() < 8) {
			return false;
		}

		if (password.contains(" ")) {
			return false;
		}

		String especiales = "?!@#$";
		boolean tieneEspecial = false;

		for (int i = 0; i < password.length(); i++) {
			if (especiales.indexOf(password.charAt(i)) >= 0) {
				tieneEspecial = true;
				break;
			}
		}

		return tieneEspecial;
	}
}
