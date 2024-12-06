//Ashritha Natarajan
import java.util.Scanner;
public class Lab05 {
	
	
	public static final int COUPONS =6;
	// The amount of coupons to redeem a Chocolate bar is 6. 
	// This will stay the same 

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine");
		
		int dollars = key.nextInt();
		
		// creating variable for dollars 
		
        if (dollars <0){ 
        	System.out.println("Invaild Response, Exiting Program");
			System.exit(0);
		// if the user enters a value less than 0 
			// the program will exit 
			
		}
		
		
		
		
		int ChocoBars = dollars;
		
		
		//the amount of Chocolate Bars equals the amount of dollars 
		
		int AddChoco = 0;
		
		// you will add another chocolate bars if the user has 6 coupons 
		
		int coupons = dollars;
	
		//amount of dollars equals chocolate bars and coupons 
	
		while(coupons >=COUPONS ) {
			
			// subtracting the final variable of coupons 
			/*
			 *  if the amount of coupons is higher,
			 *  the answer will reveal the amount of coupons left 
			 */
			coupons-= COUPONS;
			
						
			ChocoBars++;
			//	ChocoBars = Chocobars + 1;
			//Add 1 chocolate bar 
			coupons++;
			
			
		}
		
		ChocoBars += AddChoco;
		
		System.out.println("You have "+ChocoBars+" chocolate bars and will have "+coupons+" coupons left!");

		
		
		
		
		
		

	

	}
}


