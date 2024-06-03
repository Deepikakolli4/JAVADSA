import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int number = input.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + ":" + result);
    }

    public static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
          return number * factorial(number - 1);
        }
    }
}
