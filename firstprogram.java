import java.util.Scanner;

class Account {
    protected double balance;

    public Account() {
        balance = 0.0;
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }
}

class BankAccount extends Account {
    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added " + amount + " successfully.");
        } else {
            System.out.println("Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " successfully!");
        } else if (amount <= 0) {
            System.out.println("Please enter a valid withdrawal amount.");
        } else {
            System.out.println("Not enough balance in your account.");
        }
    }
}

public class firstprogram{
    public static void main(String[] args) {
        Scanner harsh = new Scanner(System.in);
        BankAccount account = new BankAccount();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            
            int choice = harsh.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to add:");
                    double addAmount = harsh.nextDouble();
                    account.addMoney(addAmount);
                    break;
                case 2:
                    System.out.println("Enter the withdrawal amount:");
                    double withdrawAmount = harsh.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    harsh.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}