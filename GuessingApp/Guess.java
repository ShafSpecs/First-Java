import java.util.Scanner;

public class Guess {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int mysteryNum = 7;

    System.out.println("Guess the lucky number!");
    System.out.print("The lucky number is: ");
    
    int guessedNum = input.nextInt();

    if(guessedNum > mysteryNum) {
      System.out.println("Ouch! A high guess. Too high!");
    }

    if(guessedNum == mysteryNum) {
      System.out.println("Correctly guessed!");
    }

    if(guessedNum < mysteryNum) {
      System.out.println("Too low, try again :(");
    }
  }
  
}