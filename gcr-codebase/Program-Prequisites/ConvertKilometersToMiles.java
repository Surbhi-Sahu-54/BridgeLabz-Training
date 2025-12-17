import java.util.Scanner;
 
public class ConvertKilometersToMiles{
      public static void main(String[] args){
           Scanner sc= new Scanner(System.in);
              double distance = sc.nextDouble();
             
             double miles= distance*0.621371;
 
       System.out.println(miles);
}
}