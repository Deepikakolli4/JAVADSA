import java.util.Scanner;
public class SumAndProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int product = 1;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            sum += digit;
            number = number / 10;
        }
        System.out.println("result: " + (product - sum));
    }
}
