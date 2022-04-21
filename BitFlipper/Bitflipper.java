import java.util.Scanner;

public class Bitflipper {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter either 1 or 0: ");
    int bit = input.nextInt();

    if (bit == 1){
      System.out.println("Your bit is 0.");
    } 
    
    if (bit == 0) {
      System.out.println("Your bit is 1.");
    } 
    // System.out.println("Invalid input.");
    input.close();
  }
}