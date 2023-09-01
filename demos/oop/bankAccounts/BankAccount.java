public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts

    public BankAccount() {
        BankAccount.accounts++;
    }


    // GETTERS
    // for checking, savings, accounts, and totalMoney

    public static int getAccounts(){
        return BankAccount.accounts;
    }

    public static double getTotalMoney(){
        return BankAccount.totalMoney;
    }


    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }


    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void checkingDeposit(double amount){
        this.checkingBalance += amount;
        BankAccount.totalMoney += amount;
    }
    
    public void savingsDeposit(double amount){
        this.savingsBalance += amount;
        BankAccount.totalMoney += amount;
    }

    public void deposit(double amount, String type){
        if(type == "checking"){
            this.checkingBalance += amount;
        } else if(type == "savings") {
            this.savingsBalance += amount;
        }
        BankAccount.totalMoney += amount;

    }

    public void withdraw(double amount, String type){
        if(type == "checking"){
            if(this.checkingBalance >= amount){
                this.checkingBalance -= amount;
                BankAccount.totalMoney -= amount;
            } else {
                System.out.println("insufficient funds");
            }
        } else if(type == "savings") {
            if(this.savingsBalance >= amount){
                this.savingsBalance -= amount;
                BankAccount.totalMoney -= amount;
            } else {
                System.out.println("insufficient funds");
            }
            
        }

    }


    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney



    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance(){
        System.out.printf("Your total balance is: $%.2f\n", this.checkingBalance + this.savingsBalance);
    }
}
