class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int[] results = new int[A.length + 1];
        
        for (int r =0; r < results.length; r++ )
            results[r] = 0;

        for (int i = 0; i < A.length; i++) {
            int number = A[i];
            if (number > A.length)
                return 0;
            if (results[number] == 1)
                return 0;
            
            results[number] = 1;
        }
        
        for (int number = 1; number < results.length; number++) {
            if (results[number] == 0)
                return 0;
        }
        
        return 1;
    }
}
