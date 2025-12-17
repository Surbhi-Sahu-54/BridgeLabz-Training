import java.util.Scanner;

public class CalculateSimpleInterest{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
           double Principal = sc.nextDouble();
           double Rate = sc.nextDouble();
           double Time = sc.nextDouble();

        double Simple_Interest = Principal*Rate*Time /100;

        System.out.println(Simple_Interest);
}
}


