import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AreaGUI {
    public static void main(String[] args) throws Exception {
        Scanner calculate = new Scanner(System.in); 
        Double ans;

        // JTextFields for length, width, height input
        JTextField length = new JTextField();
        JTextField width = new JTextField();
        JTextField height = new JTextField();

        // Input array for the dialog
        Object[] inputs = {
            "Enter Length:", length,
            "Enter Width:", width,
            "Enter Height:", height
        };
        
        // Custom dialog with a "Calculate" button
        int option = JOptionPane.showOptionDialog(
            null, 
            inputs, 
            "RECTANGULAR SURFACE AREA CALCULATOR", 
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            new Object[] {"Calculate"},  // Custom button named "Calculate"
            "Calculate"
        ); 

        if (option == 0) {  // If "Calculate" button is pressed
            try {
                // Parse the values from the text fields
                double lengthAns = Double.parseDouble(length.getText());
                double widthAns = Double.parseDouble(width.getText());
                double heightAns = Double.parseDouble(height.getText());

                // Calculation: 2*(lw + lh + wh) for rectangular surface area
                ans = 2 * (lengthAns * widthAns + lengthAns * heightAns + widthAns * heightAns);

                // Display the result
                JOptionPane.showMessageDialog(null, "Surface Area: " + ans);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers.");
            }
        }
    }
}
