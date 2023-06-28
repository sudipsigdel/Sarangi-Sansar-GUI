/**
 * There are five instance variables in InstrumentToRent class.
 * A constructor is created with a parameter.
 * Getters and Setters methods are declared.
 * Rent method is created to rent out the instrument to customer.
 * Return method is created to return the rented instruments.
 * Display method is created to display the output.
 * @author (Sudip Sigdel)
 * @version (21049602, javac 17.0.2)
 */

//Child Class
public class InstrumentToRent extends Instrument
{
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    
    //Parameterized Constructor
    public InstrumentToRent(String Instrument_Name, int chargePerDay)
    {
        super(Instrument_Name);
        this.chargePerDay = chargePerDay;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;
    }
    
    //setters method for the variable : chargePerDay
    public void setchargePerDay(int chargePerDay)
    {
        this.chargePerDay = chargePerDay;
    }

    //setters method for the variable : dateOfRent
    public void setdateOfRent(String dateOfRent)
    {
        this.dateOfRent = dateOfRent;
    }
    
    //setters method for the variable : dateOfReturn
    public void setdateOfReturn(String dateOfReturn)
    {
        this.dateOfReturn = dateOfReturn;
    }
    
    //setters method for the variable : noOfDays
    public void setnoOfDays(int noOfDays)
    {
        this.noOfDays = noOfDays;
    }
    
    //setters method for the variable : isRented
    public void setisRented(boolean isRented)
    {
        this.isRented = isRented;
    }
    
    //getters method for the variable : chargePerDay
    public int getchargePerDay()
    {
        return this.chargePerDay;
    }

    //getters method for the variable : dateOfRent
    public String getdateOfRent()
    {
        return this.dateOfRent;
    }
    
    //getters method for the variable : dateOfReturn
    public String getdateOfReturn()
    {
        return this.dateOfReturn;
    }
    
    //getters method for the variable : noOfDays
    public int getnoOfDays()
    {
        return this.noOfDays;
    }
    
    //getters method for the variable : isRented
    public boolean getisRented()
    {
        return this.isRented;
    }
    
    //method to rent out the instrument to customer
    public void Rent(String Customer_Name, String Customer_Mobile, long Customer_PAN_No, String dateOfRent, String dateOfReturn, int noOfDays)
    {
        if(this.isRented == true)
        {
            System.out.println("This item is not available.");
            System.out.println("Customer Name:" + " " + Customer_Name);
            System.out.println("Customer Phone:" + " " + Customer_Mobile);
            System.out.println("Date of Return:" + " " + dateOfReturn);
        }
        
        else
        {
            this.setCustomer_Name(Customer_Name);
            this.setCustomer_Mobile(Customer_Mobile);
            this.setCustomer_PAN_No(Customer_PAN_No);
            this.dateOfRent = dateOfRent;
            this.dateOfReturn = dateOfReturn;
            this.noOfDays = noOfDays;
            this.isRented = true;
            
            int totalCharge = this.noOfDays * this.chargePerDay;
            
            System.out.println("Customer Name: " + Customer_Name); //Customer_Name is from parameter
            System.out.println("Customer Phone: " + Customer_Mobile);
            System.out.println("Customer PAN NO: " + Customer_PAN_No);
            System.out.println("Date of Rent: " + dateOfRent);
            System.out.println("Date of Return: " + dateOfReturn);
            System.out.println("No of Days: " + noOfDays);
            System.out.println("Total Charge: " + "Rs." + totalCharge);
        }
    }
    
    //method to return the instrument
    public void Return()
    {
        if(this.isRented = false)
        {
            System.out.println("The instrument is available for rent.");
        }
        
        else
        {
            this.setCustomer_Name("");
            this.setCustomer_Mobile("");
            this.setdateOfReturn("");
            this.setdateOfRent("");
            this.setnoOfDays(0);
            this.setCustomer_PAN_No(0);
            this.setisRented(false);
        }
    }
    
    //Override
    public void Display()
    {
        super.Display();
        
        if(this.isRented == true)
        {
            System.out.println("Customer Name: " + this.getCustomer_Name()); //Customer_Name is from Instrument Class
            System.out.println("Customer Phone: " + this.getCustomer_Mobile());
            System.out.println("Customer PAN NO: " + this.getCustomer_PAN_No());
            System.out.println("Date of Rent: " + dateOfRent);
            System.out.println("Date of Return: " + dateOfReturn);
        }
    }
}