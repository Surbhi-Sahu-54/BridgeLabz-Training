import java.util.Scanner;
public class TrianglePark{
    public static void main(String[] arg){
    double totalDistance = 5000 ; // in meter 
       Scanner input = new Scanner(System.in);
    
    System.out.println(" Enter side 1 ");
     double side1 = input.nextDouble();
    
System.out.println(" Enter side 2 ");
     double side2 = input.nextDouble();

   System.out.println(" Enter side 3 ");
     double side3 = input.nextDouble();
 
  double round =calculateRound(side1, side2, side3, totalDistance);

  double perimeter = side1+side2+side3;
 System.out.println ("perimeter of the park "+ perimeter + "meters");
System.out.println("One round " + perimeter + "meters");
System.out.println("Total distance to run 5km " );
System.out.println();
System.out.println("Number o rounds needed " +round);
  input.close();
}
 public static double calculateRound (double s1, double s2, double s3, double distance){
 double perimeter =s1+s2+s3;
return distance/perimeter;
}
}