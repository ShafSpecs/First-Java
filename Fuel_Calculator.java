import java.util.Scanner;

public class Fuel_Calculator {
  public static void main (String args []) {
    float mpg, pricePerGallon, distance;

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the distance of the trip: ");
    distance = keyboard.nextFloat();

    System.out.print("Enter the number of miles the car travels per gallon of fuel: ");
    mpg = keyboard.nextFloat();

    System.out.print("Enter the price per gallon of fuel: ");
    pricePerGallon = keyboard.nextFloat();

    calculateEfficiency(mpg, pricePerGallon, distance);
    keyboard.close();
  }

  private static void calculateEfficiency (float mpg, float ppg, float distance) {
    float cost = (distance / mpg) * ppg;
    System.out.printf("The cost of the trip is $%.2f%n", cost);
  }
}