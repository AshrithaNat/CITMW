//Ashritha Natarajan 
import java.util.Scanner;
public class Lab04 {
	
	public static void main(String[] args) {
		
		Scanner key =new Scanner(System.in);
		
		System.out.println("How many books did you purchase at the BN Booksellers this month?");
		
		int books = key.nextInt();
		
		// make an in value to store for both books and points 
		
		key.nextLine();
		
		
		 if (books < 0) {
	            System.out.println("Invalid value entered! Exiting the program!");
	            return;
	            
	            // if books are less than 0 
	        }
		 
		 int points = 0;
		 
		 // creates variable start point
	
		
		switch(books) {
		// books are the variable that the user enters 
		
		case 0:
			points = 0;
			System.out.println("You have not earn points yet. Make a book purchase to start earning points!");
			break;
			//breaks are important for the system to go to the next case 
			// points is what we're telling the user 
		case 1: 
			points = 5;
			 System.out.println("Congratultions!! You have earned "+points+" points!");
			break;
			
			// once a number is picked the break is initiated 
		case 2:
			points = 15;
			 System.out.println("Congratultions!! You have earned "+points+" points!");
			break;
		case 3:
			points = 30;
			//numbers do not need quotation marks 
			 System.out.println("Congratultions!! You have earned "+points+" points!");
			break;
		case 4:
			points = 60;
			 System.out.println("Congratultions!! You have earned "+points+" points!");
			break;
			
			default:
				points= 60;
				System.out.println("Congratultions!! You have earned "+points+" points!");
		
	}
		
		
		
	
	
		
	}

}
