public class insertionsort {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 20, 7, -9, 9, 8 }; 

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j>=1;j--){
                if (arr[j]<arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
