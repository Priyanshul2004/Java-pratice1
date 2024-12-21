public class multiof1ton {
    public static int multiofn(int n){
        if (n == 1) {
            return 1;
        }
        return n*multiofn(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(multiofn(n));
    }
}
