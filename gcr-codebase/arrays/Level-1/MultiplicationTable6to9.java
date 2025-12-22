
import java.util.Scanner;

public class MultiplicationTable6to9{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int[] table = new int[4];

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            table[i - 1] = number * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
