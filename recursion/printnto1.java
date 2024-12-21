public class printnto1 {
    public static int printnum(int n){
        if (n==0) {
            return 1;
        }
        System.out.println(n);
        return printnum(n-1);
    }
    public static void main(String[] args) {
        int x = 10;
        printnum(x);
    }
}