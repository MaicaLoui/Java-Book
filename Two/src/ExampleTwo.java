public class ExampleTwo {
    public static void main(String[] args) {
        double miles = 100;
        final double KILOMETERS_PER_MILE = 1609;

        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println(kilometers);

        System.out.println(Math.pow(2, 3.5));

        double a = 6.5;
        a += a + 1;
        a = a + a + 1;
        System.out.println(a);

        a = 6;
        a /= 2;
        System.out.println(a);

        int i = 10;
        int newNum = 10 * i++;
        System.out.print("i is " + i + ", newNum is " + newNum);
    }

}
