import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hangman Game with Java Keywords :)");
        HangmanGame hangmanGame = new HangmanGame();
        String str = "";
        Scanner input = new Scanner(System.in);
        boolean pass = true;

        while (pass) {
            System.out.println("Choose ur level : \n\tEasy => press 'E'\n\tMedium => press 'M'\n\tHard => press 'H'");
            str = input.next();
            
            System.out.println();

            if (str.toLowerCase().equals("e")) {
                HangmanGame.MAX_ERRORS = 16;
                pass = false;
            } else if (str.toLowerCase().equals("m")) {
                HangmanGame.MAX_ERRORS = 12;
                pass = false;
            } else if (str.toLowerCase().equals("h")) {
                HangmanGame.MAX_ERRORS = 8;
                pass = false;
            }

            System.out.println(pass);
        }

        hangmanGame.newGame();
        hangmanGame.play();
        input.close();
    }
}