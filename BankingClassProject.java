// -------------------------------------------------------------------------------
// Name: Nathan Workman
// Date:   1/24/20
// Assignment:  Lab
// Description:   Bank Account Program 
// -------------------------------------------------------------------------------

package bankingclassproject;

import java.util.Scanner;


public class BankingClassProject {

   
    public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);                         //Creates a new scanner
        //Initalizing Bank accounts     "Name, Checking, Savings, Loan"
        Banking NicksAcct = new Banking("Nick",400,500,0);          //All accounts initalized start with a loan amount of $0
        Banking CarolsAcct = new Banking("Carol",600,700,0);
        
        //My personal Bank account
        Banking NathanAcct = new Banking("Nathan", 600,1000,0);
        
          
          // Welcome/ Introduction 
          System.out.println("---------WELCOME ACCOUNT OVERVIEW------------");
          System.out.println("This is the Banking Account Program");
          System.out.println("The current Accounts provided are below");
          System.out.println(
          "1. Nicks Account");
           System.out.println(
          "2. Carols Account");
             System.out.println(
          "3. Nathans Account");
          
          
         //New varaible total amount that gets the total amount from Nicks/Carols checking and savings and gets the sum
         int totalamt = NicksAcct.getTotalMoney() + CarolsAcct.getTotalMoney();
         System.out.println("Total money in Nicks/Carols account is " + totalamt);
         System.out.println("");
         System.out.println("Nathan Gets a loan of $1000 from the Bank ");
         NathanAcct.setloan(1000); //Adds an $1000 loan to  Nathans account
           
            
        //Nicks Bank account overview
        System.out.println("---------NICKS ACCOUNT OVERVIEW------------");
        System.out.println("Total money in Nicks checking is " + NicksAcct.getCheckMoney());
        System.out.println("");
        System.out.println("Total money in Nicks saving is " + NicksAcct.getSaveMoney());
        System.out.println("");
            //Sets Nicks checking account to have $100
        NicksAcct.setCheckMoney(100);
        //Changes Nicks savings balance to Carols checking balance
               NicksAcct.setSaveMoney(CarolsAcct.getCheckMoney());
               //Prints new results
                 System.out.println("Total money in Nicks savings is " + NicksAcct.getSaveMoney());
                 System.out.println("-------------------------------------------");
                 System.out.println("");
        
        
           //Carols Bank account overview
            System.out.println("---------CAROLS ACCOUNT OVERVIEW------------");
        System.out.println("Total money in Carols checking is " + CarolsAcct.getCheckMoney());
        System.out.println("");
        System.out.println("Total money in Carols savings is " + CarolsAcct.getSaveMoney());
        System.out.println("");
            //Sets Carols checking account to have $100
        CarolsAcct.setCheckMoney(100);
            //Changes Carols savings balance to Nicks checking balance
               CarolsAcct.setSaveMoney(NicksAcct.getCheckMoney());
               //Prints new results
                 System.out.println("Total money in Carols savings is " + CarolsAcct.getSaveMoney());
                 System.out.println("-------------------------------------------");
                 System.out.println("");

                 
                 
                 
          //Nathans Bank account overview
           System.out.println("---------NATHANS ACCOUNT OVERVIEW------------");
        System.out.println("Total money in Nathans checking is " + NathanAcct.getCheckMoney());
        System.out.println("");
        System.out.println("Total money in Nathans saving is " + NathanAcct.getSaveMoney());
        System.out.println("");
            //Sets Nathans checking account to have $900
        NathanAcct.setCheckMoney(900);
        
        //Changes Nathans savings balance to Carols checking balance
               NathanAcct.setSaveMoney(CarolsAcct.getCheckMoney());
               System.out.println("Nathan Now has "+ NathanAcct.getCheckMoney()+ " in his Checking");
               //Prints new results
                 System.out.println("Total money in Nathans savings is " + NathanAcct.getSaveMoney());
                 System.out.println("");
                    //Nathan pays on the loan
                    System.out.println("How much would you like to pay?: ");
                    int payment = scnr.nextInt();
                    if ((NathanAcct.getCheckMoney()) < payment)                   //If payment is more than in checking then the payment will not work
                        System.out.println("There is not enough money in the checking to pay the loan payment");
                    else
                        NathanAcct.payloan(payment);
                    System.out.println("Nathan has "+ NathanAcct.getloan() + " left to pay on the loan");
                    System.out.println("Nathan has "+ NathanAcct.getCheckMoney() + " left in Checking");
           
           System.out.println("END OF CURRENT BANK ACCOUNTS");
            
            
    }
    
}
