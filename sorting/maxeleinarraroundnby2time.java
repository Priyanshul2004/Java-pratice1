import java.util.Arrays;

public class maxeleinarraroundnby2time {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,1,1,1,1,1};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n/2]);
    }
}
