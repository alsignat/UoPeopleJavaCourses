package CS1102.unit2;

import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {
        String question = "What is a loop in Java?\n";
        question += "A. Control flow structure used for repeated execution of a block of statements.\n";
        question += "B. An audio or video digital sample cut so that it plays continuously without jarring.\n";
        question += "C. Another term for branch.\n";
        question += "D. No such thing in Java.\n";
        question += "E. It is useless and obsolete instrument.\n";

        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("A")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            } else if (answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                JOptionPane.showMessageDialog(null, "You are wrong! Try again!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        }
    }
}
