// -------------------------------------------------------------------------------
// Name: Nathan Workman
// Date:   10/31/19
// Assignment:  Chapter 5 Lab
// Description:   This program will store roster and rating information for a soccer team. Coaches rate players during tryouts to ensure a balanced team.
// -------------------------------------------------------------------------------
package chapter5lab;
import java.util.Scanner;                               //Imports Java scanner to get input

/**
 *
 * @author workm
 */
public class Chapter5Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);                         //Creates a new scanner
      int[][] players = new int[5][2];                              //Creates an array 
      boolean keepAlive = true;                                     //Creates an boolean 
      char input;                                                   //Creates a variable named "input" that is a char type
      
      for (int i = 0; i < 5; i++) {                                             //First for loop we only loop while i is less then 5, increment after
         System.out.println("Enter player " + (i+1) + "'s jersey number:");         //We tell the user what we want to be entered
         players[i][0] = scan.nextInt();                                            //Actually get the input from the user and start entering it into the array 
         System.out.println("Enter player " + (i+1) + "'s rating:");                //We tell the user what we want to be entered
         players[i][1] = scan.nextInt();                                            //Actually get the input from the user and start entering it into the array
         System.out.println();                                                      //Prints a new line
      }
      System.out.println();
      
      
      System.out.println(("ROSTER"));                                                //Prints Roster
      int item = 1;                             //Creates a new increment variable for formatting
      for (int i = 0; i < 5; i++) {                                                        //Another for, we loop through array to print the player/jersey/rating
         if (i < 5) {
            System.out.println("Player " + item + " -- Jersey number: " + players[i][0] + ", Rating: " + players[i][1]);                    //prints in format, we use the increment variable to print player
         }
         item++;                                                //Increments our variable
      }
      System.out.println();                             //Prints newline       
      
      
     System.out.println("MENU");                                           //Prints Menu
      System.out.println("u - Update player rating");                       //Prints options
      System.out.println("a - Output players above a rating");              //Prints options
      System.out.println("r - Replace player");                             //Prints options
      System.out.println("o - Output roster");                              //Prints options
      System.out.println("q - Quit\n");                                     //Prints options
      System.out.println("Choose an option:");                                  //Prints options
      
      
      while (keepAlive) {                                                           //While loop, while keepAlive is true
                                                                                         
         input = scan.next().charAt(0);                                                     //Get input and get the char
         if (input == 'q') {                                                                //if user enters q we break out of loop, keep alive is false
            keepAlive = false;
            break;
         } else if (input == 'o') {                                                         //if user enters o we call the output roster
            System.out.println(("ROSTER"));                                                //Prints Roster
      item = 1;                             //Creates a new increment variable for formatting
      for (int i = 0; i < 5; i++) {                                                        //Another for, we loop through array to print the player/jersey/rating
         if (i < 5) {
            System.out.println("Player " + item + " -- Jersey number: " + players[i][0] + ", Rating: " + players[i][1]);                    //prints in format, we use the increment variable to print player
         }
         item++;                                                //Increments our variable
      }
      System.out.println();                             //Prints newline     
              System.out.println("Choose a new option:");   
             
      
  
         } else if (input == 'u') {                                                         //if input is u we ask for another input
            System.out.println("Enter a jersey number:");                                   //Telling the user what we want
            int jerseyNum = scan.nextInt();                                                 //Gets input with scanner and saves it
            System.out.println("Enter a new rating for the player:");                          //We ask for another input
            int newRating = scan.nextInt();                                                         //Gets another input with scanner
            for (int l = 0; l < 5; l++) {                                               //Another for loop, this is to put the previous entries in the array. We replace the old ones.
               if (players[l][0] == jerseyNum) {
                  players[l][1] = newRating;
               }
               
            }
             System.out.println("Choose a new option:");   
         } else if (input == 'a') {                                         //we get a to output above a certain rating
            System.out.println("Enter a rating:");
            int rating = scan.nextInt();                        //Gets another input with scanner
            for(int i=0; i < 5; i++){                               //loop through array to check which players are above the given rating
                if ((players[i][1])>=rating){
                        System.out.println("Jersey: " + players[i][0] + " is above rating: "+ rating + " with rating " + players[i][1]+".");            //prints results
                        System.out.println("");
                }
            }
            
            System.out.println("Choose a new option:");                                  //Prints options
            continue;
            
         } else if (input == 'r') {
            System.out.println("Enter a jersey number:");                       //If r is entered we get for the jersey number again so we can replace
            int jerseyNum = scan.nextInt();
            boolean exists = true;                                              //Makes boolean true
            for (int l = 0; l < 5; l++) {                                       //Another for loop for previous inputs, we use this to put new values into array. Replace old values
               if (players[l][0] == jerseyNum) {
                  System.out.println("Enter a new jersey number:");                             //Prints to user what to enter
                  players[l][0] = scan.nextInt();                                               //Gets another input with scanner, stores it into array
                  
                  System.out.println("Enter a rating for the new player:");                      //Prints to user what to enter
                  players[l][1] = scan.nextInt();                                               //Gets another input with scanner, stores it into array
                       
               }
            }
                        System.out.println("Choose a new option:");                                  //Prints options       

            
         }
      }
      
      return;
    }
}
   
   
   
   
      
   

