class Solution {
    public int solution(int[] A) {
        
        int value = 0;
        int size = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                value = A[i];
                size++;
            } else {
                if (value == A[i])
                    size++;
                else
                    size--;
            }
        }
        
        if (size == 0) {
            return 0;
        }

        int count = 0;
        for(int a : A) {
            if (a == value)
                count++;
        }
        
        if (count <= (A.length/2))
            return 0;
        
        int equi_leaders = 0;
        int equi_count = 0;
        for (int i=0; i<(A.length - 1); i++) {
            if (value == A[i])
                equi_count++;
            
            if (equi_count > ((i+1)/2) && (A.length-i-1)/2 < (count - equi_count))
                equi_leaders++;
        }
        
        return equi_leaders;
    }
}
