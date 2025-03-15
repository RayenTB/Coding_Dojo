import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts = 0; 
    private static double totalMoney = 0.0; 
    private String accountNumber; 

    public BankAccount() {
        this.accountNumber = generateAccountNumber(); 
        accounts++;
    }

    private String generateAccountNumber() {
        Random rand = new Random();
        StringBuilder accountNum = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNum.append(rand.nextInt(10)); 
        }
        return accountNum.toString(); 
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }
        totalMoney += amount; 
    }
    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (checkingBalance >= amount) {
                checkingBalance -= amount;
                totalMoney -= amount;
            } else {
                System.out.println("Insufficient funds in checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (savingsBalance >= amount) {
                savingsBalance -= amount;
                totalMoney -= amount; 
            } else {
                System.out.println("Insufficient funds in savings account.");
            }
        }
    }

    
    public double getBalance() {
        return checkingBalance + savingsBalance; 
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Checking Balance: $" + checkingBalance);
        System.out.println("Savings Balance: $" + savingsBalance);
        System.out.println("Total Balance: $" + getBalance());
    }
}