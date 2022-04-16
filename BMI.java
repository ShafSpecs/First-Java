import java.util.Scanner;

public class BMI {
  public static void main (String args[]) {
    Scanner keyboardInput = new Scanner(System.in);
    System.out.print("Welcome to the Body Mass Index Calculator. Enter weight in pounds: ");
    double weight = keyboardInput.nextDouble();

    System.out.print("Enter height in inches: "); 
    double height = keyboardInput.nextDouble();

    double weightKilo = weight * 0.45359237;
    double heightMeter = height * 0.0254;

    double bmi = weightKilo / (heightMeter * heightMeter);
    System.out.printf("Your BMI is %.2f%n", bmi);
    keyboardInput.close();
  }
}
