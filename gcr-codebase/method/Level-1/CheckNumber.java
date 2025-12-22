import java.util.Scanner;
 
public class CheckNumber{
   public static void main(String[] args){
 Scanner input = new Scanner(System.in);

  System.out.println("Enter an integer");
   int number = input.nextInt();

   System.out . println ();

int result = checkNum(number);
 
if(result ==-1){
 System.out.println("The number " + number + "is negative");
} else if (result==1){
  System.out.println("The number " + number + " is  positive");
} else{
System.out.println("The number is zero");
}
  input.close();
}
public static int checkNum(int num){
   if(num>0){
    return 1;
 } else if(num<0){
   return -1;
} else{
 return 0;
}
}
}