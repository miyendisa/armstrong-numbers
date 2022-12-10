import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, assignedNumber, remainder, product, i;
        int digitCounter = 0;
        int sum = 0;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        assignedNumber = number;
        while (assignedNumber > 0) {
            assignedNumber /= 10;
            digitCounter++;
        }

        assignedNumber = number;
        while (assignedNumber > 0) {
            remainder = assignedNumber % 10;

            product = 1;
            for (i = 1; i <= digitCounter; i++) {
                product *= remainder;
            }
            sum += product;
            assignedNumber /= 10;
        }

        if (number == sum) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.print(number + " is not an Armstrong Number.");
        }
    }
}
