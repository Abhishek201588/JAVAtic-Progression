import java.util.Scanner;

public class BankAccount{
    String name, address, accountNum;
    double balance;

    BankAccount() {
        this.name = null;
        this.address = null;
        this.accountNum = null;
        this.balance = 0.0;
    }

    BankAccount(String name, String address, String accountNum) {
        this.name = name;
        this.address = address;
        this.accountNum = accountNum;
        this.balance = 0.0;
    }

    static void deposit(BankAccount account, double deposit) {
        account.balance+=deposit;
    }

    static void withdraw(BankAccount account, double withdrawal){
        if (account.balance >= withdrawal){
            account.balance -= withdrawal;
            System.out.printf("Withdrawn %.2f from account. Available Balance: %.2f",withdrawal,account.balance);
            System.out.println("");
        }
        else{
            System.out.println("Low Balance. Widrawn Overruled");
        }
    }

    static void showDetails(BankAccount account){
        System.out.println("Name: "+account.name);
        System.out.println("Address: "+account.address);
        System.out.println("Account Number: "+account.accountNum);
        System.out.println("Balance: "+account.balance);
    }

    public static void main(String[] args) {
    	String name, address, accountNum;
    	double balance;
        Scanner input = new Scanner(System.in);
        BankAccount[] accounts = new BankAccount[10];                                          
        int pos = 0;                                                                           
        int c=1;                                                                               
        while(c != 0){
            System.out.println("Enter your choice:");
            System.out.println("  1.Create an account\n  2.Use an existing account");
            int choice1 = input.nextInt();
            switch (choice1) {
                case 1:System.out.println("Enter your name: ");                                 
                    name = new Scanner(System.in).nextLine();
                    System.out.println("Enter your address: ");
                    address = new Scanner(System.in).nextLine();
                    accountNum = "5290201000269"+String.valueOf(pos);
                    accounts[pos] = new BankAccount(name, address, accountNum);
                    System.out.println("------------------------Details------------------------");
                    showDetails(accounts[pos]);
                    pos++;
                    break;

                case 2:System.out.println("Enter the account number: ");                   
                    String number = new Scanner(System.in).nextLine();
                    int flag=0, index=0;
                    for(int i = 0; i < pos; i++){
                        if (accounts[i].accountNum.equals(number) && accounts[i].accountNum != null){
                            flag=1;
                            index=i;
                        }
                    }
                    if(flag == 0){
                        System.out.println("No Account found in this information");
                    }
                    else
                    {
                        int choice2=0;
                        System.out.println("-------------------Entering Account: "+number+"----------------");
                        while(choice2!=4)
                        {
                            System.out.println("\nWhat do you want to choose");
                            System.out.println("  1.Deposit an amount\n  2.Withdraw an amount\n  3.Show Account Details\n  4.Exit Account");
                            choice2 = new Scanner(System.in).nextInt();
                            switch (choice2){
                                case 1:System.out.print("Enter your deposit amount: ");
                                    double depositAmount = input.nextDouble();
                                    deposit(accounts[index], depositAmount);
                                    System.out.println("Amount Deposited In Your Account");
                                    break;

                                case 2:System.out.print("Enter the amount you want to withdraw: ");
                                    double withdrawal = input.nextDouble();
                                    withdraw(accounts[index], withdrawal);
                                    break;

                                case 3:showDetails(accounts[index]);
                                    break;

                                case 4:System.out.println("Exiting Account "+number);
                                    break;

                                default:System.out.println("Invalid input");
                                    break;
                            }
                        }
                    }
                    break;

                default:System.out.println("Invalid input");
                    break;
            }
            System.out.println("Do you want to continue? Enter 1 for Yes, 0 for No");
            c = input.nextInt();
        }
    }
}