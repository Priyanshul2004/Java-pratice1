package Array;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int j = n-1-i;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
