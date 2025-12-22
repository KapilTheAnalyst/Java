package p18_exercise;


import java.util.Random ;
import java.util.Scanner ;
public class exercise {
    public static void main(String [] args){

        // Design a rock , paper , scissors

        Random r = new Random() ;
        int num = r.nextInt(3) ;
        


        String computer = "" ;


        switch(num){
            case 0 ->{
                computer = "Rock" ;
            }
            case 1 ->{
                computer = "Paper" ;
            }
            case 2->{
                computer="Scissor" ;

            }

        }

        Scanner sc= new Scanner(System.in);
        System.out.println("Choose a number for \n 1. Rock \n 2. Paper \n 3. Scissor ");
        int num1 = sc.nextInt();

        String user = "" ;

        switch(num1){
            case 1 ->{
                user = "Rock" ;
            }
            case 2 ->{
                user = "Paper" ;
            }
            case 3->{
                user="Scissor" ;

            }

        }




        
        int count = 0 ;
        int user_count = 0 ;
        int computer_count = 0;

        while(count <2){
        if(computer == "Rock" && user =="Scissor"){
            System.out.println("Computer win") ;
            System.out.println("user be " + user + " computer be " + computer) ;
            System.out.println("Count be " + count) ;
            count++ ;
            computer_count++ ;
        }
        else if( computer =="Rock" && user=="Paper"){
            System.out.println("You  win");
            System.out.println("user be " + user + " computer be " + computer) ;
            System.out.println("Count be " + count) ;
            count++ ;
            user_count++;
        }
        else if(computer =="Paper" && user=="Rock"){
            System.out.println("Computer win");
            System.out.println("user be " + user + " computer be " + computer) ;
            System.out.println("Count be " + count) ;
            count++ ;
            computer_count++;
            
        }
        else if(computer =="Paper" && user=="Scissor"){
            System.out.println("You win");
            System.out.println("user be " + user + " computer be " + computer) ;
            System.out.println("Count be " + count) ;
            count++ ;
           
            user_count++ ;
        }
        else if(computer =="Scissor" && user=="Rock"){
            System.out.println("You win ");
            System.out.println("user be " + user + " computer be " + computer) ;
            System.out.println("Count be " + count) ;
            count++ ;
            
            user_count++;
        }
        else if(computer =="Scissor" && user =="Paper"){
            System.out.println("Computer win") ;
            System.out.println("user be " + user + " computer be " + computer) ;
            System.out.println("Count be " + count) ;
            count++ ;
            
            computer_count++ ;
        }
        else if(computer==user){
            System.out.println("Tie") ;
            System.out.println("user be " + user + " computer be " + computer) ;
            System.out.println("Count be " + count) ;
            count++ ;
            
        }

        else{
            System.out.println("Check for another condition");
            System.out.println("user be " + user + " computer be " + computer) ;
            System.out.println("Count be " + count) ;
            count++ ;
        }
        
        System.out.println("Choose a number again for \n 1. Rock \n 2. Paper \n 3. Scissor ");
         num1 = sc.nextInt();

        user = "" ;

        switch(num1){
            case 1 ->{
                user = "Rock" ;
            }
            case 2 ->{
                user = "Paper" ;
            }
            case 3->{
                user="Scissor" ;

            }

        }
        


    }

    if(computer_count > user_count){
        System.out.println("Overal Computer win") ;
    }
    else{
        System.out.println("Overall User win") ;
    }


    }
    
}
