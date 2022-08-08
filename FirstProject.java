import java.util.Random;
import java.util.Scanner;

    
public class FirstProject{
    
    public static void main(String[] args){

        int lives = 3;
        boolean play = true;

        while (lives!=0 && play == true){
            //Initializing the required variable
            int topNum = 10;
            int guessedNumber;

            Random randomNumber = new Random(); //Create Random object
            Scanner scan = new Scanner(System.in); //Create Scanner object

            int numberAnswer = randomNumber.nextInt(topNum); //The number that need to be guessed
            
            System.out.println("\nLives remaining: "+lives+"\n");
            
            System.out.print("Guess a number (0-9): ");
            

            guessedNumber = scan.nextInt();

            

            if (guessedNumber == numberAnswer){
                System.out.println("You guessed it!");
            }
            else{
                System.out.println("The correct answer is "+ numberAnswer);
                lives-=1; //penalty for losing
            }
            
            if(lives>0){
                System.out.print("Play again? (true/false) "); //asking whether players want to play again
                
                play = scan.nextBoolean();
                
                if (play == false){
                    
                    break;
                }
            }
            else{

                System.out.println("You lost the game.");
                break;
            }
            
            // scan.close();
            
        }
        
    }
}