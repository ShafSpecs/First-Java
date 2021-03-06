import java.util.Scanner;

public class FutureInvestmentExample {
  public static void main (String args[]) {
    System.out.println("Welcome to the Future Investment Value calculator. Enter your values to get started.");

    Scanner keyboardInput = new Scanner(System.in);
    System.out.print("Enter the investment amount: $");
    double currentInvestment = keyboardInput.nextDouble();

    System.out.print("Enter the annual interest rate in percentage: ");
    double annualInterestRate = keyboardInput.nextDouble();

    System.out.print("Enter the number of years: ");
    int numberOfYrs = keyboardInput.nextInt();

    calculateInv(currentInvestment, annualInterestRate, numberOfYrs);
    keyboardInput.close();
  }

  private static void calculateInv (double currentInv, double annualIntRate, int numOfYrs) {
    double monthlyRate = annualIntRate / 12;
    double bracketVal = monthlyRate + 1;
    double powered = Math.pow(bracketVal, numOfYrs * 12);
    double futureInvestment = currentInv * powered;
    System.out.printf("The value of your investment after %d year(s) is: %.2f%n", numOfYrs, futureInvestment);
  }
}
