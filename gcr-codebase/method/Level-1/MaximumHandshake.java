// create a class MaximumHandshake to find the maximum number of hanshake among students 

import java.util.Scanner;

public class MaximumHandshake{

    // create a method to calculate maximum handshake
    public static int calculateHandshake(int numberOfStudents){
    return( numberOfStudents * (numberOfStudents -1)) /2;
    }
  
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the number of student");
     int numberOfStudents = input.nextInt();
      
     if(numberOfStudents < 0){
        System.out.println("Number of students cannot be negative");
       } else {
        int handshake = calculateHandshake(numberOfStudents);

       System.out.println("number of possible handshakes" + handshake);
     }
     input.close();
}
}
        
