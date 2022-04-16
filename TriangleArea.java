import java.util.Scanner;

public class TriangleArea {
  public static void main (String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Triangle Area Calculator.");

    System.out.print("Enter the coordinates of the first point: ");
    float x1 = input.nextFloat();
    float y1 = input.nextFloat();

    System.out.print("Enter the coordinates of the second point: ");
    float x2 = input.nextFloat();
    float y2 = input.nextFloat();

    System.out.print("Enter the coordinates of the third point: ");
    float x3 = input.nextFloat();
    float y3 = input.nextFloat();

    calculateArea(x1, y1, x2, y2, x3, y3);
    input.close();
  }

  private static void calculateArea (float x1, float y1, float x2, float y2, float x3, float y3) {
    double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
    double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

    double s = (side1 + side2 + side3) / 2;
    double area = (double) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    System.out.printf("The area of the triangle is: %.2f%n", area);
  }
}
