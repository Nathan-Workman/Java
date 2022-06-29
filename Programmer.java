// -------------------------------------------------------------------------------
// Name: Nathan Workman
// Date:   2/7/2020
// Assignment:  Lab
// Description:   Employee  Program 
// -------------------------------------------------------------------------------
package employeeproject;

 ////////////////////////////////CLASS PROGRAMMER ///////////////////////////////////////////////////////////////////////////////////////////
public class Programmer extends Employee{
     private String language;
     
////////////////////////////////CONSTRUCTOR//////////////////////////////////////////////////////////////////////////////////////////
public Programmer(String name, int age, double salary, String language) {
        super(name, age, salary);
        this.language = language;
    }

////////////////////////////////SET METHODS//////////////////////////////////////////////////////////////////////////////////////////  
public void setLang(String inLang){
        this.language = inLang;
    }

////////////////////////////////GET METHODS//////////////////////////////////////////////////////////////////////////////////////////
 public String getLang() {
        return this.language;
    }
 
////////////////////////////////FULL INFORMATION/////////////////////////////////////////////////////////////////////////////////////
 public String getProgrammer(){
        String Programmer = " Name: "+ this.name + ", Age: "+ this.age + ", Salary: "+ this.salary + " , Language: "+this.language;
        return Programmer;
        
    }
}
