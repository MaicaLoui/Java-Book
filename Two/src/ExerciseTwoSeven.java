import java.util.Scanner;

public class ExerciseTwoSeven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of minutes :");

        int min = input.nextInt();
        int year = min / 525600;

        int restOfMin = min % 525600;

        int days = restOfMin / 1440;
        // int resofmin2 = restOfMin % 1440;

        System.out.println(min + " is " + year + " Years and" + days + " Days");

    }
}
