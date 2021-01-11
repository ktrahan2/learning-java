import java.util.*;

//given two sorted arrays of integers merge the list so that the order numbers stay sorted. 
// keep track of my index, partner index, and merge index.
// while the merged index is less than the merged arrays length keep going
// check to see if either mine or partners array is empty
// if im not empty, and either my partner is exhausted or my value is lower then theirs. make my current index value the current merged index
// increment index depending on which was added. then increment the merged list index.
// repeats until the mergedarray is at the length of the other two arrays length sum. 

public class MergeSortedArray {

    public static int[] mergeArrays(int[] myArray, int[] partnerArray) {
        
        int[] mergedArray = new int[myArray.length + partnerArray.length];

        int currentIndexMine = 0;
        int currentIndexPartner = 0;
        int currentIndexMerged = 0;

        while ( currentIndexMerged < mergedArray.length ) {

            boolean isMineExhausted = currentIndexMine >= myArray.length;
            boolean isPartnerExhausted = currentIndexPartner >= partnerArray.length;

            if ( !isMineExhausted && (isPartnerExhausted || myArray[currentIndexMine] < partnerArray[currentIndexPartner])) {
                mergedArray[currentIndexMerged] = myArray[currentIndexMine];
                currentIndexMine++;
            } else {
                mergedArray[currentIndexMerged] = partnerArray[currentIndexPartner];
                currentIndexPartner++;
            }

            currentIndexMerged++;
        }

        for ( int number : mergedArray ) {
            System.out.println(number);
        }

        return mergedArray;

    }

    public static void main( String[] args ) {

        int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

        System.out.println(mergeArrays(myArray, alicesArray));

    }

}