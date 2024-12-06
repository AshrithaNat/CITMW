//Ashritha Natarajan 
import java.util.Scanner;
import java.util.Random;
//Ashritha Natarajan 
public class Homework03 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		Random Rand = new Random();
		
		int userScore;
		// Create an int variable for User and and Computer to keep score
		int CompScore;
	
		int rounds = 3;
		
		String playAgain;
		
		
		do {
			// a do loop so the user can play again 
			userScore = 0;
			CompScore = 0;
			//The scores must first start at zero, it must be established 
		
		System.out.println("Hello, would you like to play a game of rock, paper, scissors? Enter 1 for Rock, 2 for Paper, and 3 for Scissors: ");
		
		 for (int i = 0; i < rounds; i++) {
			 
			 System.out.println("Rounds " + ( i +1) + ": Enter 1 for Rock, 2 for Paper, and 3 for Scissors:");
				

		int UserChoice = key.nextInt();
		
		int ComputerChoice = Rand.nextInt(3) + 1;
		
		String UserGame;
	       
		String CompGame;

	        switch (UserChoice) {
	            case 1:
                     UserGame = "Rock";  
	                break;
	            case 2:
	                UserGame = "Paper";
	                break;
	            case 3:
	                UserGame = "Scissors";
	                break;
	            
	            default:
	            	UserGame = "Invaild";
	            	break;
	
	}
	        
		             
            
            

	        switch (ComputerChoice) {
	            case 1:
	            	CompGame = "Rock";
	                break;
	                
	            case 2:
	            	CompGame = "Paper";
	                break;
	            case 3:
	            	CompGame = "Scissors";
	                break;
	            
	            default:
	            	CompGame = "Invaild";
	            	break;
	            	//the Random import allows the computer to randomly choose paper, rock or scissors 
		
	}
	        
	        
	        System.out.println("You choose "+UserGame+" ");
	        System.out.println("You computer choose "+CompGame+" ");
	        
	        if (UserGame.equals("Invaild")) {
	        	System.out.println(" Invaild response please enter 1, 2 or 3");
	        }
	        else if ( UserGame.equals(CompGame)) {
	        	System.out.println("It's a tie");
	        }
	        else if ((UserGame.equals("Rock") && CompGame.equals("Scissors")) ||
	        		
	                   (UserGame.equals("Paper") && CompGame.equals("Rock")) ||
	                   
	                   (UserGame.equals("Scissors") && CompGame.equals("Paper"))) 
	        	// This is telling Java the rules of rock, paper, scissors 
	         
	            {
	        	   System.out.println("You win this round!");
	        	   userScore++;
	        	   //This will add a point to the user 
	            } 
	        
	        else {
	        	System.out.println("Computer wins this round!");
	        	CompScore++;
	        }
		 }
	
	        
	        System.out.println("Final Scores:");
	        System.out.println("You: "+ userScore);
	        System.out.println("Computer "+ CompScore);
	        
	        if (userScore > CompScore) {
	        	System.out.println("You win the game");
	        	// If the user scores higher they win the game 
	        	// It's the first if-block, 
	        	// If the computer wins we will use a else if- block 
	        }
	        else if (userScore < CompScore) {
	        	System.out.println("Computer wins the game!");
	        } 
	        else
	        {
	        	System.out.println("The game is a tie");
	        }

	        System.out.println("Do you want to play another round? Yes or No ");
	        playAgain = key.next();
		
		}
		while (playAgain.equalsIgnoreCase("yes"));{
			// while loop in case if the user want to play again 
		    	 
		     }
	        
		
	}
}
		
		

	       
	        
       				



