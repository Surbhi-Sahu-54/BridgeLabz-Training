import java.util.Scanner;
public class CurrencyExchangeKiosk{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double convertedAmount=0;
      char choice;

      do {
          System.out.println("===== Currency Exchange Kiosk =====");
          System.out.println("Enter Amount in INR ");
            double amount = input.nextDouble();
          System.out.println("---------------------------- ");
          System.out.println(" Choose Country-currency");
          System.out.println("1. America - USD ");
          System.out.println("2. Europe - EUR ");
          System.out.println("3. United Kingdom - GBP ");
          System.out.println("4. Japan - JPY");
          System.out.println("5. Australia -AUD");
          System.out.println("---------------------------- ");

         System.out.println("Enter your choice");
      
         int currencyChoice = input.nextInt();
      
   
     switch (currencyChoice) {
                case 1:
                      convertedAmount = amount *91.5; 
                      System.out.println(" Converted Amount in USD "+ convertedAmount );
                      break;

                case 2:
                      convertedAmount = amount * 108.0; 
                      System.out.println(" Converted Amount in EUR "+ convertedAmount);
                      break;

                case 3:
                      convertedAmount = amount * 121.2; 
                      System.out.println("Converted Amount in EUR "+ convertedAmount);
                      break;
                case 4:
                      convertedAmount = amount * 0.59; 
                      System.out.println(" Converted Amount in JPY "+ convertedAmount);
                      break;
                case 5:
                      convertedAmount = amount * 61.0; 
                      System.out.println(" Converted Amount in AUD "+ convertedAmount);
                      break;

               default:
                      System.out.println("Invalid Currency choice ");
               }
                
                System.out.print("Do you want to exchange currency again? (y/n): ");
                   choice = input.next().charAt(0);
              }
                  while (choice == 'y' || choice == 'Y');

                System.out.println("\nThank you for using Currency Exchange Kiosk!");
                System.out.println("***************************************************");

                input.close();
      } 
}
