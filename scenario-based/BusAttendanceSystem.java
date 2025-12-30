import java.util.Scanner;
public class BusAttendanceSystem{
   public static void main(String[]args){
   Scanner input = new Scanner(System.in);


    String[] students = new String[10];
    System.out.println("Enter the name of the students");
     for(int i=0 ; i<students.length; i++){
      System.out.println("Student"+ (i+1)+ "name");
        students [i] = input.nextLine();
    }
    int presentCount =0;
    int absentCount =0;
 
     for(String name: students){
      System.out.println(name + " -Present or Absent (P/A) ");
      char attendance = input.next().toUpperCase().charAt(0);

       if(attendance == 'P'){
       presentCount ++;
       } else if(attendance =='A'){
       absentCount++;
       } else {
       System.out.println("Invalid input");
       absentCount++;
     }
   }

   System.out.println("Total present "+ presentCount);
   System.out.println("Total absent "+ absentCount);
    input.close();
  }
}
