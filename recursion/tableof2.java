public class tableof2 {
    public static void table(int n,int x){
        if (x > 10) {
            return;
        }
        System.out.println(n*x);
        table(n, x+1);
    }
    public static void main(String[] args) {
        int n = 2;
        int strtidx = 1;
        table(n,strtidx);
    }
}