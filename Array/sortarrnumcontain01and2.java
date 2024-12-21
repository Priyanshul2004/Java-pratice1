package Array;

public class sortarrnumcontain01and2 {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 1, 2, 2, 0, 0, 0 };
        int n = arr.length;
        int numofzero = 0;
        int numofone = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                numofzero++;
            }else if (arr[i] == 1) {
                numofone++;
            }
        }

        System.out.println("num of zero " + numofzero);
        System.out.println("num of one " + numofone);

        for (int i = 0; i < arr.length; i++) {
            if (i < numofzero) {
                arr[i] = 0;
            } else if (i < numofone+numofzero) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
