public class MaxDoubleSliceSum {
    public int maxDoubleSliceSum(int[] A) {
        int N = A.length;
        int[] S1 = new int[N];
        int[] S2 = new int[N];
        int max = 0;

        for (int i = 1; i < N-1; i++) {
            S1[i] = Math.max(0, S1[i-1] + A[i]);
        }

        for (int j = N-2; j > 0; j--) {
            S2[j] = Math.max(0, S2[j+1] + A[j]);
        }

        for (int k = 1; k < N-1; k++) {
            max = Math.max(max, S1[k-1] + S2[k+1]);
        }

        return max;
    }
}
