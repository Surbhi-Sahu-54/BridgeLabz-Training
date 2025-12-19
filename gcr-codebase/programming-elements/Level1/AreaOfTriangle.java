import java.util.Scanner;
public class AreaOfTriangle{
 public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the base of triangle");
     double base = sc.nextDouble();
     System.out.println("Enter the height of triangle");
     double height =sc.nextDouble();
  
     double resultArea = 1/2 *base*height ;
   System.out.println("Area Of Triangle is "+ resultArea );
}
}