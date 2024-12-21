package Array;

public class reverse2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int n = arr.length;

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int i = 0;
        int j = n-1;

        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]+" ");
        }
    }
}
