import java.util.*; //includes java.Scanner

public class Area {
    public static void main(String[] args) throws Exception {
        Scanner calculate = new Scanner(System.in); 
        Float ans;
        
        System.out.println("RECTANGULAR SURFACE AREA CALCULATOR\n");

        System.out.print("Enter length of the object: ");
        Float length = calculate.nextFloat();

        System.out.print("Enter width of the object: ");
        Float width = calculate.nextFloat();

        System.out.print("Enter height of the object: ");
        Float height = calculate.nextFloat();

        // rectangular surface area formula: 2 (lw + lh + wh)
        ans = 2 * ((length*width) + (length*height) + (width*height));
        System.out.println("The Surface Area of your solid is: " + ans);
    }
}
