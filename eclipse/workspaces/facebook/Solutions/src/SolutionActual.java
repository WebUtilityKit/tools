import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


/*

  a = [1, 2, 3, 4, 5, 6, 7,8]
  b = [2, 4, 6, 8]

*/

class SolutionActual {
  public static void main(String[] args) {
    int[] a = { 1, 3, 5, 7, 0, 0, 0, 0};
    int[] b = { 2, 4, 6, 8 };
    
    int pos = a.length-1;
    int j=b.length-1;
    for (int i=(a.length/2)-1; i>=0;) {
        if (a[i] > b[j]) {
           a[pos] = a[i];
           i--;
        } else {
           a[pos] = b[j];
           j--;
        }
      
        pos--;
    }
    
    System.out.println("");
    System.out.println("done");
  }
  
  
  
}


/* 
Your previous Plain Text content is preserved below:

/*

 * a and b are both SORTED arrays of integers. each contains n sorted integers.
 * a has length 2*n, with the last n slots empty, and b has just n elements.
 * Goal: Write a function that merges the arrays such that the result is sorted.


  n = 4
  
  a = [1, 3, 5, 7, , , , ]
  len(a) = 2*n
  
  b = [2, 4, 6, 8]
  len(b) = n
  
  => [1, 2, 3, 4, 5, 6, 7, 8]
  
  


*/
 