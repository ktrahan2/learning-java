// reverse the order of the words in place. 

// you are given an array of chars, that are words. the words are in the wrong order. 

//example input { 'c', 'a', 'k', 'e', ' ',
// 'p', 'o', 'u', 'n', 'd', ' ',
// 's', 't', 'e', 'a', 'l' }
// output ' steal pound cake '
//all words contain letters and spaces. and all words are separated by one space. 

// write a function to reverse the order of the characters.
// reverse the entire message
// then reverse each individual word with that method. 
// To find individual words, start at the beginning and go until you hit a space or the length of the message ( after last index )

class ReverseWord {

    public static void reverseChars(char[] message, int leftIndex, int rightIndex) {

        while ( leftIndex < rightIndex ) {

            char temp = message[leftIndex];
            message[leftIndex] = message[rightIndex];
            message[rightIndex] = temp;

            leftIndex++;
            rightIndex--;

            System.out.println(message);
        }
    }

    public static void main(String[] args) {        
        
        char[] message = { 
            'c', 'a', 'k', 'e', ' ',
            'p', 'o', 'u', 'n', 'd', ' ',
            's', 't', 'e', 'a', 'l' 
        };
        reverseChars(message, 0, message.length - 1); // should output message backwards

        int currentWordStartIndex = 0;

        for ( int i = 0; i < message.length; i++ ) {

            if ( i == message.length || message[i] == ' ' ) {
                reverseChars( message, currentWordStartIndex, i - 1 );
                currentWordStartIndex = i + 1;
            }
        }

        System.out.println(message);
    }
}