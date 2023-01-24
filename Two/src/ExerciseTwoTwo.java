import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Engineering;

public class ExerciseTwoTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the cylinder :");
        double radius = input.nextDouble();

        System.out.println("Please enter the length of the cylinder :");
        double length = input.nextDouble();
        final double PI = 3.14;

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The volume of a cylinder with the radius of " + radius
                + " and a length of " + length + " = " + volume);
    }
}
