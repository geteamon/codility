

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int totalSum = 0;
        for(int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }
        
        int minDiff = Integer.MAX_VALUE;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum = totalSum - leftSum;
            if(Math.abs(leftSum - rightSum) < minDiff) {
                minDiff = Math.abs(leftSum - rightSum);
            }
        }
        
        return minDiff;
    }
}


