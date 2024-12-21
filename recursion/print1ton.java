public class print1ton {

    static int n;

    public static int printton(int x) {
        if (x > n) {
            return n;
        }
        System.out.println(x);
        return printton(x + 1);
    }

    public static void main(String[] args) {
        n = 20;
        printton(1);
    }
}
