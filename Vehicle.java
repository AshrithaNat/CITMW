//Ashritha Natarajan 
package lab10;

import java.util.Objects;

public class Vehicle {
	
private String manufacturerName; 

private int cylinders;

private String ownersName;


public Vehicle() {
	
	this.manufacturerName = "Unknown";
	
	this.cylinders = 1;
	
	this.ownersName = "Unknown";
}

public Vehicle(String manufacturerName, int cylinders, String ownersName) {
	
	if (cylinders <= 0) {
		
		throw new IllegalArgumentException("Number of cylinder must be greater than 0");
		
	}
	
	this.manufacturerName = manufacturerName;
	
	this.cylinders = cylinders;
	
	this.ownersName = ownersName;
	
	
}

public String getManufacturerName() {
	
	return manufacturerName;
	
}

public int getCylinders() {
	
	return cylinders;
}


public String getOwnersName() {
	return ownersName;
}


public void setManufacturerName(String manufacturerName) {
	
	this.manufacturerName = manufacturerName;
}

public void setCylinders(int cylinders) {
	
	if (cylinders <= 0) {
		
		throw new IllegalArgumentException("Number of cylinders must be greater than 0");
	}
	
	this.cylinders = cylinders;
}

 public void setOwnersName(String ownersName) {
	 
	 this.ownersName = ownersName;
	
}
 
 public boolean equals(Object obj) {
	 if(this == obj) return true;
	 
	 if(obj == null || getClass() != obj.getClass()) return false;
	 
	 Vehicle vehicle = (Vehicle) obj;
	 
	 return cylinders == vehicle.cylinders && 
			 
			 Objects.equals(manufacturerName, vehicle.manufacturerName) &&
			 
			 Objects.equals(ownersName, vehicle.ownersName);
	 
 }
 
 
 public String toString() {
	 
	 return "Vehicle [Manufacturer: "+ manufacturerName + ", Cylinders: "+ cylinders+", Owner: "+ ownersName+ "]";

 
 }
 
 

}




