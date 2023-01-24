import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class ExerciseTwoSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer between 0 and 1000 :");
        int number = input.nextInt();

        int result = number % 10;
        number = number / 10;

        int result2 = number % 10;
        number = number / 10;

        int result3 = number % 10;
        number = number / 10;

        int sumOfResults = result + result2 + result3;
        System.out.println("The sum of the digits is " + sumOfResults);

    }
}
