package robot;
// This class is just for testing Robot.
// Note that this class has the same name as this file.
public class TestRobot {
    public static void main(String[] args) {
//        Robot robot1 = new Robot();
//        robot1.name = "Tom";
//        robot1.color = "red";
//        robot1.weight = 30;
//
//        Robot robot2 = new Robot();
//        robot2.name = "Jerry";
//        robot2.color = "blue";
//        robot2.weight = 40;

        Robot robot1 = new Robot("Tom", "red", 30);
        Robot robot2 = new Robot("Jerry", "blue", 40);
        // void methods handle excecution in the class
        robot1.introduceSelf();
        robot2.introduceSelf();
        // get methods return a value
        String robotIntroduction = robot1.getIntroduction();
        System.out.println(robotIntroduction);
        // set methods set a value
        robot1.setName("Sally");
        robot1.introduceSelf();
    }
}


