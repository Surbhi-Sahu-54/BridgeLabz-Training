import java.util.Scanner;
public class PerimeterOfRectangle{
  public static void main(String[]args){
      Scanner sc= new Scanner (System.in);
     double Length= sc.nextDouble();
     double Width = sc.nextDouble();

double Result= 2*(Length+Width);

System.out.println(Result);
}
}