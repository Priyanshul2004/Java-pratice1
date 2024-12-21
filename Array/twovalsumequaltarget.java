package Array;

public class twovalsumequaltarget {
    public static void main(String[] args) {
        int[] arr = {6,5,1,4,2};
        int target = 7;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == target) {
                    System.out.println(arr[i]+" and " +arr[j]);
                }
            }
        }
    }
}
