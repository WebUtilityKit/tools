import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution1 {
  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<Integer>();
    array.add(1);
    array.add(3);
    array.add(5);
    array.add(7);
    array.add(9);

    Integer target = new Integer(6);
    
    ArrayList<Integer> subset = new ArrayList<Integer>();
    
    for (int i=0; i<array.size(); i++) {
      
      System.out.println("starting at " + array.get(i));
            
      int sum = 0;

      for (int j=i; j<array.size(); j++) {
        
        System.out.println("adding " + array.get(j) + " to sum " + sum);

        subset.add(array.get(j));
        sum += array.get(j);
        
        if (Integer.valueOf(sum).equals(target)) {
            System.out.println("set found " + subset);
            return;
        }


      }
        
      subset.clear();

    
  }
    
        System.out.println("false -- no set found");

}
}
