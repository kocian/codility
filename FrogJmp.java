class Solution {
    public int roundUp(double number) {
        int roundDown = (int) number;
        
        if (roundDown != number)
            return roundDown + 1;
        
        return roundDown;
    }

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int distance = Y - X;
        int numberOfJumps = roundUp((double)distance/D);
        
        return numberOfJumps;
    
    }
}
