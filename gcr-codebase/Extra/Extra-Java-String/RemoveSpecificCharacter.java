// create a class RemoveSpecificCharacter to remove all occurence of a specific character from a string 

import java.util.Scanner;
public class RemoveSpecificCharacter{
        public static void main(String[] args){
        
            //take input from user
            Scanner input = new Scanner(System.in);
            System.out.println("Enter string ");
            String str= input.nextLine();
            System.out.println("Enter charater to remove");
            char ch = input.next().charAt(0);

           String result =" ";
 
           for(int i=0; i<str.length(); i++){
              if(str.charAt(i)!= ch){
               result += str.charAt(i);
            }
          }
       System.out.println("Modified String " + result );
      }
    }