class Solution {
    public int solution(int X, int[] A) {
        int[] positionToMinute = new int[X+1];
        
        for (int position = 0; position < positionToMinute.length; position++) {
            positionToMinute[position] = -1;
        }
        
        for (int minute = 0; minute < A.length; minute++) {
            int position = A[minute];
            if (positionToMinute[position] != -1)
                continue;
            
            positionToMinute[position] = minute;
        }
        
        int max = 0;
        
        for (int position = 1; position < positionToMinute.length; position++) {
            int minute = positionToMinute[position];
            if (minute == -1)
                return -1;
            
            if (max < minute)
                max = minute;
        }
        
        return max;
    }
}
