import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution3 {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("bcabc");

        char[] letters = { 'a', 'b', 'c', 'd' };
        int[] counts = { 0, 0, 0, 0 };
        
        for (int i=0; i<letters.length; i++) {
            char letter = letters[i];
            
            System.out.println("letter " + letter);
            if (word.toString().indexOf(letter) > -1) {
                counts[i] = counts[i] + 1;   
            
                if (counts[i] > 1) {
                    System.out.println("replacing " + letter);
                    word.deleteCharAt(i);
                }
            }
        }
        
        System.out.print("Counts ");
        for (int i=0; i<counts.length; i++) {
            System.out.print(counts[i] + " ");
        }
        System.out.println();
       // word.replaceAll(" ", "");
        
        System.out.println("New word " + word);
        System.out.println("done");
    }
    

    
}
