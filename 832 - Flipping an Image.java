class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A.length;
        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                A[i][j] ^= 1;
                A[i][len - 1 -j] ^= 1;
                temp = A[i][j] + A[i][len - 1 -j];
                A[i][j] = A[i][len - 1 - j];
                A[i][len - 1 - j] = temp - A[i][j];
            }
            if (len % 2 == 1) {
                A[i][len / 2] ^= 1;
            }
        }
        return A;
    }
}