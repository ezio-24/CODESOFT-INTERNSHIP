package NumberGame;
import java.util.*;

public class NumberGame{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
       

        boolean playAgain = true;

        while(playAgain){
               int randomNumber = random.nextInt(100)+1;
               int attempts = 0;
               boolean guessedCorrectly = false;

               while(!guessedCorrectly && attempts < 5){
                attempts++;
                System.out.println("Guess a number between 1 and 100");
                int userGuess = s.nextInt();

                if(userGuess == randomNumber){
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    score++;  
                }else if(userGuess < randomNumber){
                   
                    System.out.println("\u001B[31m Too low. Try again\u001B[0m");

                }else{
                    // System.out.println("Too high. Try again.");
                    System.out.println("\u001B[33m Too high. Try again.\u001B[0m");
                }
               }

               if(!guessedCorrectly){
                System.out.println("You ran out of guesses. The correct number was: " + randomNumber);
               }
               System.out.println("Your current score is:  \u001B[32m" + score + "\u001B[0m") ;
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = s.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for playing!");
        s.close();
   }
}