public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount carters_account = new BankAccount();
        BankAccount richards_account = new BankAccount();
        BankAccount lakshs_account = new BankAccount();

        System.out.println(BankAccount.getAccounts());

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        carters_account.checkingDeposit(1000);
        System.out.println(carters_account.getCheckingBalance());
        richards_account.savingsDeposit(2000);
        System.out.println(richards_account.getSavingsBalance());
        lakshs_account.checkingDeposit(1500);
        System.out.println(lakshs_account.getCheckingBalance());
        // - each deposit should increase the amount of totalMoney
        System.out.println(BankAccount.getTotalMoney());
        
        richards_account.deposit(1000, "savings");
        System.out.println(richards_account.getSavingsBalance());
        System.out.println(BankAccount.getTotalMoney());

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        carters_account.withdraw(500, "checking");
        System.out.println(carters_account.getCheckingBalance());
        carters_account.withdraw(500, "savings");
        // - each withdrawal should decrease the amount of totalMoney
        System.out.println(BankAccount.getTotalMoney());
        carters_account.deposit(1000, "checking");
        // Static Test (print the number of bank accounts and the totalMoney)
        richards_account.getBalance();
        carters_account.getBalance();

    }
}
