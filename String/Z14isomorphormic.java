public class Z14isomorphormic {
    public static void main(String[] args) {
        String s = "mod";
        String t = "abc";

        if (s.length() != t.length()) {
            System.out.println("Not valid");
            return;
        }

        int a[] = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) ch;

            if (a[idx] == '\0') {
                a[idx] = dh;
            } else {
                if (a[idx] != dh) {
                    System.out.println("not valid");
                    return;
                }
            }
        }

        int b[] = new int[128];

        for (int i = 0; i < t.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) dh;

            if (b[idx] == '\0') {
                b[idx] = ch;
            } else {
                if (b[idx] != ch) {
                    System.out.println("Not valid");
                }
            }
        }

        System.out.println("Valid");
    }
}
