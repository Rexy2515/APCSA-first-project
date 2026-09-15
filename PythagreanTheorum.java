import java.util.Scanner;
public class PythagreanTheorum{
    public static double a;
    public static double b;
    public static double c;
    public static double getUserString;
    public static boolean StopProgram;
    public static void main(String[] args){
        while(StopProgram=false){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your value for A");
        a=scan.nextDouble();
        System.out.println("Please enter your value for B");
        b=scan.nextDouble();




        c= Math.sqrt((a*a)+(b*b));
        System.out.println("The hypotenuse of your triangle is "+c);
        System.out.println("Would you like to restart the program? Type 1 to restart and type 2 to end.");
        getUserString=scan.nextDouble();
        if(getUserString == 1){
            StopProgram=false;
        }
        else{
            StopProgram=true;
        }
        scan.close();
    }
    }
}
