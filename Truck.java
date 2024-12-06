//Ashritha Natarajan
package lab10;

public class Truck extends Vehicle {
	
    private double loadCapacity;
    
    private double towCapacity;

    // Default constructor
    public Truck() {
    	
        super();
        
        this.loadCapacity = 0.0;
        
        this.towCapacity = 0.0;
    }

    // Parameterized constructor
    public Truck(String manufacturerName, int cylinders, String ownersName, double loadCapacity, double towCapacity) {
       
    	super(manufacturerName, cylinders, ownersName);
        
    	if (loadCapacity < 0 || towCapacity < 0) {
            throw new IllegalArgumentException("Load capacity and towing capacity must be nonnegative");
        }
       
    	this.loadCapacity = loadCapacity;
        
    	this.towCapacity = towCapacity;
    }

    // Accessors
    public double getLoadCapacity() {
       
    	return loadCapacity;
    }

    public double getTowCapacity() {
       
    	return towCapacity;
    }

    // Mutators
    public void setLoadCapacity(double loadCapacity) {
      
    	if (loadCapacity < 0) {
          
    		throw new IllegalArgumentException("Load capacity must be nonnegative");
        }
        this.loadCapacity = loadCapacity;
    }

    public void setTowCapacity(double towCapacity) {
     
    	if (towCapacity < 0) {
           
    		throw new IllegalArgumentException("Towing capacity must be nonnegative");
        }
        this.towCapacity = towCapacity;
    }

    // equals method
    
    public boolean equals(Object obj) {
       
    	if (!super.equals(obj)) return false;
       
    	Truck truck = (Truck) obj;
       
    	return Double.compare(truck.loadCapacity, loadCapacity) == 0 &&
                
    			Double.compare(truck.towCapacity, towCapacity) == 0;
    }

    // toString method
   
    public String toString() {
       
    	return super.toString() + ", Truck [Load Capacity: " + loadCapacity + " tons, Tow Capacity: " + towCapacity + " tons]";
    }
}
