class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        
        int number = 0;
        
        if (A%K == 0)
            number++;
        
        number+= B/K - A/K;
        
        return number;
    }
}
