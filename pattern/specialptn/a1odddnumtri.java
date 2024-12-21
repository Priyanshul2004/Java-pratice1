package specialptn;

public class a1odddnumtri {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(2*j-1+" ");
            }
            System.out.println();
        }
    }
}