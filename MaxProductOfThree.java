// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8  
        
        Arrays.sort(A);
        
        
        int max1 = A[0]*A[1]*A[A.length-1];
        
        int max2 = A[A.length-1]*A[A.length-2]*A[A.length-3];
        
        if (max1 > max2)
            return max1;
        
        return max2;
    }
}
