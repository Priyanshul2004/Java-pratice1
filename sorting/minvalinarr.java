public class minvalinarr {
    public static void main(String[] args) {
        int arr[] = {2,3,41,2,1,-2,4};

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        System.out.println(min);
    }
}
