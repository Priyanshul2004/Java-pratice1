public class h2Toggle {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("PRIYAnshul");
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;

            if (ascii>65 && ascii<97) {
                ascii += 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }else{
                ascii -= 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
        }
        System.out.println(sb);
    }
}