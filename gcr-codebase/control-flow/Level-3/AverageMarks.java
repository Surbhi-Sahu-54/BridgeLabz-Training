import java.util.Scanner;
public class AverageMarks{
      public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the marks of Physics");
         int mark1 = input.nextInt();
         System.out.println("Enter the marks of Chemistry");
         int mark2 = input.nextInt();
         System.out.println("Enter the marks of Maths");
         int mark3 = input.nextInt();
 
         int total_percent = (mark1+mark2+mark3)/3;
        
         
        if( total_percent >= 80 ){
          System.out.println(" Average marks is: " +total_percent + "grade is A "+ " remark: above agency- normalized standards");
        }
        else if (total_percent>=70 || total_percent <= 79){
          System.out.println(" Average marks is: " +total_percent + "grade is B "+ " remark: at agency- normalized standards");
        }
        else if( total_percent >=60 || total_percent<=69){
          System.out.println("Average marks is: " +total_percent + "grade is C "+ " remark: below, but approaching agency- normalized standards");
        }
        else if( total_percent >=50 || total_percent<=59){
          System.out.println("Average marks is: " +total_percent + "grade is D "+ " remark: well below, agency- normalized standards");
        }
        else if( total_percent >=40 || total_percent<=49){
          System.out.println("Average marks is: " +total_percent + "grade is E "+ " remark too below, agency- normalized standards");
        }
        else{
          System.out.println(" Remedial Standards");
        }

input.close();
}
}
