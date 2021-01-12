import java.util.*;

// each player receieves a score between 0 and 100.
// rank them highest to lowest.

// take an array of unsortedScores and the highes possible score. 
// and return a sorted array, in less than O(n lg n)
//example input int[] unsortedScores = {37, 89, 41, 65, 91, 53}
// output [91, 89, 65, 53, 41, 37]
// create a hashmap with all of the key value pairs being the key is the score, the value is the amount of times it shows up. 
// then create an array with those hash values. 

class TopScore {

    // public Scores {

    // }

    public static int[] sortScores(int[] scores, int highestPossibleScore) {

        int[] scoreCounts = new int[highestPossibleScore + 1];

        for ( int score : scores) {
            scoreCounts[score]++;
        }
        
        int[] sortedScores = new int[scores.length];
        int currentSortedIndex = 0;

        for ( int score = highestPossibleScore; score >= 0; score--) {
            int count = scoreCounts[score];

            for ( int occurence = 0; occurence < count; occurence++) {
    
                sortedScores[currentSortedIndex] = score;
    
                currentSortedIndex++;
    
            }
        }

        for ( int score : sortedScores) {
            System.out.println(score);
        }

        return sortedScores;
    }

    public static void main(String[] args) {
        
        int[] unsortedScores = {37, 89, 41, 65, 91, 53};

        System.out.println(sortScores(unsortedScores, 100));

    }

}