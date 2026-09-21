import java.util.Scanner;

public class PythagreanTheorum{
    public static double a;
    public static double b;
    public static double c;

    
    public void pythagrean(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your value for A");
        a=scan.nextDouble();
        System.out.println("Please enter your value for B");
        b=scan.nextDouble();




        c= Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse of your triangle is "+c);
        
        scan.close();
    }
    }

