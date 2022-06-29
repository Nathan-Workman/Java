// -------------------------------------------------------------------------------
// Name: Nathan Workman
// Date:   2/7/2020
// Assignment:  Lab
// Description:   Employee  Program 
// -------------------------------------------------------------------------------
package employeeproject;
 ////////////////////////////////CLASS EMPLOYEE ///////////////////////////////////////////////////////////////////////////////////////////

public class Employee implements RaiseSalary{
     // class attributes
    public String name;
    public int age;
    public double salary;
    
      
////////////////////////////////CONSTRUCTOR//////////////////////////////////////////////////////////////////////////////////////////
    // constructor 
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
       
    }
////////////////////////////////SET METHODS//////////////////////////////////////////////////////////////////////////////////////////  
public void setName(String inName){
        this.name = inName;
    }
public void setAge(int inAge){
        this.age = inAge;
    }
public void setSalary(double inSalary){
        this.salary = inSalary;
    }
    
////////////////////////////////GET METHODS//////////////////////////////////////////////////////////////////////////////////////////
 public String getName() {
        return this.name;
    }
public int getAge() {
        return this.age;
    }
public double getSalary() {
        return this.salary;
    }  
////////////////////////////////RAISE SALARY//////////////////////////////////////////////////////////////////////////////////////////
public void RaiseSalary(double raiseamt){
       this.salary= (this.salary * raiseamt) + this.salary;
    }
////////////////////////////////FULL INFORMATION/////////////////////////////////////////////////////////////////////////////////////
 public String getEmployee(){
        String Employee = " Name: "+ this.name + ", Age: "+ this.age + ", Salary: "+ this.salary;
        return Employee;
        
    }
}
