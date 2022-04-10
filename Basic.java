/**
* This program prints the result of two string's concatenation or sum of two user-selected numbers!
* 
* @author Abdur-Rahman Fashola
* @version 1.0
* @since 2022-04-10
*/

import java.util.Scanner;

public class Basic {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to select a mode for the CLI
		System.out.print("Select mode (\"Concat Strings\" or \"Add Numbers\"): ");

		// Store the choice in a variable
		String modePrompt = input.nextLine();
		// Run the program based on the user's choice
		String mode = selectMode(modePrompt);

		if (mode == "concat") {
			// Prompt user for a string input
			System.out.printf("Enter a string to concatenate: ");
			// Register the input and store in a var
			String str1 = input.nextLine();

			// Prompt user for a second string..
			System.out.printf("Enter another string: ");
			// Store the second value in another var
			String str2 = input.nextLine();

			// Invoke the `concatStrings` method to add and print the sum
			concatStrings(str1, str2);
			// Close the input Scanner stream
			input.close();
		} else if (mode == "add") {
			// Prompt user for a number input
			System.out.printf("Enter a number: ");
			// Register the input and store in a var
			int num1 = input.nextInt();

			// Prompt user for a second number..
			System.out.printf("Enter another number: ");
			// Store the second value in another var
			int num2 = input.nextInt();

			// Invoke the `calculateSum` method to add and print the sum
			calculateSum(num1, num2);
			// Close the input Scanner stream
			input.close();
		} else {
			System.out.println("Invalid option, re-try the program");
			input.close();
		}
	}

	private static String selectMode(String mode) {
		if (mode.contains("Concat Strings")) {
			return "concat";
		} else if (mode.contains("Add Numbers")) {
			return "add";
		} else {
			return "Invalid option";
		}
	}

	private static void calculateSum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}

	private static void concatStrings(String str1, String str2) {
		String concat = str1 + " " + str2;
		System.out.println(concat);
	}
}