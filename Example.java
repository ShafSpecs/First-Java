import java.util.Scanner;

public class Example {
  public static void main(String[] args) {
    // request for five integers
    Scanner userInput = new Scanner(System.in);

    System.out.print("Enter five numbers: ");
    int number1 = userInput.nextInt();
    int number2 = userInput.nextInt();
    int number3 = userInput.nextInt();
    int number4 = userInput.nextInt();
    int number5 = userInput.nextInt();

    int smallest;

    int largest = 0;

    // determine the largest
    if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
      largest = number1;
    }
    if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
      largest = number2;
    }
    if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
      largest = number3;
    }
    if (number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5) {
      largest = number4;
    }
    if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4) {
      largest = number5;
    }

    System.out.println(largest);

    // determine the smallest

    // if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5) {
    //   int smallest = number1;
    // }

    // if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5) {
    //   int smallest = number2;
    // }

    // if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5) {
    //   int smallest = number3;
    // }
    // if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5) {
    //   int smallest = number4;
    // }
    // if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4) {
    //   int smallest = number5;
    // }

    // print the largest

    // print the smallest




      
      







  }

}