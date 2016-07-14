/**
 * Created by student on 7/14/2016.
 */
import javax.swing.*;

public class UnicornDivisionQuiz {
    public static void main(String[] args) {
        // 1. Generation two random single-digit integers
        int number1 = (int)(Math.random() * 10 + 1);
        int number2 = (int)(Math.random() * 50 + 10);

        // 2. Number1 < number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        // 3. Prompt the student to answer "What is number1 / number2?"
        String input = JOptionPane.showInputDialog("What is " + number1 + " / " + number2 + ", to the closest whole number?\n ");
        int answer = Integer.parseInt(input);

        // 4. Grade the answer and display the result
        if (number1 / number2 == answer)
            JOptionPane.showMessageDialog(null, "You are as smart as a magical unicorn,\n " +
                    "unicorns are really smart!\n Congradulation!");
        else
            JOptionPane.showMessageDialog(null, "Sadly you got the answer wrong,\n " +
                    "play again and see if you can become a magical unicorn.\n The correct answer was " + number1 + " / "
                    + number2 + " is " + (number1 / number2) + ".");
    }
}
