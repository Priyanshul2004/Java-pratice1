public class putzerosinlast {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,3,5};
        int n = arr.length;
        int numofzero = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                numofzero++;
            }
        }

        System.out.println(numofzero);

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];  
                index++;
            }
        }

        for (int i = index; i < n; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}