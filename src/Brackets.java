import java.util.Stack;

public class Brackets {
    public int brackets(String S) {
        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack<>();

        if (chars.length == 0) return 1;

        for (char c : chars) {
            if (isOpenParen(c)) {
                stack.add(c);
            } else if (isCloseParen(c)){
                if (stack.isEmpty()) return 0;
                char t = stack.pop();
                if (!matchingParen(t, c)) return 0;
            }
        }

        if (stack.isEmpty()) return 1;

        return 0;
    }

    public boolean isParen(Character c) {
        return (isOpenParen(c) || isCloseParen(c));
    }

    public boolean isOpenParen(Character c) {
        return (c.equals('(') || c.equals('{') || c.equals('['));
    }

    public boolean isCloseParen(Character c) {
        return (c.equals(')') || c.equals('}') || c.equals(']'));
    }

    public boolean matchingParen(Character open, Character close) {
        return ((open.equals('(') && close.equals(')')) ||
                (open.equals('{') && close.equals('}')) ||
                (open.equals('[') && close.equals(']')));
    }
}
