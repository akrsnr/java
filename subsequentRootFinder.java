 // no need to comment for this code
 
 // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
       public int solution(int A, int B) {
        int count = 0;
        int num = 0;

        int max = Integer.MIN_VALUE;
        for (int i = A; i <= B ; i++) {
            count = 0;
            if (Math.sqrt(i) % 1 == 0) {
                num = i;
                while (num > 1) {
                    if (Math.sqrt(num) % 1 == 0) {
                        num = (int)Math.sqrt(num);
                        count++;
                    }
                    else {
                        num /= 2;
                    }
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
