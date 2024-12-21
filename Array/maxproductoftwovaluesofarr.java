public class maxproductoftwovaluesofarr {
    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 7, 2};
        int firstmax = Integer.MIN_VALUE;
        int seconmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            firstmax = Math.max(firstmax, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != firstmax) {
                seconmax = Math.max(seconmax, arr[i]);
            }
        }

        System.out.println(firstmax);
        System.out.println(seconmax);

        System.out.println("maxium product of two value in arr "+ firstmax*seconmax);
    }
}
