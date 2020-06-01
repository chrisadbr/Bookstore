public class NegativeStartingBalance extends Exception{

    public NegativeStartingBalance(){
        super("Error: Negative starting balance");
    }
    public NegativeStartingBalance(double amt){
        super("Error: Negative starting balance " + amt);
    }
}
