// create a class FrequentCharacter to find the most frequency character in string 
import java.util.Scanner;
public class FrequentCharacter{
       public static void main(String [] args){

          //take input from user
           Scanner input = new Scanner(System.in);
           System.out.println("Enter string");
            String str = input.nextLine();
 
           int[] frequency = new int[256];
            for (int i=0; i<str.length();i++){
              frequency[str.charAt(i)]++;
            }
          char mostFrequentChar = ' ';
           int maxCount=0;

         for(int i =0; i< 256; i++){
            if(frequency [i] >maxCount){
              maxCount =frequency[i];
              mostFrequentChar = (char)i;
            }
           } 

        System.out.println("Most Frequent character " + mostFrequentChar );
       }
     }
