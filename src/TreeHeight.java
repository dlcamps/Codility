class Tree {
    public int x;
    public Tree l;
    public Tree r;
}

public class TreeHeight {
    public int treeHeight(Tree T) {
        if (T == null) return 0;

        int left = 0;
        int right = 0;

        if (T.l != null) {
            left = 1 + treeHeight(T.l);
        }

        if (T.r != null) {
            right = 1 + treeHeight(T.r);
        }

        return Math.max(left, right);
    }
}
