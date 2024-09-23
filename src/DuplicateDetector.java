import javax.swing.JOptionPane;

public class DuplicateDetector {
    public static void main(String[] args) {
        String StringNum = JOptionPane.showInputDialog(null, "Enter Numbers (seperate with comma): ");
        String[] arrayNum = StringNum.split(",");

        int[] intNum = new int[arrayNum.length];

        // Convert String array to int array
        for (int i = 0; i < arrayNum.length; i++) {
            intNum[i] = Integer.valueOf(arrayNum[i]);
        }

        StringBuilder duplicates = new StringBuilder("Duplicates found: ");
        boolean hasDuplicates = false;

        // checking for dupes
        for (int i = 0; i < intNum.length; i++) {
            for (int j = i + 1; j < intNum.length; j++) {
                if (intNum[i] == intNum[j]) {
                    // avoid printing duplicates of duplicated
                    if (duplicates.indexOf(String.valueOf(intNum[i])) == -1) {
                        duplicates.append("[").append(intNum[i]).append("] ");
                        hasDuplicates = true;
                    }
                }
            }
        }

        // Output results
        if (hasDuplicates) {
            JOptionPane.showMessageDialog(
                null, 
                duplicates.toString(), 
                "Duplicates!", 
                JOptionPane.INFORMATION_MESSAGE
                );
            //System.out.println(duplicates.toString());
        } else {
            JOptionPane.showMessageDialog(
                null, 
                "No duplicates found in input!", 
                "No Duplicates!", 
                JOptionPane.ERROR_MESSAGE 
                );
        }
    }
}
