/**
* This program prints the sum of two user-selected numbers.
* 
* @author Abdur-Rahman Fashola
* @version 1.0
* @since 2022-04-10
*/

import java.util.Scanner;

public class print_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
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
        // Close the input Scanner "stream"
        input.close();
    }

    private static void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }
}