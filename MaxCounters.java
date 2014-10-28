class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] counters = new int[N];
        
        for (int i = 0; i < counters.length; i++) {
            counters[i] = 0;    
        }
        
        
        int max = 0;
        int max_counter = 0;
        
        for (int i = 0; i < A.length; i++) {
            int operation = A[i];
            
            // increase all
            if (operation == N + 1) {
                max_counter = max;
                continue;
            }
            // increase counter
            int counter = counters[operation-1];
            // with all respect to max_counter
            if (counter < max_counter) {
                counter = max_counter;
            }
            // increase counter
            counter++;
            
            // check max
            if (max < counter)
                max = counter;


            
            // write it back
            counters[operation-1] = counter;
        }
        
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < max_counter)
                counters[i] = max_counter;
        }
        
        return counters;
    }
}
