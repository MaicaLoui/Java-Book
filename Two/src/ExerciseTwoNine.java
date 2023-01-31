import java.util.Scanner;

public class ExerciseTwoNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the starting velocity v0 in meters/second");
        double v0 = input.nextDouble();

        System.out.println("Please enter the ending velocity v1 in meters/second");
        double v1 = input.nextDouble();

        System.out.println("Please enter the time span t in seconds");
        double t = input.nextDouble();

        double acceleration = (v1 - v0) / t;

        System.out.println(acceleration);
    }

}
