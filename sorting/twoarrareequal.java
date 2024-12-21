public class twoarrareequal {
    public static void main(String[] args) {
        int[] arr1 = {5,4,7,6};
        int[] arr2 = {7,6,4,5};

        int n = arr1.length;
        int m = arr2.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr1[j]>arr1[j+1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        System.out.println("first array ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m-1-i; j++) {
                if (arr2[j]>arr2[j+1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }

        System.out.println();

        System.out.println("second array ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]+" ");
        }

        boolean flag = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                flag = true;
            }else{
                flag = false;
                break;
            }
        }

        System.out.println();

        if (flag == true) {
            System.out.println("both array is same ");
        }else{
            System.out.println("both array is different ");
        }
    }
}