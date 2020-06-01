import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        try{
            SavingsAccount saving = new SavingsAccount(100, 5);
            System.out.println("Matejoo Banking Menu:\n1: Withdraw\n2: Deposit\n3: Check balance");
            atmMenu(saving);
        }
        catch (NegativeStartingBalance e){
            System.out.println(e.getMessage());
        }

    }
    public static void atmMenu(SavingsAccount acc){
        int choice;
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice){
            case 1:
                if (acc.isActive()){
                    withdraw(acc);
                }else {
                    System.out.println("Not eligible to withdraw your account balance is below Tsh 2000");
                }
                break;
            case 2:
                deposit(acc);
                break;
            case 3:
                acc.setServiceCharge(100);
                System.out.println("Current balance: Tsh " + acc.getBalance());
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
    public static void withdraw(SavingsAccount svc){

        double amt;
        double previous_balance = svc.getBalance();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        amt = scanner.nextDouble();
        svc.accWithdraw(amt);
        svc.setServiceCharge(250);

        System.out.printf("Previous balance: Tsh %,.2f\n", previous_balance);
        System.out.printf("Service Charge: Tsh %,.2f\n", svc.getServiceCharge());
        System.out.printf("Current balance: Tsh %,.2f\n", svc.getBalance());
    }
    public static void deposit(SavingsAccount accSvc){
        double amt;
        double previous_balance = accSvc.getBalance();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        amt = scanner.nextDouble();
        accSvc.accDeposit(amt);
        System.out.printf("Previous balance: Tsh %,.2f\n", previous_balance);
        System.out.printf("Current balance: Tsh %,.2f\n", accSvc.getBalance());
    }
}
