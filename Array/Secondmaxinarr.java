package Array;

public class Secondmaxinarr {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) {
                secondmax = Math.max(secondmax, arr[i]);
            }
        }
        System.out.println(secondmax);
    }
}
