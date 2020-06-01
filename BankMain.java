import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        SavingsAccount saving = new SavingsAccount(12000, 5);
        System.out.println("Matejoo Banking Menu:\n1: Withdraw\n2: Deposit\n3: Check balance");
        atmMenu(saving);
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        amt = scanner.nextDouble();
        svc.accWithdraw(amt);
        svc.setServiceCharge(250);
        System.out.println(svc.getBalance());
    }
    public static void deposit(SavingsAccount accSvc){
        double amt;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        amt = scanner.nextDouble();
        accSvc.accDeposit(amt);
        System.out.println("Current balance: Tsh " + accSvc.getBalance());
    }
}
