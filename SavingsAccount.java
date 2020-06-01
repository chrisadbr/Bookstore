public class SavingsAccount extends BankAccount{
    private boolean status = false;
    public SavingsAccount(double blc, double interest) {
        super(blc, interest);
    }
    public boolean isActive(){
        if (this.getBalance() >= 2000){
            status = true;
        }else
            status = false;
       return status;
    }
}
