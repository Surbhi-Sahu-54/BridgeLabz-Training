import java.util.Scanner;
public class RocketLaunchFor{
      public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the countdown");
       int counter = input.nextInt();

      for(int countdown = counter; countdown>=1 ;countdown ++){
      System.out.println(countdown);
       } 
        System.out.println("Rocket Launch");
      input.close();
}
}
