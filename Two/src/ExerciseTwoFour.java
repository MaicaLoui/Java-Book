import java.util.Scanner;

public class ExerciseTwoFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number (pound): ");
        double pound = input.nextDouble();

        double kilograms = pound * 0.454;
        System.out.println(pound + " pounds is " + kilograms + " kilograms");
    }
}
