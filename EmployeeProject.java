// -------------------------------------------------------------------------------
// Name: Nathan Workman
// Date:   2/7/2020
// Assignment:  Lab
// Description:   Employee  Program 
// -------------------------------------------------------------------------------
//NOTE: ALL GET/SET methods has been check and works. NOT all is used.
package employeeproject;

public class EmployeeProject {
    public static void main(String[] args) {
////////////////////////////////INITALIZING EMPLOYEE'S//////////////////////////////////////////////////////////////////////////////////////////
        //Initalizing EMPLOYEE'S      "Name, Age, Salary"
        Employee  Workman = new Employee("Nathan",20,18.20);          
        Employee Nesbitt = new Employee("Jodi",19,19.30);
        System.out.println("WELCOME TO THE TECH Firm Lab!");
         System.out.println("There is Two Current Employee's");
         System.out.println();
////////////////////////////////Employee//////////////////////////////////////////////////////////////////////////////////////////      
        //Workman
        System.out.println("------------------------------Employee's-------------------------------------------");
        System.out.println("Employee: ");
        System.out.println(Workman.getName());      
        System.out.println();
        System.out.println("Employee "+ Workman.getName()+ "'s Full Information: ");
        System.out.println(Workman.getEmployee());
        System.out.println();
        System.out.println("Employee: ");
        System.out.println(Nesbitt.getName());      
        System.out.println();
        System.out.println("Employee "+ Nesbitt.getName()+ "'s Full Information: ");
        System.out.println(Nesbitt.getEmployee());
        System.out.println();
        System.out.println("------------------------------Employee Raise-------------------------------------------");
            //Nesbitt gets a raise by 20%
            System.out.println("Nesbitt has worked hard and has got a 20% raise, lets reflect this on her account.");
            Nesbitt.RaiseSalary(.20);
            System.out.println();
            System.out.println("Jodi's new salary is: "+ Nesbitt.getSalary());
            System.out.println();
            System.out.println("Nathan has worked semi-hard and has got a 10% raise, lets reflect this on his account.");
            Workman.RaiseSalary(.10);
            System.out.println();
            System.out.println("Nathans's new salary is: "+ Workman.getSalary());
            System.out.println();
            
////////////////////////////////DataBase Pro//////////////////////////////////////////////////////////////////////////////////////////      
            //Nesbitt is now a DataBase pro, lets show this
            System.out.println("------------------------------DATABASE PRO -------------------------------------------");
            System.out.println("Nesbitt is now a DataBase pro, lets show this");
            DatabasePro Nesbittnew = new DatabasePro("Jodi",19,19.30,"SQL");
            System.out.println();
            System.out.println("Nesbitt's New Job and Tool used for her position is: ");
            System.out.println();
              System.out.println(Nesbittnew.getDatabasePro());
              System.out.println();
              System.out.println("Jodi is now a year older. Let's change this in her account.");
              System.out.println();
              Nesbittnew.setAge(20);
              System.out.println(Nesbittnew.getDatabasePro());
              System.out.println();
              




////////////////////////////////Programmer //////////////////////////////////////////////////////////////////////////////////////////      
            //Workman is now a Programmer, lets show this
            System.out.println("------------------------------Progamer-------------------------------------------");
            System.out.println("Workman is now a Programmer, lets show this");
            Programmer Workmannew = new Programmer("Jodi",19,19.30,"JAVA");
              System.out.println();
              System.out.println("Workmans's New Job and Language used for his position is: ");
            System.out.println();
              System.out.println(Workmannew.getProgrammer());
              System.out.println();
              System.out.println("Nathan is now a year older. Let's change this in his account.");
              System.out.println();
              Workmannew.setAge(21);
              System.out.println(Workmannew.getProgrammer());
              System.out.println();
              System.out.println("------------------------------END-------------------------------------------");
            System.out.println("THIS IS THE END OF THE LAB");
    }
    
    
}
