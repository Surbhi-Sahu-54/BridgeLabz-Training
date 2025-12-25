// create a class ReplaceWord that replace a given word with another word in a sentene

import java.util.Scanner;
public class ReplaceWord{
     public static String replaceWord(String sentence, String oldWord, String newWord){
        return sentence.replace(oldWord, newWord);
       }
     public static void main(String[] args){
        
        // take input from user 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sentence ");
        String sentence = input.nextLine();

        System.out.println("Enter word to replace");
        String oldWord = input.next();

        System.out.println("Enter new word ");
        String newWord = input.next();
  
        String result = replaceWord( sentence , oldWord, newWord);
        System.out.println("Updated sentence: "+ result );
  
         input.close();
        }
      }



      

