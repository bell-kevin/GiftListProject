package giftlist;

/******************************************************************************
 * Gift.java 
 * Programmer: @author jcboyd
 * 
 * This class of objects stores information about individual gifts
 *****************************************************************************/

import java.util.Scanner;

public class Gift 
{
   Scanner stdIn = new Scanner(System.in);
    private String name;        
    private String occasion;    
    private int quantity;      
    private String notes;       

    //*************************************************************************
    
    public Gift(String name, String occasion, int quantity, String notes)
    {
        this.name = name;
        this.occasion = occasion;
        this.quantity = quantity;
        this.notes = notes;
    } //end Gift constructor 
    
    public String getName()
    {
        return name;
    } //end getName
    
    public String getOccasion()
    {
        return occasion;
    } // end getOccasion
    
    public int getQuantity()
    {
        return quantity;
    } //end get Quantity
    
    public String getNotes()
    {
        return notes;
    } //end getNotes
    
} //end class Gift
