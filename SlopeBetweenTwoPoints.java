import java.util.Scanner;

public class SlopeBetweenTwoPoints {

    public static double X1;
    public static double X2;
    public static double Y1;
    public static double Y2;
    public static double result;

    public void slope() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your value for X1:");
        X1 = scan.nextDouble();
        System.out.println("Please enter your value for X2:");
        X2 = scan.nextDouble();
        System.out.println("Please enter your value for Y1:");
        Y1 = scan.nextDouble();
        System.out.println("Please enter your value for Y2:");
        Y2 = scan.nextDouble();

        result = (Y2 - Y1) / (X2 - X1);
        System.out.println("The formula is Y2-Y1/X2-X1");
        System.out.println("Your slope is: " + result);

    }
}
