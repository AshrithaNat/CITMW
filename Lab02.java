package def;
import java.util.Scanner;
//Ashritha Natarajan
//Always import Scanner
public class Lab02 {

public static final double ACCELERATION_DUE_TO_GRAVITY = 9.8;
//public static final double is when the value doesn't change

public static final double VALUE = 0.5;
//Make sure to always add semicolon!
public static void main(String[] args) {
	
	Scanner key =new Scanner(System.in);
	
	System.out.println("Enter the initial velocity of the ball (in meters per second) at point A:");
	
	double inital = key.nextDouble();
	
	System.out.println("How much time (in seconds) does the ball take to reach point B?");
	
	double time = key.nextDouble();
	
	double finalvelocity = ACCELERATION_DUE_TO_GRAVITY*time + inital;
	
	System.out.println("Final Velocity of the ball = " + finalvelocity + " m/s");
	
	double distance = VALUE * ACCELERATION_DUE_TO_GRAVITY * Math.pow(time,2) + inital *time;
	
	System.out.println("Distance traveled by the ball (S) = " + distance + " m");
	

	
	
	
	
	
	
	
	
	
}




}
