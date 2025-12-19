import java.util.Scanner;
    public class PrimeNumber{
        public static void main(String[] args){
           Scanner input = new Scanner(System.in);
           System.out.println("Enter the number");
           int num = input.nextInt();
 
           Boolean isPrime =true ;
           if(num <=1){
           isPrime = false;
           } else{
           for (int i =2 ; i<num ; i++){
           if ( num%i ==0) {
        isPrime = false;
        break;
       }
      }
     }      

       if (isPrime = true ){
         System.out.println("The number is prime ");
         } else {
         System.out.println("The number is not prime");
         }   
}
}


        