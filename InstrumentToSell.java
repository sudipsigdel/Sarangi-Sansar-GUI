/**
 * There are four instance variables in InstrumentToSell class.
 * A constructor is created with a parameter.
 * Getters and Setters methods are declared.
 * sellInstrument method is created to sell the instrument.
 * Display method is created to display the output.
 * @author (Sudip Sigdel)
 * @version (21049602, javac 17.0.2)
 */

//Child Class
public class InstrumentToSell extends Instrument
{
    private double price;
    private String sellDate;
    private double discountPercent;
    private boolean isSold;
    
    //Parameterized Constructor
    public InstrumentToSell(String Instrument_Name, double price)
    {
        super(Instrument_Name);
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0.0d;
        this.isSold = false;
    }
    
    //setter method for the variable : price
    public void setprice(double price)
    {
        if(isSold = false)
        {
            this.price = price;
        }
        
        else
        {
            System.out.println("Price Cannot be Changed For the Current Item!");
        }
    }
    
    //setter method for the variable : sellDate
    public void setsellDate(String sellDate)
    {
        this.sellDate = sellDate;
    }
    
    //setter method for the variable : discountPercent
    public void setdiscountPercent(double discountPercent)
    {
        this.discountPercent = discountPercent;
    }
    
    //setter method for the variable : isSold
    public void setisSold(boolean isSold)
    {
        this.isSold = isSold;
    }

    //getter method for the variable : price
    public double getprice()
    {
        return this.price;
    }
    
    //getter method for the variable : sellDate
    public String getsellDate()
    {
        return this.sellDate;
    }
    
    //getter method for the variable : discountPercenr
    public double getdiscountPercent()
    {
        return this.discountPercent;
    }
    
    //getter method for the variable : isSold
    public boolean getisSold()
    {
        return this.isSold;
    }
    
    //method to sell the instrument
    public void sellInstrument(String Customer_Name, String Customer_Mobile, long Customer_PAN_No, String sellDate, double discountPercent)
    {
        if(isSold == true)
        {
            System.out.println("This item is already sold!");
            System.out.println("Customer Name: " + Customer_Name);
            System.out.println("Customer Phone: " + Customer_Mobile);
            System.out.println("Customer Pan NO.: " + Customer_PAN_No);
        }
        
        else
        {
            super.setCustomer_Name(Customer_Name);
            super.setCustomer_Mobile(Customer_Mobile);
            super.setCustomer_PAN_No(Customer_PAN_No);
            this.sellDate = sellDate;
            this.discountPercent = discountPercent;
            this.isSold = true;
            double finalPrice = price - (discountPercent/100 * price);
            
            System.out.println("Customer Name: " + Customer_Name); //Customer_Name is from parameter
            System.out.println("Customer Phone: " + Customer_Mobile);
            System.out.println("Customer PAN NO: " + Customer_PAN_No);
            System.out.println("Date of Sell: " + sellDate);
            System.out.println("Discount Percentage: " + discountPercent);
            System.out.println("Final Price: " + "Rs." + finalPrice);
        }
    }
    
    //method to display the output
    public void Display()
    {
        super.Display();
        System.out.println("Price: " + this.price);
        
        if(isSold == true)
        {
            System.out.println("Customer Name: " + getCustomer_Name());
            System.out.println("Customer Phone: " + getCustomer_Mobile());
            System.out.println("Customer Pan NO.: " + getCustomer_PAN_No());
            System.out.println("Sell Date: " + sellDate);
        }
    }
}