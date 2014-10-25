// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
    int sum = ((A.length+1)*(A.length+2))/2;
    
    int missing = sum;
    for (int i = 0; i<A.length; i++) { 
        missing -= A[i];
    }
    
    return missing;
    }
}
