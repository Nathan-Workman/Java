package robot;
// This is the class we want to study.
public class Robot {
    String name;
    String color;
    int weight;
// constructor
    public Robot(String givenName, String givenColor, int givenWeight) {
        this.name = givenName;
        this.color = givenColor;
        this.weight = givenWeight;
    }
// void - nothing is returned
    public void introduceSelf() {
        System.out.println("My name is " + this.name);
    }
// get method returns something
    public String getIntroduction(){
    return ("My name using getIntroduction is " + this.name);
}
    //set name - no return
    public void setName(String newname){
        this.name = newname;
    }
    }