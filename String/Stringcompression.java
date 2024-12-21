public class Stringcompression {
    public static void main(String[] args) {
        String s = "aaaaabbbbbbcccccddeee";
        char[] ch = s.toCharArray();

        String ans = "";

        int i = 0;
        int j = 0;

        while (j < ch.length) {
            if (ch[i] == ch[j]) {
                j++;
            } else {
                ans += ch[i];
                int length = j - i;
                if (length > 1) {
                    ans += length;
                    i = j;
                }
            }
        }
        ans += ch[i];
        int length = j - i;
        if (length > 1) {
            ans += length;
            i = j;
        }

        System.out.println(ans);
    }
}
