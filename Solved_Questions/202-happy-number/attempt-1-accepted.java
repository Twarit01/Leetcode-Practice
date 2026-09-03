import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) return false; 

            seen.add(n);
            n = sumOfSquares(n);
        }
        return true;
    }
    private int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
