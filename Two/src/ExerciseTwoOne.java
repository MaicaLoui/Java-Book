import java.util.Scanner;

public class ExerciseTwoOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the celsius dregree : ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " celsius  is " + fahrenheit + " Fahrenheit");

    }

}
