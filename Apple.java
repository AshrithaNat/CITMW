//Ashritha Natarajan 
public class Apple {
	
	//instance variable 
	private String type;
	
	private double weight;
	

	private double price;


	
	    // Default Constructor
	    public Apple() {
	    	this.type = "Gala";
	    	this.weight = 0.5 ;
	    	this.price = 0.88;
	    	
	    	
	    }

	   

		// Parameterized Constructor
	    public Apple (String xType, double xWeight, double xPrice) {
	        this.setType(xType);
	        
	        this.setWeight(xWeight);
	        
	        this.setPrice(xPrice);
	    }
	    
	 //mutator
	    
	    //include all the types of apples
	    
	    public void setType (String Type) {
	    	if(Type.equalsIgnoreCase("Gala")
	    			||Type.equalsIgnoreCase("Red Delicious")
	    			|| Type.equalsIgnoreCase("Golden Delicious")
	    			|| Type.equalsIgnoreCase("Granny Smith"))
	    	{
	    		
	    		this.type = Type;
	    	}
	    	
	    	else {
	    		System.out.println("Invaild value for type!");
	    	}
	    }

		public void setWeight(double Weight) {
			
			
			
			if (Weight > 0  && Weight <=2) {
				
				this.weight = Weight;
				
			}
			
			else {
				System.out.println("Invaild input for weight!");
			}
			
		}
		
		public void setPrice (double Price) {
			
			if (Price > 0) {
				
				this.price = Price;
				
			}
			
			else {
				System.out.println("Invaild input for price!");
			}
			
			
		}
		
		

		// Accessor
	    public String getType() {
	        return this.type;
	    }

	
		public double getWeight() {
			return this.weight;
		}

		public double getPrice() {
			return this.price;
		}



		
	    
	    

}
