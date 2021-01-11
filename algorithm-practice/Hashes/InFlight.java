import java.util.*;

//given an array of movie lengths and flight time return back whether or not the person acn watch two movies.
// find ouf if there are two different movies that are less than the flight time. 
// they watch exactly two movies no more no less. 
// dont repeat movies
// example input
    // flight time = 90mins
    // movie lengths = [ 45, 45, 70, 60 ]
// output true 45 + 45

public class InFlight {

    public static boolean findTwoMovies(int[] movieLengths, int flightTime) {

       Set<Integer> movieLengthsSeen = new HashSet<>();

       for ( int firstMovieLength : movieLengths ) {
        
            int matchingSecondMovieLength = flightTime - firstMovieLength;
            if ( movieLengthsSeen.contains(matchingSecondMovieLength)) {
                return true;
            }
            movieLengthsSeen.add(firstMovieLength);
            System.out.print(movieLengthsSeen);

       }
       return false;

    }

    public static void main(String[] args) {

        int flightTime = 90;
        int[] movieLengths = { 15, 45, 45, 60, 30 };

        System.out.println(findTwoMovies(movieLengths, flightTime));

    }
}