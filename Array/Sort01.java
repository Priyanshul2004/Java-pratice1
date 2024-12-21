package Array;

public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0};
        int n = arr.length;
        int numofzero = 0;

        for (int i = 0; i <= n-1; i++) {
            if (arr[i] == 0) {
                numofzero++;
            }
        }

        for (int i = 0; i <= n-1; i++) {
            if (i<numofzero) {
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
