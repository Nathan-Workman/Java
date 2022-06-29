/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectdesign;


public class ObjectDesign {

    public static void main(String[] args) {
        
        
        Robot robot1 = new Robot("Tom","red",30);
        Robot robot2 = new Robot("Jerry","blue",40);
        //Void methods handle excecution in the class
        robot1.introduceSelf();
        robot2.introduceSelf();
        
        //get methods return a value
        String robotIntroduction - robot1.getIntroduction();
        System.out.println(robotIntroduction);
        
        //Set methods set a value
        robot1.setName("Sally");
        robot1.introduceSelf();
        
    }
    
//}


//This is the class we want to study
public class Robot{
    String name;
    String color;
    int weight;
    //Constructor
    public Robot(String givenName, String givenColor, int givenWeight){
        this.name = givenName;
        this.color = givenColor;
        this.weight = givenWeight;
    }
    //void- nothing is required
    public void introduceSelf(){
        System.out.println("My name is" + this.name);
        
    }
    //get method returns something
    public String getIntroduction(){
        return ("My name using getIntroduction is"+ this.name);
    }
    //set name-no return 
    public void setName(String newname){
        this.name = newname;
    }
}
}
