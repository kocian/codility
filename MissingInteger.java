class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        boolean[] flags = new boolean[A.length+1];
        
        for (int flag = 0; flag < flags.length; flag++) {
            flags[flag] = false;
        }
        
        for (int i = 0; i < A.length; i++) {
            if (A[i]<=0 || A[i] > A.length)
                continue;
            
            flags[A[i]] = true;
        }
        
        for (int flag = 1; flag < flags.length; flag++) {
            if (!flags[flag])
                return flag;
        }
        
        return A.length+1;
    }
}
