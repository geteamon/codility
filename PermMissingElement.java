// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        long totalSum = 0;
        for(int i = 0; i < A.length; i++) {
            totalSum += A[i];
        }
        long n = A.length + 1;
        
        return (int)(((n * (n + 1)) / 2) - totalSum);
    }
}


