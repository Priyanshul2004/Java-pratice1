public class selectionsort {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 20, 7, -9, 9, 8 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            int min = Integer.MAX_VALUE;
            int mainidx = -1;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mainidx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mainidx];
            arr[mainidx] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
