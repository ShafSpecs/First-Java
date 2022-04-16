import java.util.Scanner;

public class InterestCalculator {
  public static void main (String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Interest Calculator 😒.");

    System.out.print("Enter the balance (principal) and annual interest rate (in percentage): $");
    float principal = input.nextFloat();
    float annualInterestRate = input.nextFloat();

    calculateInv(principal, annualInterestRate);
    input.close();
  }

  private static void calculateInv (float principal, float interestRate) {
    float interest = principal * (interestRate / 1200);
    System.out.printf("The interest is: %.4f%n", interest);
  }
}