//Ashritha Natarajan 
public class Concert {

    // Attributes
    private String bandName;
    private int capacity;
    private int numTicketsSoldByPhone;
    private int numTicketsSoldAtVenue;
    private double priceByPhone;
    private double priceAtVenue;

    // Default constructor
    public Concert() {
        this.bandName = "Unknown";
        this.capacity = 0;
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
        this.priceByPhone = 0.0;
        this.priceAtVenue = 0.0;
    }

    // Constructor with name, capacity, priceByPhone, priceAtVenue
    public Concert(String bandName, int capacity, double priceByPhone, double priceAtVenue) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.numTicketsSoldByPhone = 0;
        this.numTicketsSoldAtVenue = 0;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Constructor with all parameters
    public Concert(String bandName, int capacity, int numTicketsSoldByPhone, int numTicketsSoldAtVenue, double priceByPhone, double priceAtVenue) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.numTicketsSoldByPhone = numTicketsSoldByPhone;
        this.numTicketsSoldAtVenue = numTicketsSoldAtVenue;
        this.priceByPhone = priceByPhone;
        this.priceAtVenue = priceAtVenue;
    }

    // Accessors
    public String getBandName() {
        return bandName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumTicketsSoldByPhone() {
        return numTicketsSoldByPhone;
    }

    public int getNumTicketsSoldAtVenue() {
        return numTicketsSoldAtVenue;
    }

    public double getPriceByPhone() {
        return priceByPhone;
    }

    public double getPriceAtVenue() {
        return priceAtVenue;
    }

    // Mutators with validation
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Invalid capacity value!");
        }
    }

    public void setNumTicketsSoldByPhone(int numTicketsSoldByPhone) {
        if (numTicketsSoldByPhone >= 0) {
            this.numTicketsSoldByPhone = numTicketsSoldByPhone;
        } else {
            System.out.println("Invalid number of tickets sold by phone!");
        }
    }

    public void setNumTicketsSoldAtVenue(int numTicketsSoldAtVenue) {
        if (numTicketsSoldAtVenue >= 0) {
            this.numTicketsSoldAtVenue = numTicketsSoldAtVenue;
        } else {
            System.out.println("Invalid number of tickets sold at venue!");
        }
    }

    public void setPriceByPhone(double priceByPhone) {
        if (priceByPhone >= 0) {
            this.priceByPhone = priceByPhone;
        } else {
            System.out.println("Invalid price by phone!");
        }
    }

    public void setPriceAtVenue(double priceAtVenue) {
        if (priceAtVenue >= 0) {
            this.priceAtVenue = priceAtVenue;
        } else {
            System.out.println("Invalid price at venue!");
        }
    }

    // Methods
    public int totalNumberOfTicketsSold() {
        return numTicketsSoldByPhone + numTicketsSoldAtVenue;
    }

    public int ticketsRemaining() {
        return capacity - totalNumberOfTicketsSold();
    }

    public void buyTicketsAtVenue(int numTickets) {
        if (ticketsRemaining() >= numTickets) {
            numTicketsSoldAtVenue += numTickets;
        } else {
            System.out.println("The Concert is sold out!");
        }
    }

    public void buyTicketsByPhone(int numTickets) {
        if (ticketsRemaining() >= numTickets) {
            numTicketsSoldByPhone += numTickets;
        } else {
            System.out.println("The Concert is sold out!");
        }
    }

    public double totalSales() {
        return (numTicketsSoldByPhone * priceByPhone) + (numTicketsSoldAtVenue * priceAtVenue);
    }
}


