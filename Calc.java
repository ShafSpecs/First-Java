import java.util.Scanner;

public class Calc {
  public static void main (String args[]) {
    Scanner inputOutlet = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int firstAddNum = inputOutlet.nextInt();
    System.out.print("Enter the second number: ");
    int secondAddNum = inputOutlet.nextInt();
    
    System.out.println();
    
    add(firstAddNum, secondAddNum);
    subtract(firstAddNum, secondAddNum);
    multiply(firstAddNum, secondAddNum);
    divide(firstAddNum, secondAddNum);
    
    inputOutlet.close();
  }
  
  private static void add (int firstNum, int secondNum) {
    System.out.printf("The sum of both numbers is %d%n", firstNum + secondNum);
  }
  
  private static void subtract (int firstNum, int secondNum) {
    System.out.printf("the difference of the two numbers is: %d%n", firstNum - secondNum);
  }
  
  private static void multiply (int firstNum, int secondNum) {
    System.out.printf("the product of both numbers is: %d%n", firstNum * secondNum);
  }
  
  private static void divide (int firstNum, int secondNum) {
    System.out.printf("the product of both numbers is: %d%n", firstNum / secondNum);
  }
}
