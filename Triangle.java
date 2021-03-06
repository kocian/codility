// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
      // write your code in Java SE 8
      
       Arrays.sort(A);
       
        if (A.length < 3)
            return 0;
            
        for (int i = 0; i<A.length - 2; i++) {
            long a = A[i];
            long b = A[i+1];
            long c = A[i+2];
            
            if (a + b > c)
                return 1;
        }
        
        return 0;
    }
}
