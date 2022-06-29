// -------------------------------------------------------------------------------
// Name: Nathan Workman
// Date:   2/7/2020
// Assignment:  Lab
// Description:   Employee  Program 
// -------------------------------------------------------------------------------
package employeeproject;

 ////////////////////////////////CLASS DATABASEPRO ///////////////////////////////////////////////////////////////////////////////////////////

public class DatabasePro extends Employee{
    private String databasetool;
    
////////////////////////////////CONSTRUCTOR//////////////////////////////////////////////////////////////////////////////////////////
public DatabasePro(String name, int age, double salary, String databasetool) {
        super(name, age, salary);
        this.databasetool = databasetool;
    }
////////////////////////////////SET METHODS//////////////////////////////////////////////////////////////////////////////////////////  
public void setDatatool(String inData){
        this.databasetool = inData;
    }

////////////////////////////////GET METHODS//////////////////////////////////////////////////////////////////////////////////////////
 public String getDatatool() {
        return this.databasetool;
    }
////////////////////////////////FULL INFORMATION/////////////////////////////////////////////////////////////////////////////////////
 public String getDatabasePro(){
        String DatabasePro = " Name: "+ this.name + ", Age: "+ this.age + ", Salary: "+ this.salary + " , DatabaseTool: "+this.databasetool;
        return DatabasePro;
        
    }
}
