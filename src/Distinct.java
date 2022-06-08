import java.util.HashSet;

public class Distinct {
    public Integer distinct(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : A) {
            set.add(i);
        }

        return set.size();
    }
}
