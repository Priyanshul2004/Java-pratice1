package Array;

public class rotatetok {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k=2;
        int i = 0;

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        while (i<k) {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }
        
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}