// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int missingElement = 0;
        int[] B = new int[n];
        for(int i = 0; i < n; i++) {
            B[i] = 0;
        }
        
        for(int i = 0; i < n; i++) {
            if(0 < A[i] && A[i] <= n && B[A[i] - 1] == 0) {
                B[A[i] - 1] = A[i];
            }
        }
        
        for(int i = 0; i < n; i++) {
            if(B[i] == 0) {
                missingElement = i + 1;
                break;
            }
        }
        
        return (missingElement == 0 ? n + 1 : missingElement);
    }
}


