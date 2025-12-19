// Create a class to countdown the number to 1 for rocket launch
import java.util.Scanner;
public class RocketLaunch{
      public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the countdown");
       int counter = input.nextInt();
       
       
       while(counter>=1){
       System.out.println(counter);
         counter--;
        } 
        System.out.println("Rocket Launch");
      input.close();
}
}
         