package giftlist;

/******************************************************************************
 * GiftList.java 
 * Programmer: @author jcboyd
 * Version: 1.0
 * Course: SDEV 2210
 *
 * This program creates and displays a simple gift list using an array
 *****************************************************************************/

import java.util.Scanner;

public class GiftList 
{
    public static void main(String[] args) 
    {
        Scanner stdIn = new Scanner(System.in);
        Gift[] giftList = new Gift[4];  //Declare array called giftList of 4 gift objects
        String name, occasion, notes;   //input variables for each gift object
        int quantity;                   //input variable for each gift object
        
        System.out.println("Ch 9 Gifts by JC Boyd\n");
        
        for (int i = 0; i < 4; i++)
        {
            System.out.print("What gift do you want to add to the list? ");
            name = stdIn.nextLine();
            System.out.print("What occasion? ");
            occasion = stdIn.nextLine();
            System.out.print("How many do you want? ");
            quantity = stdIn.nextInt();
            stdIn.nextLine(); //flush newline
            System.out.print("Notes about this gift: ");
            notes = stdIn.nextLine();
            giftList[i] = new Gift(name, occasion, quantity, notes); //instantiate each object
        } //end for
        
        System.out.println("\nAll done, now review the list");
        for (int i = 0; i < 4; i++)
        {
            System.out.printf("Gift: %d %s for %s, notes: %s\n",
                    giftList[i].getQuantity(), giftList[i].getName(), 
                    giftList[i].getOccasion(), giftList[i].getNotes());
        } //end for

    } //end main
    
} //end class GiftList
