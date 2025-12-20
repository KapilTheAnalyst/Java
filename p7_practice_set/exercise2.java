
// Write a java program to calculate CGPA using marks of three subjects (out of 100)

package p7_practice_set ;

import java.util.Scanner;
class exercise2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter marks of subject 1:");
        int marks1 = sc.nextInt();

        System.out.println("Enter marks of subject 2:");
        int marks2 = sc.nextInt();

        System.out.println("Enter marks of subject 3:");
        int marks3 = sc.nextInt();

        float total = marks1 + marks2 + marks3 ;

        float percent = (total/300)*100 ;

        float CGPA = percent/10 ;

        System.out.println("Student got a CGPA of: " + CGPA);



    }
}