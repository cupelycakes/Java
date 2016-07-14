/**
 * Created by student on 7/12/2016.
 */
import javax.swing.*;
import java.util.Scanner; // Scanner is in the java.util package
public class Average {
    public static void main (String[]args) {
        // Step 1: Get user input with JOptionPane
        // Getting number 1
        String input = JOptionPane.showInputDialog(null, "Enter number of feet ", "Calculate in meters ",
                                                            JOptionPane.INFORMATION_MESSAGE);
        double number1 = Double.parseDouble(input);
        // Step 3: Calculate Meters
        double meters = (number1 * 0.3048);
        // Step 4: Display the result
        JOptionPane.showMessageDialog(null, "The amount in meters: " + meters);
    }
}
