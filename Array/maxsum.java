public class maxsum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }

        System.out.println("sum of arr "+sum);
    }
}
