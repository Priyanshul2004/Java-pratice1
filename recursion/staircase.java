public class staircase {
    public static int prob(int n){
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return prob(n-1)+prob(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(prob(n));
    }
}