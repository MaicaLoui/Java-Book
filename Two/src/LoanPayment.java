import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class LoanPayment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the annual interest rate :");
        double rate = input.nextDouble();

        System.out.println("Please enter the loan amount :");
        double amount = input.nextDouble();

        System.out.println("Please enter the number of years to pay the loan :");

        int years = input.nextInt();

        double ratePerMonth = (rate / 100) / 12;
        double monthylyLoan = amount * ratePerMonth / (1 - 1 / Math.pow(1 + ratePerMonth, years * 12));
        double totalPayment = monthylyLoan * years * 12;
        // double perMonth = perYear / 12;

        System.out.println(ratePerMonth);

        System.out.println("Monthly payment : " + monthylyLoan);
        System.out.println("Total payment : " + totalPayment);
    }
}
