public class AlphaWhile {

	public static void main(String[] args) {

		char character = 'A';

		// Display Upper Case Alphabets
		System.out.print("Upper Case Alphabets Displayed \n");
		while (character <= 'Z') {
			System.out.print(character + " ");
			character++;
		}

		System.out.print("\n\n");// move to next line

		// Display Lower Case Alphabets
		character = 'a';
		System.out.print("Lower Case Alphabets Displayed \n");
		while (character <= 'z') {
			System.out.print(character + " ");
			character++;
		}
	}
}