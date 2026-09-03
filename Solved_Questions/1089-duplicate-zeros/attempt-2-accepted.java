class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        int n = arr.length;

        // Count how many zeros can be duplicated
        for (int i = 0; i < n - zeros; i++) {
            if (arr[i] == 0) {
                if (i == n - zeros - 1) {   // Edge case: Last zero cannot be fully duplicated
                    arr[n - 1] = 0;
                    n = n - 1;
                    break;
                }
                zeros++;
            }
        }

        int last = n - zeros - 1;

        // Traverse backwards and duplicate zeros
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zeros] = 0;
                zeros--;
                arr[i + zeros] = 0;
            } else {
                arr[i + zeros] = arr[i];
            }
        }
    }
}
