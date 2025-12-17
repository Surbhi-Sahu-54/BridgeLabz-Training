import java.util.Scanner;

public class VolumeOfCylinder{
   public static void main(String[] args){
     Scanner sc= new Scanner(System.in);
          double Radius= sc.nextDouble();
          double Height= sc.nextDouble();
 
      double Volume = 3.14*Radius *Radius*Height;

      System.out.println(Volume);
}
}