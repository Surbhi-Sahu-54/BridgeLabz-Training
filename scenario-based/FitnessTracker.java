import java.util.Scanner;
public class FitnessTracker{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        int [] pushUps = new int[7];
 
     System.out.println("ENter Pushups");
     for (int i =0; i<7; i++){
     pushUps[i] = input.nextInt();
    }
     int total =0;
     int days=0;

      for(int p: pushUps){
      if(p==0){
        continue;
      }
      total = total+p;
      days = days +1;
      }

     int average = total/days;

     System.out.println("Total push-ups "+ total );
     System.out.println("Active days "+ days);
     System.out.println("Average push-ups" + average);

     input.close();
  }
}


      