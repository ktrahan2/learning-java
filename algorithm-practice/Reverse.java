//take an array of characters and reverses the letters in place. 

// input ["a". "b", "c"]
// output ["c", "b", "a"]

class Reverse {

    public static void reverse(char[] arrayOfChars) {
        
        int leftIndex = 0;
        int rightIndex = arrayOfChars.length - 1;

        while ( leftIndex < rightIndex ) {

            char temp = arrayOfChars[leftIndex];
            arrayOfChars[leftIndex] = arrayOfChars[rightIndex];
            arrayOfChars[rightIndex] = temp;
            
            leftIndex++;
            rightIndex--;
        }
        System.out.println(arrayOfChars);
    }

    

    public static void main(String[] args) {
        char[] arrayOfChars = { 'a', 'b', 'c', 'd' };
        reverse(arrayOfChars);
        
        
    }
}