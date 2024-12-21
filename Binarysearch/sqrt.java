public class sqrt {
    public static void main(String[] args) {
        int x = 25;

        int low = 0;
        int high = x;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == x) {
                System.out.println(mid);
                return;
            } else if (mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(high);
    }
}
