public class removeduplicatefromstr {
    public static void main(String[] args) {
        String str = "abcdeeffghij";
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                ans += str.charAt(i);
            }
        }
        str = ans;
        System.out.println(str);
    }
}