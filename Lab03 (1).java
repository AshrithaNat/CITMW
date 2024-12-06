package def;
import java.util.Scanner;
public class Lab03 {

	public static void main(String[] args) {
		//Ashritha Natarajan

		        
		        Scanner key = new Scanner(System.in);
		     // Create a Scanner object for user input

		        // Prompt the user to enter the total number of software packages ordered
		        System.out.print("Enter the total number of software packages ordered: ");
		        int quantity = key.nextInt();

		        // Validate the input
		        if (quantity <= 0) {
		            System.out.println("Invalid value for package count! Exiting the program!");
		            return;
		        }

		        // Define the retail price of the software package
		        double retailPrice = 99.0;
		        double discount = 0.0;

		        // Determine the discount based on the quantity ordered
		        if (quantity >= 10 && quantity <= 19) {
		            discount = 0.20;
		        } else if (quantity >= 20 && quantity <= 49) {
		            discount = 0.30;
		        } else if (quantity >= 50 && quantity <= 99) {
		            discount = 0.40;
		        } else if (quantity >= 100) {
		            discount = 0.50;
		        }

		        // Calculate the total bill amount before discount
		        double totalBillBeforeDiscount = quantity * retailPrice;

		        // Calculate the amount of discount
		        double discountAmount = totalBillBeforeDiscount * discount;

		        // Calculate the total bill amount after discount
		        double totalBillAfterDiscount = totalBillBeforeDiscount - discountAmount;

		        // Display the results
		        System.out.println("Total Bill Amount (before discount) = $" + totalBillBeforeDiscount);
		        System.out.println("Amount of discount = $" + discountAmount);
		        System.out.println("Total Bill Amount (after discount) = $" + totalBillAfterDiscount);
		    }
		

		
	}


