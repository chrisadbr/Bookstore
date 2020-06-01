public abstract class BankAccount {

    private double balance;
    private int number_of_deposits = 0;
    private int number_withdrawals = 0;
    private double annual_interest;
    private double service_charge;

    public BankAccount(double blc, double interest){
        balance = blc;
        annual_interest = interest;
    }
    public void accDeposit(double amt){
        balance += amt;
        number_of_deposits++;
    }
    public void accWithdraw(double amt){
        balance -= amt;
        number_withdrawals++;
    }
    public void setServiceCharge(double svc){
        service_charge = svc;
    }
    public double getServiceCharge(){
        return service_charge;
    }
    public void calcInterest(double ints){

        annual_interest = ints;
        double monthly_interest_rate, monthly_balance;
        monthly_interest_rate = annual_interest / 12;
        monthly_balance = balance * monthly_interest_rate;
        balance = balance + monthly_balance;
    }
    public void monthlyProcess(BankAccount bank){

        balance -= this.getServiceCharge();
        bank.number_withdrawals = 0;
        bank.service_charge = 0;
        bank.number_of_deposits = 0;
    }
    public double getBalance(){
        return balance - getServiceCharge();
    }
}
