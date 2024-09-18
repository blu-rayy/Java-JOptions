
import javax.swing.JOptionPane;


public class Loop {
    public static void main(String[] args) throws Exception {
        String StringNum = JOptionPane.showInputDialog(null, "Enter Number: ");

        int[] stringCount = new int[10];

        for (int i = 0; i < StringNum.length(); i++) {
            char currentStringNum = StringNum.charAt(i);

            if(Character.isDigit(currentStringNum)) {
                int digit = Character.getNumericValue(currentStringNum);
                stringCount[digit]++;
            }


        }
    }
}
