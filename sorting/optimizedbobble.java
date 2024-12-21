public class optimizedbobble {
    public static void main(String[] args) {
        int[] arr = { 4,3,2,1 };
        System.out.println("before sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag = true;
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag == true) {
                break;
            }
        }
        System.out.println("after sorting : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
