import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {
        String[] words = { "a", "ab", "abc", "d", "cd", "bcd", "abcd" };
        
        int max = 0;
        
        for (int i=0; i<words.length; i++) {
            String wordOne = words[i];
            
            for (int j=0; j<words.length; j++) {
                String wordTwo = words[j];
                
                if (!shareLetters(wordOne, wordTwo)) {
                    if (value(wordOne, wordTwo) > max) {
                        max = value(wordOne, wordTwo);
                    }    
                }
            }
        }

        System.out.println("max = " + max);
        System.out.println("done");
    }
    
    public static boolean shareLetters(String one, String two) {
        for (int i=0; i<one.length(); i++) {
            char c = one.charAt(i);
            
            if (two.indexOf(c) > -1) {
                return true;
            }
        }
        
        return false;
    }
    
    
    public static int value(String one, String two) {
        return one.length() * two.length();
    }
    
    
}
