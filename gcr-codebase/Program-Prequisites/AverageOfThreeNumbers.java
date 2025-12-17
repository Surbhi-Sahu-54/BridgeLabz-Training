import java.util.Scanner;
public class AverageOfThreeNumbers{
public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    double first = sc.nextDouble();
    double second = sc.nextDouble();
    double third = sc.nextDouble();
   
    double Result = (first+second+third)/3;
   
      System.out.println(Result);
}
}

