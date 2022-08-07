import java.util.Random;
import java.util.Scanner;

    
public class FirstProject{
    
    public static void main(String[] args){

        while (true){
            //Initializing the required variable
            int topNum = 100;
            int guessedNumber;

            Random randomNumber = new Random(); //Create Random object
            Scanner scan = new Scanner(System.in); //Create Scanner object

            int numberAnswer = randomNumber.nextInt(topNum); //The number that need to be guessed
            System.out.print("Guess a number (1-99): ");
            guessedNumber = scan.nextInt();



            if (guessedNumber == numberAnswer){
                System.out.println("Wahoo");
            }
            else{
                System.out.println("The correct answer is "+ numberAnswer);
            }

            System.out.println("Play again? (true/false)");    
            boolean play = scan.nextBoolean();
            if (play == false){
                break;
            }
            
        }
        
    }
}