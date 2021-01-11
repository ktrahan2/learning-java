import java.util.*;

//figure out if a string is a permutable palindrome
// input civic - true
// input iivcc - true

public class Palindrome {

    public static boolean createHashMap(String word) {
        
        Set<Character> unpairedCharacters = new HashSet<>();

        for ( int i = 0; i < word.length(); i++ ) {
            char currentLetter = word.charAt(i);
            if ( unpairedCharacters.contains(currentLetter)) {
                unpairedCharacters.remove(currentLetter);
            } else {
                unpairedCharacters.add(currentLetter);
            }
        }

        return unpairedCharacters.size() <= 1;

    }

    public static void main(String[] args) {

        System.out.println(createHashMap("civic"));

    }

}