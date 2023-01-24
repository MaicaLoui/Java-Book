import java.util.Scanner;

public class ExerciseTwoFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Please enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        double gratuity = (subtotal / 100) * gratuityRate;
        double total = subtotal + gratuity;

        System.out.println("The subtotal is " + subtotal);
        System.out.println("The gratuity rate is " + gratuityRate);
        System.out.println("The gratuity is " + gratuity);
        System.out.println("The total is " + total);
    }
}
