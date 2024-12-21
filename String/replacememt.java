public class replacememt {
    public static void main(String[] args) {
        String str  = "aaabbbcc";
        char target = 'c';

        String ans = "";

        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'c') {
                ans += 'd';
            }else{
                ans += ch;
            }
        }

        str = ans ;

        System.out.println(str);
    }
}