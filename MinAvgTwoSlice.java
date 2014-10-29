class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        double[] sum_two = new double[A.length];
        
        double minimum = (double)(A[0] + A[1]) / 2;
        int minimum_index = 0;

        for (int i = 0; i < (A.length -1); i++) {
            double avg = (double)(A[i] + A[i+1])/2;
            if (avg < minimum) {
                minimum = avg;
                minimum_index = i;
            }
        }
        
        if (A.length >= 3) {
            for (int i = 0; i < (A.length - 2); i++) {
                double avg = (double)(A[i] + A[i+1] + A[i+2])/3;
                if (avg < minimum) {
                    minimum = avg;
                    minimum_index = i;
                }   
            }
        }
        
        return minimum_index;
    }
}
