//Ashritha Natarajan 
import java.util.Scanner;
public class Lab06 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		
		

		System.out.println("Enter the height of the triangle:");
		int partOne = key.nextInt();
		
		for(int i= 0; i < partOne; i++ ) 
			
			// i starts at zero
			/*
			 * i shouldn't be greater than partOne so it will stop at 5
			 * i++ add 1 star until it reaches 5
			 */
		{
			for(int j = 0; j <= i ; j++) {
				System.out.print("*");	
			}
			System.out.println();
			
		}
		
		for(int i= partOne- 1; i > 0; i-- )
			// for the second loop i should start from -1
			// i-- to subtract 1 star from the number 
			
		{
			for(int j = 0; j < i ; j++) {
				System.out.print("*");	
				// if j was -- it would be infinite loop, error 
			}
			System.out.println();
		}
		
		System.out.println(" End of Program! ");
		
		
		

	}

}
