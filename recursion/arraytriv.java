public class arraytriv {

    public static void printarr(int i, int[] arr) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        printarr(i + 1, arr);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        printarr(0, arr);
    }
}
