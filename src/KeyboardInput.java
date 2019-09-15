import java.util.Scanner;

/**
 * Keyboard input methods
 * 
 * @author manuel
 *
 */
public class KeyboardInput {

	/**
	 * Capture a double value by keyboard
	 * @param prompt Prompt text
	 * @return A double value from the keyboard
	 */
	public static double getDouble(String prompt) {
		@SuppressWarnings("resource") // I can't close the scanner. It would also close System.in
		Scanner scnKeyboard = new Scanner(System.in);
		
		System.out.print(prompt + ":  ");
		while (scnKeyboard.hasNext()) {
			if(scnKeyboard.hasNextDouble()) {
				break;
			}else{
				scnKeyboard.next();
				System.out.print("¡¡FORMATO INCORRECTO (DOBLE)!! " + prompt + ":  ");
			};
		}
		return scnKeyboard.nextDouble();
	}

	/**
	 * Capture a long value by keyboard
	 * @param prompt Prompt text
	 * @return A long value from the keyboard
	 */
	public static long getLong(String prompt) {
		@SuppressWarnings("resource") // I can't close the scanner. It would also close System.in
		Scanner scnKeyboard = new Scanner(System.in);
		
		System.out.print(prompt + ":  ");
		while (scnKeyboard.hasNext()) {
			if(scnKeyboard.hasNextLong()) {
				break;
			}else{
				scnKeyboard.next();
				System.out.print("¡¡FORMATO INCORRECTO (ENTERO LARGO)!! " + prompt + ":  ");
			};
		}
		return scnKeyboard.nextLong();
	}

	/**
	 * Capture a short value by keyboard
	 * @param prompt Prompt text
	 * @return A short value from the keyboard
	 */
	public static short getShort(String prompt) {
		@SuppressWarnings("resource") // I can't close the scanner. It would also close System.in
		Scanner scnKeyboard = new Scanner(System.in);
		
		System.out.print(prompt + ":  ");
		while (scnKeyboard.hasNext()) {
			if(scnKeyboard.hasNextShort()) {
				break;
			}else{
				scnKeyboard.next();
				System.out.print("¡¡FORMATO INCORRECTO (ENTERO CORTO)!! " + prompt + ":  ");
			};
		}
		return scnKeyboard.nextShort();
	}

	/**
	 * Capture a string by keyboard
	 * @param prompt Prompt text
	 * @return A string object from the keyboard
	 */
	public static String getString(String prompt) {
		@SuppressWarnings("resource") // I can't close the scanner. It would also close System.in
		Scanner scnKeyboard = new Scanner(System.in);
		String str = "";

		System.out.print(prompt + ":  ");
		while ((str = scnKeyboard.nextLine().trim()).length() == 0)// First execute the content of the 
			//internal parenthesis and evaluate it as the final value of str
			System.out.print("¡¡CADENA VACÍA!! " + prompt + ":  ");
		return str;
	}
	
	/**
	 * Capture a char by keyboard
	 * @param prompt Prompt text
	 * @return A char from the keyboard
	 */
	public static char getChar(String prompt) {
		@SuppressWarnings("resource") // I can't close the scanner. It would also close System.in
		Scanner scnKeyboard = new Scanner(System.in);
		String str = "";

		System.out.print(prompt + ":  ");
		while ((str = scnKeyboard.nextLine().trim()).length() != 1)// First execute the content of the 
			//internal parenthesis and evaluate it as the final value of str
			System.out.print((str.length() > 1) ? "!!INTRODUZCA SOLO UN CARACTER!! " : "¡¡CARACTER VACÍO!! " + prompt + ":  ");
		return str.charAt(0);
	}

}
