import java.util.HashSet;

public class OddOccurrencesInArray {
    public int oddOccurrencesInArray(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : A) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                set.remove(i);
            }
        }

        return set.iterator().next();
    }
}
