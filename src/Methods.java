import javax.swing.*;

public class Methods {
    private static String Word() {
        String word = JOptionPane.showInputDialog("What real word will they guess?");
        return word;
    }

    public static void Startup() {
        String word = Methods.Word();
        System.out.println("The word is:" + word.length() + " characters long");
        String hword = "";
        for(int i=0; i < word.length(); i++) {
            hword += '_';
        }
        System.out.println(hword);
    }
    public static void Guessing() {
        String word = Methods.Word();
        String Guess = JOptionPane.showInputDialog("Guess a letter!");
        for (int i = 0; i < word.length(); i++) {
            char GuessW = word.charAt(i);
            char GuessG = Guess.charAt(i);
            if (word.charAt(i)== GuessG) {
                GuessW = GuessG;
            }
            System.out.println(word);
        }

    }
}
