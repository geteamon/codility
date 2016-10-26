// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int totalSum = 0;
        int[] Acopy = new int[n];
        for(int i = 0; i < n; i++) {
            Acopy[i] = i + 1;
        }
        for(int i = 0; i < n; i++) {
            if(A[i] > n || Acopy[A[i] - 1] == 0) {
                return 0;
            }
            totalSum += A[i];
            Acopy[A[i] - 1] = 0;
        }
        
        int permSum = (n * (n + 1)) / 2;
        
        return (totalSum == permSum ? 1 : 0);
    }
}
