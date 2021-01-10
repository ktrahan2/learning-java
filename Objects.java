public class Objects {

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
    

        Objects myFirst = new Objects(7);
        // myFirst.x = 7;
        System.out.println(myFirst.x);

        Objects myCar = new Objects(4);

        myCar.fullThrottle();
        myCar.speed(200);


    }

}