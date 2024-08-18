import java.util.Random;
import java.util.Scanner;
public class Number_Game{
    public static void main(String[] args) {
        
    Random rand = new Random();
    int min = 1;
    int max = 101;
    int randomNumber = rand.nextInt(max - min) + min;
    System.out.println(randomNumber);

    boolean playAgain = true;
    int score = 0;
    System.out.println("Welcome to Number Game !!");
;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your guess between 1-100 :");
    int n = sc.nextInt();

    if(n>100){
        System.out.println("Guess is invalid");
        return;
    }
    
}
}