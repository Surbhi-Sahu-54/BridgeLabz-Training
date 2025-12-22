import java.util.Scanner;

public class SmallestLargest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter third number : ");
        int num3 = input.nextInt();
        
        System.out.println();
        
        // Call the method to get smallest and largest
        int[] result = smallestAndLargest(num1, num2, num3);
        
        int smallest = result[0];
        int largest  = result[1];
        
        // Show the result
        System.out.println("The three numbers are: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Smallest number       : " + smallest);
        System.out.println("Largest number        : " + largest);
        
        input.close();
    }
    
    // Method that returns an array: index 0 = smallest, index 1 = largest
    public static int[] smallestAndLargest(int number1, int number2, int number3) {
        
        int smallest = number1;
        int largest  = number1;
        
        // Check second number
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }
        
        // Check third number
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }
        
        // Create array and return
        int[] result = new int[2];
        result[0] = smallest;
        result[1] = largest;
        
        return result;
    }
}