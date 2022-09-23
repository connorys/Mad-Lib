/*
1.2.10 Mad Libs

Authors: Connor Sprouse, Palak Jain
Date: 9/21/22
Course: APCSA Period 4 Mrs. Woldseth

Description: 
    Mad libs game that takes user input for parts of speech to create a funny sentence.
*/
import java.util.Scanner;
public class MadLib
{
    public static void main (String[] args)
    {
        //a greeting for the user
        System.out.println("Welcome to our Madlibs game!");

        //testing different mad libs
        String madLib = "The boy went to the <place>, <verb> with his friends, then walked home and ate <noun>.";
        //String madLib = "I went to the animal <noun>, the <plural noun> and the <number> beasts were there.";
        //String madLib = "My favorite thing to do is <verb> especially when my <noun> does it with me.";

        //creating a scanner object
        Scanner myObj = new Scanner(System.in);

        //a loop that checks for every word that needs to be replaced and prompts the user to replace them
        while (madLib.indexOf("<")!= -1)
        {
            System.out.println("Enter a " + madLib.substring(madLib.indexOf("<") + 1, madLib.indexOf(">")));
            String userInput = myObj.nextLine();
            String temp = madLib.substring(madLib.indexOf("<"), madLib.indexOf(">") + 1);
            madLib = madLib.replaceFirst(temp, userInput);
        }   
        //prints the new mad lib     
        System.out.println(madLib); 
    }
}