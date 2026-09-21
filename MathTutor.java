import java.util.Scanner;
public class MathTutor{
    
        public static double getUserString;
       public static boolean Stop;
    public static void main(String[]args){
        Stop = false;
        double UserInt;
        while(Stop=false){
        AreaOfCircle Area = new AreaOfCircle();
        PythagreanTheorum Pythagrean = new PythagreanTheorum();
        SlopeBetweenTwoPoints slope = new SlopeBetweenTwoPoints();
    Scanner scan =new Scanner(System.in);
System.out.println("Which program do you want to run? Input 1 for Area of the circle, input 2 for the Pythagrean Theorum, and input 3 for the slope between two points.");
UserInt= scan.nextInt();
if(UserInt == 1){
Area.result();
}
else if(UserInt==2){
 Pythagrean.pythagrean();
}
else if(UserInt==3){
slope.slope();
}
else{
System.out.println("You have inputed a value that is out of bounds.");
}
        
        System.out.println("Would you like to restart the program? Type 1 to restart and type 2 to end.");
        getUserString=scan.nextDouble();
        if(getUserString == 1){
            Stop=false;
        }
        else{
            Stop=true;
        }
        scan.close();
    }


}
}

