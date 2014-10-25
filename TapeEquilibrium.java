Class Solution {
    public int abs (int n) {
        if (n<0)
            return n * -1;
        return n;
    }
    public int solution(int[] A) {
        // count sum
        int sum = 0;
        
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        
        int leftSum = 0;
        int minimumDiff = abs(A[0] - sum + A[0]);
        for(int i = 0; i < (A.length -1); i++) {
            leftSum +=A[i];
            int diff = abs(leftSum - sum + leftSum);
            if (diff<minimumDiff)
                minimumDiff = diff;
        }
        return minimumDiff;
    }
}
