import java.util.Random;
import java.util.Scanner;

    
public class FirstProject{
    public static void main(String[] args){
        //Initializing the required variable
        int topNum = 100;
        int guessedNumber;

        Random randomNumber = new Random(); //Create Random object
        Scanner scan = new Scanner(System.in); //Create Scanner object

        int numberAnswer = randomNumber.nextInt(topNum); //The number that need to be guessed
        System.out.print("Guess a number: ");
        guessedNumber = scan.nextInt();

        scan.close();

        if (guessedNumber == numberAnswer){
            System.out.println("Wahoo");
        }
        else{
            System.out.println("The correct answer is "+ numberAnswer);
        }
    }
}