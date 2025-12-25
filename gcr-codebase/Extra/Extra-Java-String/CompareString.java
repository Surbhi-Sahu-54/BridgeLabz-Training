import java.util.Scanner;
public class CompareString{
      public static void main(String[] args){
         Scanner input = new Scanner(System.in);
          System.out.println("Enter first string");
          String s1 = input.nextLine();

          System.out.println("Enter second string");
          String s2 = input.nextLine();
   
          int minLength = Math.min(s1.length(), s2.length());
            Boolean isDifferent =false;
 
          for(int i=0; i<minLength; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
 
           if(c1<c2){
            System.out.println(s1 + "comes before " + s2 + "in lexicographical order");
            isDifferent =true;
            break;
            }else if (c1>c2){
             System.out.println(s1 +"comes after " + s2 + " in Lexicographical order ");
              isDifferent = true;
               break;          
             }
          }

          if(!isDifferent){
            if(s1.length()<s2.length ()){
            System.out.println(s1 + "comes before " +s2 + "in lexicographical order");
              } else if (s1.length()>s2.length()){
             System.out.println(s1 +"comes after " +s2 + " in Lexicographical order");
             }else {
            System.out.println("Both Strings are equal");
            }
          }
        }
      }
                  



