package Task2;

import java.util.Scanner;

public class Test2 {
    private static final double USD_TO_EUR = 0.92;
    private static final double USD_TO_GBP = 0.79;
    private static final double USD_TO_JPY = 150.47;
    private static final double USD_TO_CNY = 7.18;
    private static final double USD_TO_RUB = 80.18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input USD: ");
        double usd = scanner.nextDouble();

        double eur = usd * USD_TO_EUR;
        double gbp = usd * USD_TO_GBP;
        double jpy = usd * USD_TO_JPY;
        double cny = usd * USD_TO_CNY;
        double rub = usd * USD_TO_RUB;

        System.out.printf("Euros: %.2f%n", eur);
        System.out.printf("Pounds St: %.2f%n", gbp);
        System.out.printf("Yens: %.2f%n", jpy);
        System.out.printf("Yuans: %.2f%n", cny);
        System.out.printf("Rubles: %.2f%n", rub);
    }
}