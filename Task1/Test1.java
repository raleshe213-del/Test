package Task1;

import java.util.*;

public class Test1 {
    private static final String[] WORDS = {
            "java", "object", "inheritance", "encapsulation", "polymorphism", "interface"
    };
    private static final int MAX_LIVES = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String wordToGuess = WORDS[random.nextInt(WORDS.length)];
        Set<Character> guessedLetters = new HashSet<>();
        int lives = MAX_LIVES;

        System.out.println("Starting the game!");

        while (lives > 0) {
            printWordState(wordToGuess, guessedLetters);
            if (isWordGuessed(wordToGuess, guessedLetters)) {
                System.out.println("Winner");
                return;
            }

            System.out.print("Input: ");
            String input = scanner.nextLine().toLowerCase();
            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Not correct input");
                continue;
            }

            char guessedChar = input.charAt(0);
            if (guessedLetters.contains(guessedChar)) {
                System.out.println("Already entered");
                continue;
            }

            guessedLetters.add(guessedChar);

            if (wordToGuess.indexOf(guessedChar) == -1) {
                lives--;
                System.out.println("Wrong. Lives left: " + lives);
                printHangman(MAX_LIVES - lives);
            } else {
                System.out.println("Good guess");
            }
        }

        System.out.println("You lost, word -: " + wordToGuess);
    }

    private static void printWordState(String word, Set<Character> guessedLetters) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (guessedLetters.contains(c)) {
                sb.append(c).append(' ');
            } else {
                sb.append("_ ");
            }
        }
        System.out.println("Word: " + sb.toString().trim());
    }

    private static boolean isWordGuessed(String word, Set<Character> guessedLetters) {
        for (char c : word.toCharArray()) {
            if (!guessedLetters.contains(c)) {
                return false;
            }
        }
        return true;
    }

    private static void printHangman(int stage) {
        String[] hangmanStages = {
                "",
                "  O  ",
                "  O  \n  |  ",
                "  O  \n /|  ",
                "  O  \n /|\\ ",
                "  O  \n /|\\ \n /   ",
                "  O  \n /|\\ \n / \\ "
        };
        System.out.println(hangmanStages[stage]);
    }
}