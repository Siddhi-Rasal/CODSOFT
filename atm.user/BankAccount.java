
import java.util.Scanner;
public class BankAccount{
    double balance;
    String pin;

    public BankAccount(double initialBalance, String pin){
        this.balance = initialBalance;
        this.pin = pin;
    }

    

    public boolean checkPin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin :");
        String eneteredpin = sc.nextLine();
        if(eneteredpin.equals(pin)){
            return true;
        }
        else{
            System.out.println("Enter a valid pin");
            return false;
        }
    }
    public double checkBalance() {
        System.out.println("Balance :" +balance);
        return balance;
        }
      
    public boolean deposit(double amount)  { 
         if(amount > 0){
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw( double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }
}

