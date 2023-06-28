/**
 * Different swing and awt componenets are imported and used in program.
 * Several components like JLabels, JTextField, JButtons, JComboBox are included
 * There are four instance method, one static main methods and a constructor in the class.
 * Main method is used to call the constructor.
 * Event Handling is carried out for the buttons present in the program
 * @author (Sudip Sigdel)
 * @version (21049602, javac 17.0.2)
 */

//importing java components
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

//starting class
public class SarangiSansar implements ActionListener
{
    //Creating Arraylist
    ArrayList<Instrument> aList = new ArrayList<Instrument>();
    
    //Initialization of frame
    JFrame frame, frame1, frame2;

    //Initialization of JLabels
    JLabel title, title1, title2, title3, title4, title5, InstrumentName, InstrumentName1, InstrumentName2,
    InstrumentName3, InstrumentNameReturn, Price, ChargePerDay, NoOfDays, CustomerName, CustomerName1, CustomerPhone, 
    CustomerPhone1, CustomerPANNo, CustomerPANNo1, DiscountPercentage, SellDate, RentDate, ReturnDate;

    //Initialization of JTextFields
    JTextField InstrumentName_, InstrumentName1_, InstrumentName2_, InstrumentName3_, InstrumentNameReturn_, 
    Price_, ChargePerDay_, NoOfDays_, CustomerName_, CustomerName1_, CustomerPhone_, 
    CustomerPhone1_, CustomerPANNo_, CustomerPANNo1_, DiscountPercentage_;

    //Initialization of JComboBox
    JComboBox <String> SellDateYear, SellDateMonth, SellDateDay, RentDateYear, RentDateMonth, RentDateDay, 
    ReturnDateYear, ReturnDateMonth, ReturnDateDay;

    String day[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

    String month[] = {"Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};

    String year[] = {"2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012",
            "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"};

    //Initialization of JButton
    JButton addrent, addsell, rent, sell, clearrent, clearsell, displayrent, displaysell, returnrent, home, rentb, sellb;

    //variable that holds name of object
    String InstrumentNameRentHold, InstrumentNameSellHold, InstrumentNameReturnHold;
    int ChargePerDayHold, PriceHold;

    String  InstrumentName1RentHold, CustomerNameHold, CustomerPhoneHold, RentDateYearHold, RentDateMonthHold, 
    RentDateDayHold, RentDateHold, ReturnDateYearHold, ReturnDateMonthHold, ReturnDateDayHold, ReturnDateHold;
    long CustomerPANNoHold;
    int NoOfDaysHold;

    String  InstrumentName1SellHold, CustomerName1Hold, CustomerPhone1Hold, SellDateYearHold, SellDateMonthHold, 
    SellDateDayHold, SellDateHold;
    long CustomerPANNo1Hold;
    double DiscountPercentHold;

    //Image
    private ImageIcon image;
    private JLabel label;
    
    //creating constructor
    public SarangiSansar()
    {
        //Creating elements
        frame = new JFrame("Home | Sarangi Sansar");
        frame1 = new JFrame("Rent | Sarangi Sansar");
        frame2 = new JFrame("Sell | Sarangi Sansar");

        title = new JLabel("Sarangi Sansar");
        title1 = new JLabel("Add Instrument to Rent");
        title2 = new JLabel("Rent Instrument");
        title3 = new JLabel("Return Instrument");
        title4 = new JLabel("Add Instrument to Sell");
        title5 = new JLabel("Sell Instrument");
        InstrumentName = new JLabel("Instrument Name");
        InstrumentName1 = new JLabel("Instrument Name");
        InstrumentName2 = new JLabel("Instrument Name");
        InstrumentName3 = new JLabel("Instrument Name");
        InstrumentNameReturn = new JLabel("Instrument Name");
        Price = new JLabel("Price");
        ChargePerDay = new JLabel("Charge per Day");
        NoOfDays = new JLabel("No. of Days");
        CustomerName = new JLabel("Customer Name");
        CustomerName1 = new JLabel("Customer Name");
        CustomerPhone = new JLabel("Customer Mobile");
        CustomerPhone1 = new JLabel("Customer Mobile");
        CustomerPANNo = new JLabel("Customer PAN No.");
        CustomerPANNo1 = new JLabel("Customer PAN No.");
        DiscountPercentage = new JLabel("Discount Percentage");
        SellDate = new JLabel("Sell Date");
        RentDate = new JLabel("Rent Date");
        ReturnDate = new JLabel("Return Date");
        InstrumentName_ = new JTextField();
        InstrumentName1_ = new JTextField();
        InstrumentName2_ = new JTextField();
        InstrumentName3_ = new JTextField();
        InstrumentNameReturn_ = new JTextField();
        Price_ = new JTextField();
        ChargePerDay_ = new JTextField();
        NoOfDays_ = new JTextField();
        CustomerName_ = new JTextField();
        CustomerName1_ = new JTextField();
        CustomerPhone_ = new JTextField();
        CustomerPhone1_ = new JTextField();
        CustomerPANNo_ = new JTextField();
        CustomerPANNo1_ = new JTextField();
        DiscountPercentage_ = new JTextField();
        SellDateYear = new JComboBox<String>(year);
        SellDateMonth = new JComboBox<String>(month);
        SellDateDay = new JComboBox<String>(day);
        RentDateYear = new JComboBox<String>(year);
        RentDateMonth = new JComboBox<String>(month);
        RentDateDay = new JComboBox<String>(day);
        ReturnDateYear = new JComboBox<String>(year);
        ReturnDateMonth = new JComboBox<String>(month);
        ReturnDateDay = new JComboBox<String>(day);
        addrent = new JButton("Add");
        addsell= new JButton("Add");
        rent = new JButton("Rent");
        sell = new JButton("Sell");
        clearrent = new JButton("Clear");
        clearsell = new JButton("Clear");
        displayrent = new JButton("Display");
        displaysell = new JButton("Display");
        returnrent = new JButton("Return");
        rentb = new JButton("Rent");
        sellb = new JButton("Sell");
        home = new JButton("Home");

        //Registering the event
        addrent.addActionListener(this);
        addsell.addActionListener(this);
        rent.addActionListener(this);
        displayrent.addActionListener(this);
        clearrent.addActionListener(this);
        sell.addActionListener(this);
        displaysell.addActionListener(this);
        clearsell.addActionListener(this);
        returnrent.addActionListener(this);
        home.addActionListener(this);
        rentb.addActionListener(this);
        sellb.addActionListener(this);

        //frame bg color
        frame1.getContentPane().setBackground(Color.decode("#c0c0c0"));
        frame2.getContentPane().setBackground(Color.decode("#c0c0c0"));

        //color
        title.setForeground(Color.red);
        title1.setForeground(Color.decode("#0610f1"));
        title2.setForeground(Color.decode("#0610f1"));
        title3.setForeground(Color.decode("#0610f1"));
        title4.setForeground(Color.decode("#0610f1"));
        title5.setForeground(Color.decode("#0610f1"));
        addrent.setBackground(Color.decode("#ffff99"));
        addsell.setBackground(Color.decode("#ffff99"));
        rent.setBackground(Color.decode("#ff471a"));
        sell.setBackground(Color.decode("#ff471a"));
        rentb.setBackground(Color.CYAN);
        sellb.setBackground(Color.CYAN);
        home.setBackground(Color.decode("#99ffff"));
        clearrent.setBackground(Color.white);
        clearsell.setBackground(Color.white);
        displayrent.setBackground(Color.blue);
        displaysell.setBackground(Color.blue);
        displayrent.setForeground(Color.white);
        displaysell.setForeground(Color.white);
        returnrent.setBackground(Color.decode("#ffff99"));

        //fonts
        Font heading = new Font("Serif",Font.BOLD,35);
        Font subheading = new Font("Arial",Font.BOLD,30);
        Font content = new Font("Arial",Font.BOLD,21);
        Font fill = new Font("Arial",Font.PLAIN,20);

        //adding fonts
        title.setFont(heading);
        rentb.setFont(content);
        sellb.setFont(content);
        home.setFont(content);

        title1.setFont(subheading);

        InstrumentName.setFont(content);
        InstrumentName_.setFont(fill);

        ChargePerDay.setFont(content);
        ChargePerDay_.setFont(fill);
        addrent.setFont(content);     

        title2.setFont(subheading);

        InstrumentName1.setFont(content);
        InstrumentName1_.setFont(fill);

        CustomerName.setFont(content);
        CustomerName_.setFont(fill);

        CustomerPhone.setFont(content);
        CustomerPhone_.setFont(fill);

        CustomerPANNo.setFont(content);
        CustomerPANNo_.setFont(fill);

        NoOfDays.setFont(content);
        NoOfDays_.setFont(fill);

        ReturnDate.setFont(content);
        ReturnDateYear.setFont(content);
        ReturnDateMonth.setFont(content);
        ReturnDateDay.setFont(content);

        RentDate.setFont(content);
        RentDateYear.setFont(content);
        RentDateMonth.setFont(content);
        RentDateDay.setFont(content);

        displayrent.setFont(content);
        rent.setFont(content);
        clearrent.setFont(content);

        title3.setFont(subheading);

        InstrumentNameReturn.setFont(content);
        InstrumentNameReturn_.setFont(fill);
        returnrent.setFont(content); 

        title4.setFont(subheading);
        title5.setFont(subheading);

        InstrumentName2.setFont(content);
        InstrumentName2_.setFont(fill);

        Price.setFont(content);
        Price_.setFont(fill);
        addsell.setFont(content);

        InstrumentName3.setFont(content);
        InstrumentName3_.setFont(fill);

        CustomerName1.setFont(content);
        CustomerName1_.setFont(fill);

        CustomerPhone1.setFont(content);
        CustomerPhone1_.setFont(fill);

        CustomerPANNo1.setFont(content);
        CustomerPANNo1_.setFont(fill);

        DiscountPercentage.setFont(content);
        DiscountPercentage_.setFont(fill);

        SellDate.setFont(content);
        SellDateYear.setFont(content);
        SellDateMonth.setFont(content);
        SellDateDay.setFont(content);

        displaysell.setFont(content);
        sell.setFont(content);
        clearsell.setFont(content);

        //Adding elements to the frame        
        frame.add(rentb);
        frame.add(sellb);

        //adding image
        image = new ImageIcon(getClass().getResource("home_screen.png"));
        label = new JLabel(image);
        frame.add(label);
        label.setBounds(0,0,520,830);

        //set bounds frame
        rentb.setBounds(55,708,100,30);
        sellb.setBounds(366,708,100,30);

        //setting frame size and visiblity of frame
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(534,860);
        frame.setResizable(false);
        frame.setBounds(500,0,534,860);
    }

    public void home()
    {
        frame.add(rentb);
        frame.add(sellb);

        //adding image
        image = new ImageIcon(getClass().getResource("home_screen.png"));
        label = new JLabel(image);
        frame.add(label);
        label.setBounds(0,0,520,830);

        //set bounds
        rentb.setBounds(55,708,100,30);
        sellb.setBounds(366,708,100,30);

        //setting frame size and visiblity of frame
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(534,860);
        frame.setResizable(false);
        frame.setBounds(500,0,534,860);
    }
    
    //creating the instance method rent
    public void rent()
    {
        //Adding elements to the frame1
        frame1.add(title);

        frame1.add(title1);
        frame1.add(title2);
        frame1.add(title3);

        frame1.add(home);
        frame1.add(sellb);

        frame1.add(InstrumentName);
        frame1.add(InstrumentName_);

        frame1.add(ChargePerDay);
        frame1.add(ChargePerDay_);
        frame1.add(addrent);

        frame1.add(InstrumentNameReturn);
        frame1.add(InstrumentNameReturn_);
        frame1.add(returnrent);      

        frame1.add(InstrumentName1);
        frame1.add(InstrumentName1_);

        frame1.add(CustomerName);
        frame1.add(CustomerName_);

        frame1.add(CustomerPhone);
        frame1.add(CustomerPhone_);

        frame1.add(CustomerPANNo);
        frame1.add(CustomerPANNo_);

        frame1.add(NoOfDays);
        frame1.add(NoOfDays_);

        frame1.add(ReturnDate);
        frame1.add(ReturnDateYear);
        frame1.add(ReturnDateMonth);
        frame1.add(ReturnDateDay);

        frame1.add(RentDate);
        frame1.add(RentDateYear);
        frame1.add(RentDateMonth);
        frame1.add(RentDateDay);

        frame1.add(displayrent);
        frame1.add(rent);
        frame1.add(clearrent);

        //set bounds frame 1
        home.setBounds(5,5,100,35);
        title.setBounds(135,0,250,45);
        sellb.setBounds(395,5,100,35);

        title1.setBounds(5,70,400,35);

        InstrumentName.setBounds(23,130,220,35);
        InstrumentName_.setBounds(283,130,200,35);

        ChargePerDay.setBounds(23,175,220,35);
        ChargePerDay_.setBounds(283,175,200,35);
        addrent.setBounds(363,220,120,35);     

        title2.setBounds(5,255,400,35);

        InstrumentName1.setBounds(20,300,220,35);
        InstrumentName1_.setBounds(280,300,200,35);

        CustomerName.setBounds(20,345,220,35);
        CustomerName_.setBounds(280,345,200,35);

        CustomerPhone.setBounds(20,390,220,35);
        CustomerPhone_.setBounds(280,390,200,35);

        CustomerPANNo.setBounds(20,435,220,35);
        CustomerPANNo_.setBounds(280,435,200,35);

        NoOfDays.setBounds(20,480,220,35);
        NoOfDays_.setBounds(280,480,200,35);

        RentDate.setBounds(20,525,220,35);
        RentDateYear.setBounds(390,525,90,35);
        RentDateMonth.setBounds(300,525,85,35);
        RentDateDay.setBounds(240,525,55,35);

        ReturnDate.setBounds(20,570,220,35);
        ReturnDateYear.setBounds(390,570,90,35);
        ReturnDateMonth.setBounds(300,570,85,35);
        ReturnDateDay.setBounds(240,570,55,35);

        displayrent.setBounds(20,615,120,35);
        rent.setBounds(360,615,120,35);
        clearrent.setBounds(235,615,120,35);

        title3.setBounds(5,660,400,35);

        InstrumentNameReturn.setBounds(20,705,220,35);
        InstrumentNameReturn_.setBounds(280,705,200,35);

        returnrent.setBounds(360,750,120,35); 

        //setting frame size and visiblity of frame 1
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setSize(530,860);
        frame1.setResizable(false);
        frame1.setBounds(500,0,530,860);
    }
    
    //creating the instance method sell
    public void sell()
    {
        //Adding elements to the frame2
        frame2.add(title);

        frame2.add(title4);
        frame2.add(title5);

        frame2.add(home);
        frame2.add(rentb);

        frame2.add(InstrumentName2);
        frame2.add(InstrumentName2_);

        frame2.add(Price);
        frame2.add(Price_);
        frame2.add(addsell);

        frame2.add(InstrumentName3);
        frame2.add(InstrumentName3_);

        frame2.add(CustomerName1);
        frame2.add(CustomerName1_);

        frame2.add(CustomerPhone1);
        frame2.add(CustomerPhone1_);

        frame2.add(CustomerPANNo1);
        frame2.add(CustomerPANNo1_);

        frame2.add(DiscountPercentage);
        frame2.add(DiscountPercentage_);

        frame2.add(SellDate);
        frame2.add(SellDateYear);
        frame2.add(SellDateMonth);
        frame2.add(SellDateDay);

        frame2.add(displaysell);
        frame2.add(sell);
        frame2.add(clearsell);

        //set bounds frame 2
        home.setBounds(395,5,100,35);
        title.setBounds(135,0,250,45);
        rentb.setBounds(5,5,100,35);

        title4.setBounds(5,70,400,35);

        InstrumentName2.setBounds(23,130,220,35);
        InstrumentName2_.setBounds(283,130,200,35);

        Price.setBounds(23,175,220,35);
        Price_.setBounds(283,175,200,35);
        addsell.setBounds(363,220,120,35);     

        title5.setBounds(5,255,400,35);

        InstrumentName3.setBounds(20,300,220,35);
        InstrumentName3_.setBounds(280,300,200,35);

        CustomerName1.setBounds(20,345,220,35);
        CustomerName1_.setBounds(280,345,200,35);

        CustomerPhone1.setBounds(20,390,220,35);
        CustomerPhone1_.setBounds(280,390,200,35);

        CustomerPANNo1.setBounds(20,435,220,35);
        CustomerPANNo1_.setBounds(280,435,200,35);

        DiscountPercentage.setBounds(20,480,220,35);
        DiscountPercentage_.setBounds(280,480,200,35);

        SellDate.setBounds(20,525,220,35);
        SellDateYear.setBounds(390,525,90,35);
        SellDateMonth.setBounds(300,525,85,35);
        SellDateDay.setBounds(240,525,55,35);

        displaysell.setBounds(20,615,120,35);
        sell.setBounds(360,615,120,35);
        clearsell.setBounds(235,615,120,35);

        //setting frame size and visiblity of frame 2
        frame2.setLayout(null);
        frame2.setVisible(true);
        frame2.setSize(530,860);
        frame2.setResizable(false);
        frame2.setBounds(500,0,530,860);
        
    }
    
    /*
     * this method handles all the event handiling that is used to do in renting the instrument,
     * selling the instrument and different functionality like displaying, others using different methods getSource() and etc
    */
    public void actionPerformed(ActionEvent e)
    {
        //home frame
        if(e.getSource() == home)
        {
            home();
            frame1.setVisible(false);
            frame2.setVisible(false);
        }

        //rent frame
        if(e.getSource() == rentb)
        {
            rent();
            frame.setVisible(false);
            frame2.setVisible(false);
        }

        //sell frame
        if(e.getSource() == sellb)
        {
            sell();
            frame.setVisible(false);
            frame1.setVisible(false);
        }

        //Event handling for Add button of Rent
        if(e.getSource() == addrent)
        {
            //This integer value changes to 1 according to the condition and gives way for loop.
            int i = 0;

            if(InstrumentName_.getText().isEmpty() || ChargePerDay_.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Fields can't be empty.", "Empty Fields Found", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                try
                {   
                    InstrumentNameRentHold = InstrumentName_.getText();
                    ChargePerDayHold = Integer.parseInt(ChargePerDay_.getText());

                    if(aList.isEmpty())
                    {
                        //Creating object of InstrumentToRent class
                        InstrumentToRent rent1 = new InstrumentToRent(InstrumentNameRentHold, ChargePerDayHold);
                        aList.add(rent1);

                        //Displaying message that notifies instrument to rent is added
                        JOptionPane.showMessageDialog(frame, "Instrument Name: " + InstrumentNameRentHold + "\nCharge Per Day: Rs." 
                            + ChargePerDayHold, "Instrument to Rent added!", JOptionPane.INFORMATION_MESSAGE);

                        //Clearing textfield after entering data
                        InstrumentName_.setText("");
                        ChargePerDay_.setText("");
                    }

                    else
                    {
                        for(Instrument check: aList)
                        {
                            if(check.getInstrument_Name() .equals(InstrumentNameRentHold) && check instanceof InstrumentToRent)
                            {
                                i = 1;
                                break;
                            }
                        }

                        if(i == 0)
                        {
                            //Creating object of InstrumentToRent class
                            InstrumentToRent rent1 = new InstrumentToRent(InstrumentNameRentHold, ChargePerDayHold);
                            aList.add(rent1);

                            //Displaying message that notifies instrument to rent is added
                            JOptionPane.showMessageDialog(frame, "Instrument Name: " + InstrumentNameRentHold + "\nCharge Per Day: Rs." 
                                + ChargePerDayHold, "Instrument to Rent added!", JOptionPane.INFORMATION_MESSAGE);

                            //Clearing textfield after entering data
                            InstrumentName_.setText("");
                            ChargePerDay_.setText("");
                        }

                        else
                        {
                            JOptionPane.showMessageDialog(frame, "This item is already added!", "Redundant Data", JOptionPane.ERROR_MESSAGE);

                            //Clearing textfield after entering data for user convenience
                            InstrumentName_.setText("");
                            ChargePerDay_.setText("");
                        }
                    }
                }

                catch(NumberFormatException x)
                {
                    JOptionPane.showMessageDialog(frame, "Charge per Day must be in integer", "Incorrect Datatype", JOptionPane.ERROR_MESSAGE);

                    //Clearing ChargePerDay textfield for user convenience
                    ChargePerDay_.setText("");
                }

                catch(Exception x)
                {
                    JOptionPane.showMessageDialog(frame, "Please re-check the data", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        //Event handling for Add button of Sell
        if(e.getSource() == addsell)
        {
            //This integer value changes to 1 according to the condition and gives way for loop.
            int i = 0;

            if(InstrumentName2_.getText().isEmpty() || Price_.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Fields can't be empty.", "Empty Fields Found", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                try
                {   
                    InstrumentNameSellHold = InstrumentName2_.getText();
                    PriceHold = Integer.parseInt(Price_.getText());

                    if(aList.isEmpty())
                    {
                        //Creating object of InstrumentToSell class
                        InstrumentToSell sell1 = new InstrumentToSell(InstrumentNameSellHold, PriceHold);
                        aList.add(sell1);

                        //Displaying message that notifies instrument to sell is added
                        JOptionPane.showMessageDialog(frame, "Instrument Name: " + InstrumentNameSellHold + "\nPrice: Rs." 
                            + PriceHold, "Instrument to Sell added!", JOptionPane.INFORMATION_MESSAGE);

                        //Clearing textfield after entering data
                        InstrumentName2_.setText("");
                        Price_.setText("");
                    }

                    else
                    {
                        for(Instrument check: aList)
                        {
                            if(check.getInstrument_Name() .equals(InstrumentNameSellHold) && check instanceof InstrumentToSell)
                            {
                                i = 1;
                                break;
                            }
                        }

                        if(i == 0)
                        {
                            //Creating object of InstrumentToSell class
                            InstrumentToSell sell1 = new InstrumentToSell(InstrumentNameSellHold, PriceHold);
                            aList.add(sell1);

                            //Displaying message that notifies instrument to sell is added
                            JOptionPane.showMessageDialog(frame, "Instrument Name: " + InstrumentNameSellHold + "\nPrice: Rs." 
                                + PriceHold, "Instrument to Sell added!", JOptionPane.INFORMATION_MESSAGE);

                            //Clearing textfield after entering data
                            InstrumentName2_.setText("");
                            Price_.setText("");
                        }

                        else
                        {
                            JOptionPane.showMessageDialog(frame, "This item is already added!", "Redundant Data", JOptionPane.ERROR_MESSAGE);

                            //Clearing textfield after entering data
                            InstrumentName2_.setText("");
                            Price_.setText("");
                        }
                    }
                }

                catch(NumberFormatException x)
                {
                    JOptionPane.showMessageDialog(frame, "Price must be in integer", "Incorrect Datatype", JOptionPane.ERROR_MESSAGE);

                    //Clearing Price textfield for user convenience
                    Price_.setText("");
                }

                catch(Exception x)
                {
                    JOptionPane.showMessageDialog(frame, "Please re-check the data", "Error", JOptionPane.ERROR_MESSAGE);

                    //Clearing Price textfield for user convenience
                    Price_.setText("");
                }
            }
        }

        /*
         * This helps in renting the instrument that checks if the item is rented already or not 
         * and if not found then the rent method is run.
         */
        if(e.getSource() == rent)
        {
            //This integer value increases according to the condition and gives way for loop.
            int counter = 0;

            //This BOOLEAN value changes to false according to the condition and gives way for loop.
            boolean available = true;

            if(InstrumentName1_.getText().isEmpty() || CustomerName_.getText().isEmpty() || CustomerPhone_.getText().isEmpty() 
            || CustomerPANNo_.getText().isEmpty() || NoOfDays_.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Fields can't be empty.", "Empty Fields Found", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                try
                {
                    InstrumentName1RentHold = InstrumentName1_.getText();
                    CustomerNameHold = CustomerName_.getText();
                    CustomerPhoneHold = CustomerPhone_.getText();
                    CustomerPANNoHold = Long.parseLong(CustomerPANNo_.getText());                  
                    NoOfDaysHold = Integer.parseInt(NoOfDays_.getText());                  
                    RentDateYearHold = RentDateYear.getSelectedItem().toString();
                    RentDateMonthHold = RentDateMonth.getSelectedItem().toString();
                    RentDateDayHold = RentDateDay.getSelectedItem().toString();
                    RentDateHold = RentDateMonthHold + " " + RentDateDayHold + "," + RentDateYearHold;

                    ReturnDateYearHold = ReturnDateYear.getSelectedItem().toString();
                    ReturnDateMonthHold = ReturnDateMonth.getSelectedItem().toString();
                    ReturnDateDayHold = ReturnDateDay.getSelectedItem().toString();
                    ReturnDateHold = ReturnDateMonthHold + " " + ReturnDateDayHold  + "," + ReturnDateYearHold;

                    if(aList.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame, "Instrument not Available", "Not Found", JOptionPane.ERROR_MESSAGE);
                    }

                    else
                    {
                        for(Instrument ir: aList)
                        {
                            if(ir instanceof InstrumentToRent && ir.getInstrument_Name().equals(InstrumentName1RentHold))
                            {
                                //downcasting
                                InstrumentToRent rent1 = (InstrumentToRent)ir;

                                if(rent1.getisRented() == false)
                                {
                                    rent1.Rent(CustomerNameHold, CustomerPhoneHold, CustomerPANNoHold, RentDateHold, ReturnDateHold , NoOfDaysHold);

                                    JOptionPane.showMessageDialog(frame, InstrumentName1RentHold + " is Rented");
                                    break;
                                }

                                else
                                {
                                    JOptionPane.showMessageDialog(frame, "This item is already rented!", "Already Rented", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                            counter++;
                        }

                        if(counter == aList.size())
                        {
                            available = false;
                        }

                        if(available == false)
                        {
                            JOptionPane.showMessageDialog(frame, "Instrument not Available", "Not Found", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }

                catch(NumberFormatException x)
                {
                    JOptionPane.showMessageDialog(frame, "Please fill up data according to datatype", "Incorrect Datatype", JOptionPane.ERROR_MESSAGE);

                    //Clearing Customer PAN No and No. of days textfield for user convenience
                    CustomerPANNo_.setText("");
                    NoOfDays_.setText("");
                }

                catch(Exception x)
                {
                    JOptionPane.showMessageDialog(frame, "Please re-check the data", "Error", JOptionPane.ERROR_MESSAGE);

                    //Clearing Customer PAN No and No. of days textfield for user convenience
                    CustomerPANNo_.setText("");
                    NoOfDays_.setText("");
                }
            }
        }

        //Event handling for Display button of Rent
        if(e.getSource() == displayrent)
        {            
            for(Instrument obj: aList)
            {
                InstrumentToRent rent;
                if(obj instanceof InstrumentToRent)
                {
                    rent = (InstrumentToRent) obj;
                    rent.Display();

                    if(rent.getisRented() == true)
                    {
                        //Displaying in GUI
                        JOptionPane.showMessageDialog(frame, 
                            "Instrument Name: " + rent.getInstrument_Name() +
                            "\nCustomer Name: " + rent.getCustomer_Name() +
                            "\nCustomer Mobile: " + rent.getCustomer_Mobile() +
                            "\nCustomer PAN No: " + rent.getCustomer_PAN_No() +
                            "\nNo. of Days: " + rent.getnoOfDays() +
                            "\nRent Date: " + rent.getdateOfRent() +
                            "\nReturn Date: " + rent.getdateOfReturn()
                        , "Displaying Info!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }

        //Event handling for Clear button of Rent
        if(e.getSource() == clearrent)
        {
            InstrumentName1_.setText("");
            CustomerName_.setText("");
            CustomerPhone_.setText("");
            CustomerPANNo_.setText("");
            NoOfDays_.setText("");
            RentDateYear.setSelectedIndex(0);
            RentDateMonth.setSelectedIndex(0);
            RentDateDay.setSelectedIndex(0);
            ReturnDateYear.setSelectedIndex(0);
            ReturnDateMonth.setSelectedIndex(0);
            ReturnDateDay.setSelectedIndex(0);
        }

        //Event handling for Return button
        if(e.getSource() == returnrent)
        {
            //This integer value increases according to the condition and gives way for loop.
            int counter = 0;

            //This integer value changes to 1 according to the condition and gives way for loop.
            int empty = 0;

            //This boolean value changes to false according to the condition and gives way for loop.
            boolean available = true;

            if(InstrumentNameReturn_.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Please enter Instrument Name!", "Empty Fields Found", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                InstrumentNameReturnHold = InstrumentNameReturn_.getText();

                if(aList.isEmpty())
                {
                    empty = 1;
                }

                else
                {
                    for(Instrument ir: aList)
                    {
                        if(ir instanceof InstrumentToRent && ir.getInstrument_Name().equals(InstrumentNameReturnHold))
                        {
                            //downcasting
                            InstrumentToRent return1 = (InstrumentToRent)ir;

                            if(return1.getisRented() == true)
                            {
                                return1.Return();
                                JOptionPane.showMessageDialog(frame, InstrumentNameReturnHold + " is Returned. \nCharge per Day is " + return1.getchargePerDay());

                                //Clearing InstrumentName textfield for user convenience
                                InstrumentNameReturn_.setText("");

                                break;
                            }

                            else
                            {
                                JOptionPane.showMessageDialog(frame, "This item is not rented!", "Not Rented", JOptionPane.ERROR_MESSAGE);

                                //Clearing InstrumentName textfield for user convenience
                                InstrumentNameReturn_.setText("");

                                break;                                
                            }
                        }
                        counter ++ ;
                    }
                }

                if(counter == aList.size())
                {
                    available = false;
                }

                if(available == false || empty == 1)
                { 
                    JOptionPane.showMessageDialog(frame, "Instrument not Available", "Not Found", JOptionPane.ERROR_MESSAGE);

                    //Clearing InstrumentName textfield for user convenience
                    InstrumentNameReturn_.setText("");
                }
            }
        }

        //Event handling for Sell button
        if(e.getSource() == sell)
        {
            //This integer value increases according to the condition and gives way for loop.
            int counter = 0;

            //This boolean value changes according to the condition and gives way for loop.
            boolean available = true;

            if(InstrumentName3_.getText().isEmpty() || CustomerName1_.getText().isEmpty() || CustomerPhone1_.getText().isEmpty()
            || CustomerPANNo1_.getText().isEmpty() || DiscountPercentage_.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Fields can't be empty.", "Empty Fields Found", JOptionPane.ERROR_MESSAGE);
            }

            else
            {
                try
                {
                    InstrumentName1SellHold = InstrumentName3_.getText();
                    CustomerName1Hold = CustomerName1_.getText();
                    CustomerPhone1Hold = CustomerPhone1_.getText();
                    CustomerPANNo1Hold = Long.parseLong(CustomerPANNo1_.getText());                  
                    DiscountPercentHold = Double.parseDouble(DiscountPercentage_.getText());                  
                    SellDateYearHold = SellDateYear.getSelectedItem().toString();
                    SellDateMonthHold = SellDateMonth.getSelectedItem().toString();
                    SellDateDayHold = SellDateDay.getSelectedItem().toString();
                    SellDateHold = SellDateMonthHold + " " + SellDateDayHold + "," + SellDateYearHold;                  

                    if(aList.isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame, "Instrument not Available", "Not Found", JOptionPane.ERROR_MESSAGE);
                    }

                    else
                    {
                        for(Instrument is: aList)
                        {
                            if(is instanceof InstrumentToSell && is.getInstrument_Name().equals(InstrumentName1SellHold))
                            {
                                //downcasting
                                InstrumentToSell sell1 = (InstrumentToSell)is;

                                if(sell1.getisSold() == false)
                                {
                                    sell1.sellInstrument(CustomerName1Hold, CustomerPhone1Hold, CustomerPANNo1Hold, SellDateHold, DiscountPercentHold);

                                    JOptionPane.showMessageDialog(frame, InstrumentName1SellHold + " is Sold");
                                    break;
                                }

                                else
                                {
                                    JOptionPane.showMessageDialog(frame, "This item is already sold!", "Already sold", JOptionPane.ERROR_MESSAGE);
                                    break;
                                }
                            }
                            counter ++ ;
                        }

                        if(counter == aList.size())
                        {
                            available = false;
                        }

                        if(available == false)
                        {
                            JOptionPane.showMessageDialog(frame, "Instrument not Available", "Not Found", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }

                catch(NumberFormatException x)
                {
                    JOptionPane.showMessageDialog(frame, "Please fill up data according to datatype", "Incorrect Datatype", JOptionPane.ERROR_MESSAGE);

                    //Clearing Customer PAN No and Discount Percentage textfield for user convenience
                    CustomerPANNo1_.setText("");
                    DiscountPercentage_.setText("");
                }

                catch(Exception x)
                {
                    JOptionPane.showMessageDialog(frame, "Please re-check the data", "Error!", JOptionPane.ERROR_MESSAGE);

                    //Clearing Customer PAN No and Discount Percentage textfield for user convenience
                    CustomerPANNo1_.setText("");
                    DiscountPercentage_.setText("");
                }
            }
        }

        //Event handling for Display button of Sell
        if(e.getSource() == displaysell)
        {
            for(Instrument obj: aList)
            {
                InstrumentToSell sell;
                if(obj instanceof InstrumentToSell)
                {
                    sell = (InstrumentToSell) obj;
                    sell.Display();

                    if(sell.getisSold() == true)
                    {
                        //Displaying in GUI
                        JOptionPane.showMessageDialog(frame, 
                            "Instrument Name: " + sell.getInstrument_Name() +
                            "\nCustomer Name: " + sell.getCustomer_Name() +
                            "\nCustomer Mobile: " + sell.getCustomer_Mobile() +
                            "\nCustomer PAN No: " + sell.getCustomer_PAN_No() +
                            "\nPrice: " + sell.getprice() +
                            "\nSell Date: " + sell.getsellDate()
                        , "Displaying Info!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }

        //Event handling for Clear button of Sell
        if(e.getSource() == clearsell)
        {
            InstrumentName3_.setText("");
            CustomerName1_.setText("");
            CustomerPhone1_.setText("");
            CustomerPANNo1_.setText("");
            DiscountPercentage_.setText("");
            SellDateYear.setSelectedIndex(0);
            SellDateMonth.setSelectedIndex(0);
            SellDateDay.setSelectedIndex(0);
        }
    }

    public static void main(String[] args)
    {
        new SarangiSansar();
    }
}