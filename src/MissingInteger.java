import java.util.Arrays;

public class MissingInteger {
    public int missingInteger(int[] A) {
        Arrays.sort(A);
        int num = 1;

        for (int i : A) {
            if (i == num) {
                num++;
            }
        }
        return num;
    }
}
