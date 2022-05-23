public class CyclicRotation {
    public int[] cyclicRotation(int[] A, int K) {
        int n = A.length;
        int[] R = new int[n];

        for (int i = 0; i < n; i++) {
            R[(K + i) % n] = A[i];
        }

        return R;
    }
}
