// -------------------------------------------------------------------------------
// Name: Nathan Workman
// Date:   11/19/19
// Assignment:  Chapter 6.45 Lab
// Description:   Authoring Assistant Program
// -------------------------------------------------------------------------------
/*Sample text used:
We'll continue our quest in space.  There will be more shuttle flights and more shuttle 
crews and,  yes,  more volunteers, more civilians,  more teachers in space.  Nothing ends here;  
our hopes and our journeys continue!
*/

package lab.pkg6.pkg45;
import java.util.Scanner;                               //Imports Java scanner to get input
public class Lab645 {

    /**
     * @param args the command line arguments
     */
   public static void outputMenu() {                                        //New Method , prints menu of options for our while loop. Incase user wants to change
      System.out.println("\nMENU");
            System.out.println("c - Number of non-whitespace characters");              //Prints options
            System.out.println("w - Number of words");                                  //Print options
            System.out.println("f - Find text");                                        //Prints options
            System.out.println("r - Replace all !'s");                                  //Prints options
            System.out.println("s - Shorten spaces");                                   //Prints options
            System.out.println("q - Quit");                                             //Prints options
            System.out.println("\nChoose an option:");
                                      
   }
   
    public static int getNumOfNonWSCharacters(String input) {               //New Method, counts the number of nonwhite-space characters
        input = input.trim().replaceAll("\\s", "");                 //repleaces white space characters with ""
        return input.length();                                      //Counts the number then returns it
    }

    public static int getNumOfWords(String input) {                         //New Method, counts the number of words
        input = shortenSpace(input);                                        //Calls another method to ensure there isnt double spaces     
        String[] words = input.split(" ");                                  //Splits all words in the string
        return words.length;                                                //Gets the number of words then returns it
    }

    public static int findText(String input, String find) {                 //New Method, Searches the string entered for a specific word
        int counter = 0;                                                    //Initializes a counter
        int i = 0;                                                          //Initializes i

        while ((i = input.indexOf(find)) != -1) {                           //Loop to loop through string to find provided word
            input = input.substring(i + find.length());
            counter += 1;                                                       //Once found it counts it
        }
        return counter;                                                         //returns the number of times the word appeared
    }

    public static String replaceExclamation(String input) {                 //New Method, replaces all !'s with "."
        String ReplaceExcl = input.replaceAll("!", ".");                    //Scans the string and replaces all ! with "."
        return ReplaceExcl;                                                 //returns the new string
    }   

    public static String shortenSpace(String text) {                        //New Method, shortens the spaces in the given string
        String shSp = text.trim().replaceAll(" +", " ");                 //Finds all double spaces in string and makes it just one space
        return shSp;                                                     //retunrs newstring
        
    }



    public static void main(String[] args) {                                //Main 
        Scanner scnr = new Scanner(System.in);                         //Creates a new scanner
        String usertext;                                                //Initializes usertext as a string
        boolean keepAlive = true;                                       //Initializes boolean for while loop for menu
        boolean isstring = true;
        System.out.println("Enter a sample text:\n");                   //Prints what the user should enter
        usertext = scnr.nextLine();                                    //Gets input from user
        
        while(isstring){                                                //Checks to make sure the user did not just enter nothing
            if ((getNumOfNonWSCharacters(usertext))==0){                    //If there is nothing or "zero" white space then get input again
                System.out.println("You did not enter anything.");
                 System.out.println("Enter a sample text:\n");                   //Prints what the user should enter
                    usertext = scnr.nextLine();                                    //Gets input from user
            }
            else{                                                           //Once something correct is entered it will then break out of loop
                isstring=false;
            }
        }
      
        System.out.println("You entered: " + usertext);                 //Prints back what the user entered
         while (keepAlive) {                                                    //Big While loop, used to loop back to menu
             outputMenu();                                                      //Outputs the menu by calling the menu method
             char input = scnr.nextLine().charAt(0);                            //Gets the char the user inputs and if it is not a character it asks again
             
             if (input == 'c'){                                         //if input is c
                 System.out.println("This is the number of whitespace characters: "+ getNumOfNonWSCharacters(usertext));
            }
             else if(input == 'w'){                                     //if input is w
                 System.out.println("This is the number of words: "+ getNumOfWords(usertext));      //Prints the number of words/ calls the method
             }
             
             else if(input == 'f'){                                     //if input is f 
                 System.out.println("Enter the word you want to find: ");                           //Prints the what to be entered and gets input to find
                 String newtext=scnr.nextLine();
                 
                 System.out.println("The word \"" + newtext + "\" appears " + findText(usertext,newtext)+ " times.");           //Calls the method and prints the results
             }
             
             else if(input == 'r'){                                     //if input is r
                 System.out.println("Here is the text without !'s: ");
                 System.out.println(replaceExclamation(usertext));                                //Calls the method and prints the results
             }
             
             else if(input == 's'){                                     //if input is s
                 System.out.println("Here is the text with shortened spaces: ");                
                 System.out.println(shortenSpace(usertext));                                    //Calls the method and prints the results
             }  
             
             else if(input == 'q'){                 //if input is q
                 keepAlive= false;                  //makes keepalive false
                 break;                             //breaks out of loop
                  
             }
             
              
             
         }
         
         return;                                //Returns to top 
        
       
    }
}
        
    
        
        
        
            
        
        
    
    

