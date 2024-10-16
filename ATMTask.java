import java.util.Scanner;

public class ATMTask {
    public static void main(String[] args) {
        Bank account = new Bank(1000.00); 
        ATM atm = new ATM(account); 
        atm.menu(); 
    }

}

class Bank {
    private double balance;

    public Bank(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn $" + amount);
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            System.out.println("Invalid amount. Try again.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } 
        else {
            System.out.println("Invalid amount. Try again.");
        }
    }
}

class ATM {
    private Bank account;

    public ATM(Bank account) {
        this.account = account;
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWELCOME TO ATM...!");
            System.out.println("Services we provide:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Choose one option:");

            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("You chose to withdraw.");
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    account.withdraw(amount); 
                    break;
                }
                case 2: {
                    System.out.println("You chose to deposit.");
                    System.out.print("Enter amount to be deposited: ");
                    double amount = sc.nextDouble();
                    account.deposit(amount); 
                    break;
                }
                case 3: {
                    System.out.println("You chose to check balance.");
                    System.out.println("Current balance: $" + account.getBalance()); 
                    break;
                }
                case 4: {
                    System.out.println("Thanks for using the ATM!");
                    exit = true; 
                    break;
                }
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}
