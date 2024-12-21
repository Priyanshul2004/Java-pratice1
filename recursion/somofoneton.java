public class somofoneton {

    public static int sumofn(int n){
        if (n == 0) {
            return 0;
        }
        return n+sumofn(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sumofn(n));
    }
}