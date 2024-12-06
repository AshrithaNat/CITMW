//Ashritha Natarajan
package lab10;

public class Car extends Vehicle {
  
	private double gasMileage;
  
	private int passengers;

    // Default constructor
    
	public Car() {
        
		super();
        
		this.gasMileage = 0.0;
       
		this.passengers = 0;
    }

    // Parameterized constructor
    public Car(String manufacturerName, int cylinders, String ownersName, double gasMileage, int passengers) {
    
    	super(manufacturerName, cylinders, ownersName);
        
    	if (gasMileage < 0 || passengers < 0) {
           
    		throw new IllegalArgumentException("Gas mileage and number of passengers must be nonnegative");
        }
        
    	this.gasMileage = gasMileage;
        
    	this.passengers = passengers;
    }

    // Accessors
   
    public double getGasMileage() {
       
    	return gasMileage;
    }

    
    public int getPassengers() {
        
    	return passengers;
    }

    // Mutators
    
    public void setGasMileage(double gasMileage) {
       
    	if (gasMileage < 0) {
            
    		throw new IllegalArgumentException("Gas mileage must be nonnegative");
        }
       
    	this.gasMileage = gasMileage;
    }

    public void setPassengers(int passengers) {
        
    	if (passengers < 0) {
           
    		throw new IllegalArgumentException("Number of passengers must be nonnegative");
        }
       
    	this.passengers = passengers;
    }

    // equals method
    
    public boolean equals(Object obj) {
      
    	if (!super.equals(obj)) return false;
      
    	Car car = (Car) obj;
       
    	return Double.compare(car.gasMileage, gasMileage) == 0 &&
                passengers == car.passengers;
    }

    // toString method
    
    
    public String toString() {
       
    	return super.toString() + ", Car [Gas Mileage: " + gasMileage + " mpg, Passengers: " + passengers + "]";
    }
}

