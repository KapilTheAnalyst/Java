package p37_exercise_guess_the_number;

import java.util.Random ;
import java.util.Scanner ;
class Game{
    int    userNumber ;
    int computerNumber ;
    int guesses = 0;
    public Game(){
        Random r = new Random() ;
        computerNumber = r.nextInt(100)+ 1 ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Guess a number from 1 to 100: ") ;
        userNumber = sc.nextInt() ;
        System.out.println("Computer number be: " + computerNumber) ;
        isCorrect();
    
    }
    public void setGuesses(){
        guesses = guesses +1 ;

    }
    public int getGuesses(){
        return guesses ;
    }

    public void isCorrect(){

        if(userNumber==computerNumber){
            // return true ;
            System.out.println("Your guess correct number. "+ "Your score is "+ getGuesses());
            
            
        }
        else if(userNumber > computerNumber){
        
            System.out.println("Your number is Greater number") ;
            setGuesses() ;
            Scanner sc1 = new Scanner(System.in) ;
            System.out.println("Guess a  number from 1 to 100 again: ") ;
            userNumber = sc1.nextInt() ;
            isCorrect() ;

        }
        else if(userNumber <computerNumber){
            System.out.println("Your number is smaller") ;
            setGuesses() ;
            Scanner sc2 = new Scanner(System.in) ;
            System.out.println("Guess a number from 1 to 100 again: ") ;
            userNumber = sc2.nextInt() ;
            isCorrect() ;


        }
    }

    
    

}

public class guess_a_number {
    public static void main(String [] args){
        /*
        create a class Game, which allows a user to play
        "Guess the Number". Game should have the following methods:
        1. Constructor to generate a random number
        2. takeUserInput()  to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getters and settersfor noOfGuesses
        5.Use properties such as numberOfGuesses(int) , etc to get this tasks done
        */

        Game g = new Game() ;

    }

    
}

// javac p37_exercise_guess_the_number/guess_a_number.java
// java p37_exercise_guess_the_number/guess_a_number
