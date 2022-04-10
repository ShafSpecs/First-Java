import java.util.Scanner;

public class Calculator {
  
  public static void main (String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Select CLI mode from one of the options:");
    System.out.println("1. Calculate Heat Capacity (hc)");
    System.out.println("2. Convert feet measurement to meters (feet)");
    System.out.println("3. Convert Pounds to Kilograms (lbs)");
    System.out.println("4. Convert Celsius to Fahrenheit (celsius)");
    
    System.out.print("> ");
    String mode = input.nextLine();
    triggerMode(mode, input);
  }

  private static void triggerMode (String mode, Scanner input) {
    switch (mode) {
      case "hc":
        System.out.print("Enter the mass of substance (in kilograms): ");
        double mass = input.nextDouble();
        System.out.print("Enter the initial temperature of the water (in Celcius): ");
        double initialTemp = input.nextDouble();
        System.out.print("Enter the final temperature of the water (in Celcius): ");
        double finalTemp = input.nextDouble();
        System.out.print("The energy needed to heat the water is: " + heatCapacity(mass, initialTemp, finalTemp) + "J");
        break;
      case "feet":
        System.out.print("Enter the number of feet: ");
        double feet = input.nextDouble();
        System.out.print("The number of meters is: " + feetToMeters(feet));
        break;
      case "lbs":
        System.out.print("Enter the number of pounds: ");
        double pounds = input.nextDouble();
        System.out.print("The number of kilograms is: " + poundsToKilo(pounds));
        break;
      case "celsius":
        System.out.println("Enter the number of degrees Celsius: ");
        double celsius = input.nextDouble();
        System.out.println("The number of degrees Fahrenheit is: " + celsiusToFahrenheit(celsius));
        break;
      default:
        System.out.println("Invalid option, re-try the program");
        break;
    }
  }

  private static double heatCapacity (double mass, double initialTemp, double finalTemp) {
    return mass * (finalTemp - initialTemp) * 4184;
  }

  private static double feetToMeters (double feet) {
    return feet * 0.3048;
  }

  private static double poundsToKilo (double pounds) {
    return pounds * 0.453592;
  }

  private static double celsiusToFahrenheit (double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }
}