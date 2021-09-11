public class BankAccount {

    protected double checkingBalance;
    protected double savingsBalance;

    static int numOfAccounts;

    static double totalAmount;

    public BankAccount(double checkingBalance, double savingsBalance ){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++;
    }

    public static void numberOfAccountsCreated(){
        System.out.println("The number of accounts created : " + numOfAccounts);
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void depositMoney(double deposit){
        totalAmount += deposit;
        System.out.println("The total amount after deposit is " + totalAmount);

    }

    public void totalMoneyInCheckingandSavings(){
        totalAmount = getCheckingBalance() + getSavingsBalance();
        System.out.println("The total money from checking and savings accont is :" + totalAmount);
    }

    public void withdrawMoney(double withdraw){
        if(getCheckingBalance() - withdraw < 0){
            System.out.println("total amount in checking account is :" + getCheckingBalance() + " amount to withdraw is :" + withdraw );
            System.out.println("The funds are insufficient you can not withdraw");
            return;
        }else{
            totalAmount -= withdraw;
            System.out.println("The total amount inside after withdrawal is : " + totalAmount);
        }
    }

}
