class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int i = 1;
        int min_perimeter = 2*(1+N);
        
        while (i*i<=N) {
            if (N%i == 0) {
                 if (2*(i+N/i) < min_perimeter) {
                    min_perimeter = 2*(i+N/i); 
                }
            }
            
            i++;
        }
        
        return min_perimeter; 
    }
}
