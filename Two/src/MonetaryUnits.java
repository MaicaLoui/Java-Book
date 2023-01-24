import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your amount as cents: ");
        int amountInCents = input.nextInt();

        System.out.println("Your amount " + amountInCents + " consists of:");

        // int amountInCents = (int) (amount * 100);
        System.out.println(amountInCents);

        int amountInDollars = amountInCents / 100;
        amountInCents = amountInCents % 100;
        System.out.println("Dollars : " + amountInDollars);

        int amountInQuarters = amountInCents / 25;
        amountInCents = amountInCents % 25;
        System.out.println("Quarters : " + amountInQuarters);

        int amountInDimes = amountInCents / 10;
        amountInCents = amountInCents % 10;
        System.out.println("Dimes : " + amountInDimes);

        int amountInNickels = amountInCents / 5;
        amountInCents = amountInCents % 5;
        System.out.println("Nickles : " + amountInNickels);

        int numberOfPennies = amountInCents;
        System.out.println("Pennies : " + numberOfPennies);
    }
}
