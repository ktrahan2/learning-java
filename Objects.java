import java.util.ArrayList;
import java.util.Collections;

public class Objects {


    public static void myArray() {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("Mustang");

        Collections.sort(cars);

        System.out.println(cars);
    }

    private String name; //private has restricted access

    //getter
    public String getName() {
        return name;
    }

    //setter 
    public void setName(String newName) {
        this.name = newName;
    }

    int x = 5, y = 3; // this is an attribute of the class/ or field

    public void fullThrottle() {
        System.out.println("The car is going fast as");
    }

    public void speed(int maxSpeed) {
        System.out.println("Max Speed is: " + maxSpeed + "mph");
    }

    //this is the constructor. You can set this up to help initialize objects with specific information.
    public Objects(int y) {
        x = y;
    }

    public static void main(String[] args) {
    
        myArray();
        Objects myFirst = new Objects(7);
        // myFirst.x = 7;
        System.out.println(myFirst.x);

        Objects myCar = new Objects(4);

        myCar.fullThrottle();
        myCar.speed(200);


    }

}