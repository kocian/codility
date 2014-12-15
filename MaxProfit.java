// you can also use imports, for example:
import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        if (A.length == 0 || A.length == 1)
            return 0;
            
        int maxProfit = 0;
        int minPrice = A[0];
        
        for (int i = 1; i<A.length; i++) {
            maxProfit = Math.max(maxProfit, A[i] - minPrice);
            minPrice = Math.min(A[i], minPrice);
        }
        
        return maxProfit;
    }
}
