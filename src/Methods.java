import javax.swing.*;

public class Methods {
    public static void Startup() {
        String word = JOptionPane.showInputDialog("What real word will they guess?");
        System.out.println("The word is:" + word.length() + " characters long");
        String hword = "";
        for(int i=0; i < word.length(); i++) {
            hword += '_';
        }
        System.out.println(hword);
    }
}
