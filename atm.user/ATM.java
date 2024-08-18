import java.util.Scanner;
class ATM{
    private BankAccount account;

    public ATM(BankAccount account){
        this.account = account;
     }

     public void start() {
        if(!account.checkPin()){
            return;
        }
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\nWelcom to ATM !!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Current Balance : " +account.checkBalance());
                break;
                case 2:
                System.out.println("Enter the amount to withdraw :");
                double withdrawAmount = sc.nextDouble();
                if(account.withdraw(withdrawAmount)) {
                System.out.println("Withdrawal successful! Your current balance is : "+ account.checkBalance());
                } else {
                    System.out.println(" Sorry! your Withdrawal failed. Chaeck your balance and amount.");
                }
                break;
                case 3:
                System.out.println("Enter the ammount you want to deposit :");
                double depositAmount = sc.nextDouble();
                if(account.deposit(depositAmount)){
                    System.out.println("Deposit Successful ! your current balance :"+account.checkBalance());
                } else {
                    System.out.println("Deposit failed ! enter a valid amount.");
                }
                break;
                default: 
                System.out.println("Thank you for using ATM. Visit again!");
                break;
            }
        }
     }
     public static void main(String[] args){
        BankAccount myAccount = new BankAccount(2348, "1234");
        ATM atm = new ATM(myAccount);
        atm.start();
     } 
}


