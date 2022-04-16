import java.util.Scanner;

public class CoumpoundInterest {
  public static void main (String args[]) {
    Scanner keyboardInput = new Scanner(System.in);
    System.out.print("Enter the monthly savings amount: $");
    double monthlySavings = keyboardInput.nextDouble();


  }

  private static void calculateMonthlyInterest(double monthlySavings) {
    double interest = 5/12;

    for (int i = 0; i < 12; i++) {
      monthlySavings = monthlySavings + (monthlySavings * (1 + interest));
    }
    System.out.printf("The monthly compound interest after %d month is %.2f", monthlySavings);
  }
}
