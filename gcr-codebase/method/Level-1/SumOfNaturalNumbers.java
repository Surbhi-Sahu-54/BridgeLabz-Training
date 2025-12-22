import java.util.Scanner;
 
public class SumOfNaturalNumbers{
    public static int calculateSum(int n){
        int sum =0;
        for(int i=0; i<=n;i++){
           sum = sum+i;
   }
 return sum;
}
public static void main(String[] args);
  Scanner input =new Scanner(System.in);

System.out.println(" Enter number ");
    int num = input.nextInt();
     if(num<=0){
     System.out.println("Enter a positive number");
    } else {
   int result = calculateSum(num);
   System.out.println("Sum of first " +num + "Natural number is " + result );
}
 input.close();
}
}