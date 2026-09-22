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
      
        
    }
    }



