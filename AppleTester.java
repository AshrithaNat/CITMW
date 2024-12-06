//Ashritha Natarajan
import java.util.Scanner;
public class AppleTester {
	
		
	 public static void main(String[] args) {
		 
		 Scanner key = new Scanner (System.in);
		 
		 
		 Apple FA = new Apple ();
		 
		 
		
		 
		 
		System.out.println("Welcome to the apple tester!!");
		
		System.out.println("Creating the first apple!");
		
		System.out.println("Default value of the first apple object");
		
		System.out.println("Type: "+FA.getType());
		
		System.out.println("Weight: "+FA.getWeight()+" kg");
		
		System.out.println("Price: $"+FA.getPrice());
		
		
		System.out.println("Enter the type of the second apple object");
		
		
		String type = key.nextLine();
		
		
		System.out.println("Enter the weight of the second apple object");

		
		double weight = key.nextDouble();
		
		key.nextLine();
		
		
System.out.println("Enter the price of the second apple object");

		
		double price = key.nextDouble();
		
		key.nextLine();
		
		
		Apple SA = new Apple (type, weight, price);
		
		System.out.println("Creating the second apple!");
		
System.out.println("Type: "+SA.getType());
		
		System.out.println("Weight: "+SA.getWeight()+" kg");
		
		System.out.println("Price: $"+SA.getPrice());
		
		

		
		
		key.close();


		
		 
	 } 

}
