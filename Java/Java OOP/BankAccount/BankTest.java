public class BankTest {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        System.out.println("Depositing into Account 1:");
        account1.deposit(500, "checking");
        account1.displayAccountInfo();

        System.out.println("\nDepositing into Account 2:");
        account2.deposit(1000, "savings");
        account2.displayAccountInfo();

        System.out.println("\nDepositing into Account 3:");
        account3.deposit(1000, "checking");
        account3.displayAccountInfo();

        System.out.println("\nWithdrawing from Account 1:");
        account1.withdraw(1000, "checking");
        account1.displayAccountInfo();

        System.out.println("\nWithdrawing from Account 2:");
        account2.withdraw(1000, "savings");
        account2.displayAccountInfo();

        System.out.println("\nWithdrawing from Account 3:");
        account3.withdraw(1000, "checking"); 
        account3.displayAccountInfo();

        System.out.println("\nTotal number){
          }
}
        
    
    
    
