/**
 * There are five variables in Instrument class among which four of them are instance variables and one is static variable.
 * A constructor is created with a parameter.
 * Getters and Setters methods are declared.
 * A Display method is created to display the output.
 * @author (Sudip Sigdel)
 * @version (21049602, javac 17.0.2)
 */

//Parent Class
public class Instrument
{
    //static variable
    private static int Instrument_Id;
    
    //instance variable
    private String Instrument_Name, Customer_Name, Customer_Mobile;
    private long Customer_PAN_No;
    
    //Parameterized Constructor
    public Instrument(String Instrument_Name)
    {
        //Instrument_Id is increment automatically.
        Instrument_Id = ++Instrument_Id;
        this.Instrument_Name = Instrument_Name;
        this.Customer_Name = "";
        this.Customer_Mobile = "";
        this.Customer_PAN_No = 0;
        System.out.println("The instrument id is " + this.Instrument_Id);
    }
    
    //setters method for the variable : Instrument_id
    public void setInstrument_Id(int Instrument_Id)
    {
        Instrument_Id = Instrument_Id;
    }
    
    //setters method for the variable : Instrument_Name
    public void setInstrument_Name(String Instrument_Name)
    {
        this.Instrument_Name = Instrument_Name;
    }
    
    //setters method for the variable : Customer_Name
    public void setCustomer_Name(String Customer_Name)
    {
        this.Customer_Name = Customer_Name;
    }

    //setters method for the variable : Customer_Mobile
    public void setCustomer_Mobile(String Customer_Mobile)
    {
        this.Customer_Mobile = Customer_Mobile;
    }
    
    //setters method for the variable : Customer_PAN_No
    public void setCustomer_PAN_No(long Customer_PAN_No)
    {
        this.Customer_PAN_No = Customer_PAN_No;
    }
    
    //getters method for the variable : Instrument_Id
    public int getInstrument_Id()
    {
        return Instrument.Instrument_Id;
    }
    
    //getters method for the variable : Instrument_Name
    public String getInstrument_Name()
    {
        return this.Instrument_Name;
    }
    
    //getters method for the variable : Customer_Name
    public String getCustomer_Name()
    {
        return this.Customer_Name;
    }
    
    //getters method for the variable : Customer_Mobile
    public String getCustomer_Mobile()
    {
        return this.Customer_Mobile;
    }
    
    //getters method for the variable : customer_PAN_no
    public long getCustomer_PAN_No()
    {
        return this.Customer_PAN_No;
    }
    
    //creation of instance Display method
    public void Display()
    {
        System.out.println("The Instrument Id is " + Instrument.Instrument_Id);
        System.out.println("Name of Instrument: " + this.Instrument_Name);
        
        if(Customer_Name.equals("") && Customer_Mobile.equals("") && Customer_PAN_No == 0)
        {
            System.out.println("Customer Details not found!");
        }
        
        else
        {
            System.out.println(this.Customer_Name);
            System.out.println(this.Customer_Mobile);
            System.out.println(this.Customer_PAN_No);
        }
    }
}