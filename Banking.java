// -------------------------------------------------------------------------------
// Name: Nathan Workman
// Date:   1/24/20
// Assignment:  Lab
// Description:   Bank Account Program (This is the clas file)
// -------------------------------------------------------------------------------


package bankingclassproject;

//New class Banking, Saves all new accounts 
public class Banking {
    String name;
    int checking;
    int savings;
    int loanamount;                                         //New loan amount in class
// constructor Method, allows us to enter new accounts easier
    public Banking(String givenName, int givenChecking, int givenSavings, int givenLoanamount) {
        this.name = givenName;
        this.checking = givenChecking;
        this.savings = givenSavings;
        this.loanamount= givenLoanamount;                   //Creates a new loan account for the class
    }
// Method to get total money from an account
    public int getTotalMoney() {
        return (this.checking + this.savings);
    }
// Method to get the money only in the checking
    public int getCheckMoney(){
    return this.checking;
}
    // Method to get the money only in the savings
    public int getSaveMoney(){
    return this.savings;
}
    // Method to set the balance from checking to something new
    public void setCheckMoney(int newchecking){
        this.checking = newchecking;
    }
    // Method to set the balance from savings to something new
    public void setSaveMoney(int newsavings){
        this.savings = newsavings;
    }
    // Method to set the Loan amount 
    public void setloan(int newloan){
        this.loanamount = newloan;
    }
    // Method to pay the Loan  
    public void payloan(int newpay){
        this.loanamount = this.loanamount - newpay;
        this.checking = this.checking - newpay;
    }
     // Method to get the loan left
    public int getloan(){
    return this.loanamount;
}
    }


