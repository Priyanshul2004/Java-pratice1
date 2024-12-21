public class h3reverseastring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        int n = sb.length();
        for (int i = 0; i < sb.length()/2; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(n-i-1));
            sb.setCharAt(n-i-1,temp);
        }
        System.out.println(sb);
    }
}