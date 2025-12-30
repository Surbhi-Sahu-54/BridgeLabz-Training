/*
. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.util.Scanner;
public class LibraryReminderApp{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int finePerDay=5;

    for(int i =1; i<5; i++){
    System.out.println("Book "+ i);
 
   System.out.println("Enter due date (number of days) ");
     int dueDate = input.nextInt();

    System.out.println("Enter return date(number of days)");
     int returnDate = input.nextInt();

    if(returnDate>dueDate){
     int lateDays= returnDate -dueDate;
     int fine = lateDays*finePerDay;
     System.out.println("Book returned late by " + lateDays );
     System.out.println("Fine to be paid " +fine);
   }else{
     System.out.println("Book return on time ");
     System.out.println("********************");
   }
}
    input.close();
 }
}