import java.util.HashSet;

public class FirstUnique {
    public int firstUnique(int[] A) {
        HashSet<Integer> set_duplicates = new HashSet<>();
        HashSet<Integer> set_singles = new HashSet<>();

        for (int i : A) {
            if (set_duplicates.contains(i)) {
                continue;
            } else {
                if (set_singles.contains(i)) {
                    set_singles.remove(i);
                    set_duplicates.add(i);
                } else {
                    set_singles.add(i);
                }
            }
        }

        for (int i : A) {
            if (set_singles.contains(i)) return i;
        }

        return -1;
    }
}
