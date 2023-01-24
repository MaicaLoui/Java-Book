import java.util.Scanner;

public class Exmaple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for the radius: ");
        double radius = input.nextDouble();
        double area;

        area = radius * radius * 3.14159;
        System.out.println(area);

        int i, j, k;
        i = j = k = 2;
        System.out.println(i + " " + j + " " + k);
    }
}
