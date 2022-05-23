public class MaxCounters {
    public int[] maxCounters(int N, int[] A) {
        int[] R = new int[N];
        int max = 0;
        int prev = 0;

        for (int i = 0; i < A.length; i++) {
            int op = A[i];

            if (op == N + 1) {
                prev = max;
            } else {
                int counter = op - 1;
                if (R[counter] < prev) {
                    R[counter] = prev + 1;
                } else {
                    R[counter]++;
                }
                if (R[counter] > max) {
                    max = R[counter];
                }
            }
        }

        for (int j = 0; j < N; j++) {
            if (R[j] < prev) {
                R[j] = prev;
            }
        }

        return R;
    }
}
