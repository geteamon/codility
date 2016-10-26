// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int maxCounter = 0;
        int updatingMaxCounter = 0;
        int M = A.length;
        int[] counterArray = new int[N];
                
        for(int i = 0; i < M; i++) {
            if(A[i] <= N)  {
                if(counterArray[A[i] - 1] > updatingMaxCounter) {
                    counterArray[A[i] - 1]++;
                }
                else {
                    counterArray[A[i] - 1] = updatingMaxCounter + 1;
                }
                
                if(maxCounter < counterArray[A[i] - 1]) {
                    maxCounter = counterArray[A[i] - 1];
                }
            }
            else {                
                updatingMaxCounter = maxCounter;
            }
        }
        
        for(int i = 0; i < N; i++) {
            if(counterArray[i] < updatingMaxCounter) {
                counterArray[i] = updatingMaxCounter;
            }
        }
        
        return counterArray;
    }
}


