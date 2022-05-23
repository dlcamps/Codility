public class BinaryGap {
    public static void main(String[] args) {
        int x = 7;

        BinaryGap binaryGap = new BinaryGap();
        binaryGap.binaryGap(x);
    }

    public int binaryGap(int N) {
        char[] b = Integer.toBinaryString(N).toCharArray();
        char lastDigit = b[0];
        int max = 0;
        int curr = 0;

        for (char c : b) {
            if (lastDigit == '0' && c == '0') curr++;
            if (lastDigit == '1' && c == '0') curr = 1;
            if (lastDigit == '0' && c == '1') max = Math.max(max, curr);
            lastDigit = c;
        }
        return max;
    }
}
