 import java.util.Scanner;
public class AreaOfCircle {
    public static double radius;
    public static double result;
 
    public void result(){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your value for the radius of your circle: ");
        radius=scan.nextDouble();
   result = (Math.PI)*Math.pow(radius, 2);




       
        System.out.println("The are of your circle is: " + result);
        System.out.println("Would you like to restart the program? Type 1 to restart and type 2 to end.");
      
        scan.close();
    }
    }



