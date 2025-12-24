import java.util.Scanner;
public class CountVowelsAndConstants{
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         System.out.println("Enter a string");
         String str = input.nextLine().toLowerCase();
          
          int vowels =0;
          int constants =0;
      
          for(int i=0; i<str.length(); i++){
          char ch = str.charAt(i);
           
           if(ch>='a' && ch<='z'){
             if(ch=='a' || ch =='e' || ch == 'i' || ch =='o' ||ch =='u'){
               vowels++;
              }
             else {
               constants++;
            }
          }
        }
        System.out.println("Number of Vowels are: " +vowels );
        System.out.println("Number of constants are:" +constants);
       input.close();
}
} 