// Write a java program to calculate percentage of a given student in CBSE board exam .
// His marks from 5 subjects must be take as input from the keyword (marks are out of 100)

package p6_exercise_1;

import java.util.Scanner;
public class exercise{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student marks in English") ;
        int eng = sc.nextInt();

        System.out.println("Enter student marks in Physics");
        int phy = sc.nextInt();

        System.out.println("Enter student marks in Maths") ;
        int math = sc.nextInt() ;

        System.out.println("Enter student marks in chemistry");
        int chem = sc.nextInt();

        System.out.println("Enter student marks in Physical Education");
        int pedu = sc.nextInt();


        float total = eng+phy+math+chem+pedu ;
        System.out.println("Student percentage be: " + (total/500)*100 + "%") ;

        // System.out.println((total/500)*100) ;


    }
}