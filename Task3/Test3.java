package Task3;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input pass length(8 - 12): ");
        int length = scanner.nextInt();

        if (length < 8 || length > 12) {
            System.out.println("Not correct");
            return;
        }

        String allChars = UPPER + LOWER + DIGITS + SPECIAL;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        password.append(UPPER.charAt(random.nextInt(UPPER.length())));
        password.append(LOWER.charAt(random.nextInt(LOWER.length())));
        password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        password.append(SPECIAL.charAt(random.nextInt(SPECIAL.length())));

        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        System.out.println("Your pass: " + shuffleString(password.toString()));
    }

    private static String shuffleString(String input) {
        char[] chars = input.toCharArray();
        Random random = new Random();
        for (int i = chars.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}