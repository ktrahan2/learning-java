import java.util.*;

// there are two registers. 
    // one accepts takes out, the other dine in
    // write a method to make sure that the orders are being done first come first served.

    // example input 
        //   Take Out Orders: [1, 3, 5]
        // Dine In Orders: [2, 4, 6]
        //  Orders: [1, 2, 4, 6, 5, 3]
    //output false, its not first come first serve

    // example passing 
        // Take Out Orders: [17, 8, 24]
        // Dine In Orders: [12, 19, 2]
        //  Served Orders: [17, 8, 12, 19, 24, 2]
    // output true



public class FirstComeFirstServe {

    public static boolean correctOrder(int[] takeout, int[] dinein, int[]served) {

        int takeoutIndex = 0;
        int dineinIndex = 0;
        int servedIndex = 0;

        while ( servedIndex < served.length ) {
            if ( takeoutIndex < takeout.length && served[servedIndex] == takeout[takeoutIndex] ) {
                takeoutIndex++;
            } else if ( dineinIndex < dinein.length && served[servedIndex] == dinein[dineinIndex] ) {
                dineinIndex++;
            }
            servedIndex++;
        }

        if ( takeoutIndex == takeout.length && dineinIndex == dinein.length ) {
            return true;
        } else {
            return false;
        }
        
    }


    public static void main(String[] args) {

        int[] takeout = { 17, 8 , 24};
        int[] dinein = { 12, 19 , 2};
        int[] served = { 17, 8, 12, 19, 24, 2};

        System.out.println(correctOrder(takeout, dinein, served));

    }
}