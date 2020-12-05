import java.util.Scanner;

class Account {
  String name;
  int account_no;
  double balance;
  Account(String name, int account_no){
    this.name = name;
    this.account_no = account_no;
    this.balance = 0.00;
  }
  void deposit(double amount) {
    this.balance += amount;
    System.out.println(amount + " deposited to your account");
    this.display();
    if(this instanceof CurrentAccount){
      ((CurrentAccount)this).penalty();
    }
    else{
      ((SavingsAccount)this).interest();
    }
  }

  void display(){
    System.out.println("Your account balance is " + this.balance);
  }

  void withdraw(double amount){
    if(this.balance < amount){
      System.out.println("Insufficient Balance");
      return;
    }
    this.balance -= amount;
    System.out.println(amount + " withdrawn from your account");
    if(this instanceof CurrentAccount){
      ((CurrentAccount)this).penalty();
    }
    else{
      ((SavingsAccount)this).interest();
    }
    this.display();

  }
}

class SavingsAccount extends Account{
  SavingsAccount(String name, int account_no){
    super(name, account_no);
  }

  void interest(){
    double inter = 0.03*this.balance;
    System.out.println("Interest amount is: " + inter);
    this.balance += inter;
    this.display();
  }
}

class CurrentAccount extends Account{
  CurrentAccount(String name, int account_no){
    super(name, account_no);
  }

  void penalty(){
    if(this.balance < 1000){
      System.out.println("Your account balance is less than 1000");
      System.out.println("Penalty deducted");
      if(this.balance < 100){
        this.balance = 0;
      }
      else{
        this.balance -= 100;
      }
    }
  }
}

public class Qstn8 {
  public static void main(String[] args) {
    Account acc[] = new Account[10];
    int i = 1;
    Scanner sc = new Scanner(System.in);
    boolean quit = true;
    do{
      System.out.println("\nEnter 1 for new Account: ");
      System.out.println("Enter 2 for deposit: ");
      System.out.println("Enter 3 for Withdraw: ");
      System.out.println("Enter 0 to Quit: ");

      System.out.print("Enter any option: ");
      switch (sc.nextInt()) {
        case 1:{ System.out.print("\nEnter the name of the Account Holder: ");
              String n = (new Scanner(System.in)).nextLine();
              System.out.print("Press 1 for Savings Account or Press 2 for Current account: ");
              int inp = sc.nextInt();
              if (inp == 1) {
                acc[i] = new SavingsAccount(n, i);
              }
              else if(inp == 2){
                acc[i] = new CurrentAccount(n, i);
              }
              else{
                System.out.println("Invalid Input");
                break;
              }
              System.out.println("\nYour Account had been created");
              System.out.println("Your account number is " + i);
              i += 1;
              break;
            }
        case 2:{ System.out.print("\nEnter the account number: ");
                int a = sc.nextInt();
                if(a >= i){
                  System.out.println("Enter a valid Account Number: ");
                  break;
                }
                System.out.print("\nEnter the amount to deposit: ");
                int am = sc.nextInt();
                acc[a].deposit(am);
                break;
              }
       case 3: {System.out.print("\nEnter the account number: ");
               int a = sc.nextInt();
               if(a >= i){
                 System.out.println("Enter a valid Account Number: ");
                 break;
               }
               System.out.print("\nEnter the amount to withdraw: ");
               int am = sc.nextInt();
               acc[a].withdraw(am);
               break;
             }
        case 0:{ quit = false;
              break;
            }
        default: System.out.println("\nEnter a valid option!!!!");
      }
    } while (quit);
  }
}