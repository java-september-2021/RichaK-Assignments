public class BankAccountController {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(20000, 25000);
        BankAccount account2 = new BankAccount(40000, 55000);
        double savingBalance  = account1.getSavingsBalance();
        account1.getCheckingBalance();
        double checkingBalance  = account1.getCheckingBalance();
        System.out.println("Checking account balance is : " +  checkingBalance );
        System.out.println("Saving account balance is : " +  savingBalance );
        BankAccount.numberOfAccountsCreated();
        account1.totalMoneyInCheckingandSavings();
        account1.withdrawMoney(100);
        account1.depositMoney(300);
        //Insufficient fund test
        account1.withdrawMoney(90000);


    }
}
