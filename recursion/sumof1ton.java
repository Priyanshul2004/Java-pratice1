public class sumof1ton {

    public static int sumof1ton(int n){
        if (n == 1) {
            return 1;
        }
        return n+sumof1ton(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumof1ton(n));
    }
}
