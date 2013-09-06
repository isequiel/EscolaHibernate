package br.com.validators;

/**
 *
 * @author Rosicléia Frasson
 */
public class Validadores {

    public static boolean SoNumeros(String texto) {
        for (char letra : texto.toCharArray()) {
            if (letra < '0' || letra > '9') {
                return false;
            }
        }
        return true;

    }
}