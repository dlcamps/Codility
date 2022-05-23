import java.util.Stack;

public class StrSymmetryPoint {
    public int strSymmetryPoint(String S) {
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();

        if (chars.length == 1) return 0;
        if (chars.length % 2 == 0) return -1;

        int mid = (chars.length / 2);

        for (int i = 0; i < mid; i++) {
            stack.push(chars[i]);
        }

        for (int j = mid + 1; j < chars.length; j++) {
            if (chars[j] != stack.pop()) return -1;
        }

        return mid;
    }
}
