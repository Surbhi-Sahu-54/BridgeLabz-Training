import java.util.Scanner;
public class FestivalLuckyDraw{
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    System.out.println("*****FESTIVAL LUCKY DRAW*****");
    System.out.println("Enter your number");
     double number = input.nextDouble();

    if(number<0){
       System.out.println("Invalid Number");
          return;
    }
    else if (number%3==0 && number%5==0){
        System.out.println(" You won a gift");
     }else {
         System.out.println("You Lost");
    }
   }
 }
 
