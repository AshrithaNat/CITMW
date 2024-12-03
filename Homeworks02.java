import java.util.Scanner;
public class Homeworks02 {
	
	//Ashritha Natarajan 

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println(" Welcome to the Bakery! ");
		
		System.out.println("Do you want to make a donut, or a cupcake, or a cookie?");
		
		String pastries = key.nextLine();
		
		if(pastries.equalsIgnoreCase("Donut")) {
			
			// equalsIgnoreCase doesn't matter whether the user uses Uppercase or Lowercase
			// the word inside the equalsIgnoreCase is the choice the user made. 
			System.out.println("Do you want to make a donut hole, or a donut, or a Cruller?");
			
			String dount = key.nextLine();
			
			if(dount.equalsIgnoreCase("Donut")) {
				// if-block is the first choice 
				System.out.println("Do you want the Donut glazed, or have rainbow sprinkles?");
				
				String topping = key.nextLine();
				
				if(topping.equalsIgnoreCase("glazed")) {
					
					System.out.println("Congrats! you made a glazed donut! ");
					
					// be careful where you place your if and else if 
					// there's multiple else if inside 1 if block 

					
				}
				
				else if (topping.equalsIgnoreCase("rainbow")) {
					//else if is other choice 
					System.out.println("Congrats! you made a rainbow sprinkled donut! ");

					
				}
				
			}
			
			else if(dount.equalsIgnoreCase("donut hole")) {
				
	System.out.println("Do you want the donut hole to have vanilla, or chocolate, or strawberry flavor?");
				
				String flavor = key.nextLine();
				
				if(flavor.equalsIgnoreCase("vanilla")) {
					
					System.out.println("Congrats! you made a vanilla flavored donut hole ");
					

				}
				
				else if(flavor.equalsIgnoreCase("Chocolate")) {
					
					System.out.println("Congrats! you made a chocolate flavored donut hole ");
					
					
					
				}
				
				else if(flavor.equalsIgnoreCase("Strawberry")) {
					
					System.out.println("Congrats! you made a strawberry flavored donut hole ");

					
				}
				
				
			}
			else if(dount.equalsIgnoreCase("Cruller")) {
				System.out.println("Do you want the plain or with cinnamon sugar");
				
				String type = key.nextLine();
				
				if(type.equalsIgnoreCase("plain")) {
					
					System.out.println("Congrats! you made a plain Cruller ");
				}
				
				else if(type.equalsIgnoreCase("Cinnamon")) {
					
					System.out.println("Congrats! you made a Cinnamon Sugared Cruller ");
				}
				
			}
		}
		
		else if (pastries.equalsIgnoreCase("Cupcake")) {
System.out.println("Do you want to make a vanilla or chocolate cupcuake?");
			
			String CupFlavor = key.nextLine();
			
			//System.out.println(CupFlavor);
			if(CupFlavor.equalsIgnoreCase("vanilla")) {
				
				System.out.println("Do you want sprinkles or sugar?");
				
				String topping = key.nextLine();
				
				if(topping.equalsIgnoreCase("sprinkles")) {
					
					System.out.println("Congrats! you made a sprinkled vanilla donut! ");

					
				}
				
				else if (topping.equalsIgnoreCase("sugar")) {
					
					System.out.println("Congrats! you made a sugared vanilla donut! ");

					
				}
				
			}
			
			else if(CupFlavor.equalsIgnoreCase("chocolate")) {
				
	System.out.println("Do you want Buttercream or Chocolate ");
				
				String Frosting = key.nextLine();
				
				if(Frosting.equalsIgnoreCase("ButterCream")) {
					
					System.out.println("Congrats! you made a Buttercream Frosting Chocolate cupcake");
					

				}
				
				else if(Frosting.equalsIgnoreCase("Chocolate")) {
					
					System.out.println("Congrats! you made a Chocolate Frosting Chocolate cupcake");
					
					
					
				}
			
			}
			
			
		}
		
else if (pastries.equalsIgnoreCase("Cookie")) {
	System.out.println("Do you want to make a chocolate chip cookie or sugar cookie ");
	
	String cookie = key.nextLine();
	//System.out.println(cookie);
	
	if(cookie.equalsIgnoreCase("Chocolate Chip cookie")) {
		
		System.out.println("Congrats! you made a chocolate chip cookie ");
	}
		
		
		
		else if (cookie.equalsIgnoreCase("Sugar cookie")) {
			
			System.out.println("Congrats! you made a sugar cookie ");

			
		}
		
		
	}
	
}
			
		}
	

		
	
	
			
			
		

	


