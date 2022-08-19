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
            
            boolean numberInRange = false;

            System.out.println("\nLives remaining: "+lives+"\n"); //Total lives remaining
            
            while (numberInRange = false){
                
                System.out.print("Guess a number (0-9): "); //Guess number
                guessedNumber = scan.nextInt();
                
                if(guessedNumber<= 0 && guessedNumber>10){
                    numberInRange = true;
                }
                else{
                    System.out.println("Please select the correct value.");
                }
            }

           

            

            if (guessedNumber == numberAnswer){ //fixed using function prolly
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
                    
                    break; //player doesn't want to play anymore
                }
            }
            else{
 
                System.out.println("You lost the game."); //lives becomes 0
                break;
            }
            
            // scan.close();
            
        }
        
    }
}