import java.util.Scanner;
public class AccountTest {
  public static void main(String[] args) {
    Account account1 = new Account("Jane Green", 20);
    Account account2 = new Account("John Blue", -7.53);

    getBalance(account1);
    getBalance(account2);

    setDeposit(account1);
    setDeposit(account2);

    getBalance(account1);
    getBalance(account2);
  }

  public static void getBalance (Account account3) {
    System.out.printf("%s balance: %.2f%n", account3.getName(), account3.getBalance());
  }

  public static void setDeposit (Account account3) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter deposit amount for account1: ");
    double depositAmount = input.nextDouble();
    System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
    account3.deposit(depositAmount);
  }
}