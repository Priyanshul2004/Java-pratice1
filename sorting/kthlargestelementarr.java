public class kthlargestelementarr {
    public static void main(String[] args) {
        int arr[] = {7,6,5,4,3,2,1};
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int kthlargest = n - k;

        System.out.println("k th largest element in arrray = " + arr[kthlargest]);
    }
}
