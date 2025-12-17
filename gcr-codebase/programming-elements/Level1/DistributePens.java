// Creating a program to distribute equal pens among 3 students and also calculate the //remaing non-distributed pens 
 
public class DistributePens{
   public static void main(String[] args){
     int total_pen =14;
     int total_student =3;
     
   int pen_per_student = total_pen/ total_student;   // divide total pen by total student to get the number of pen per person
   int remaining_pen = total_pen% total_student;   //  total pen modulo total student to get remaining pen 
      
System.out.println("The pen per Student is " + pen_per_student + " and the remaining  pen not distributed is " + remaining_pen);
}
}

       
