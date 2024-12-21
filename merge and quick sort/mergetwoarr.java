public class mergetwoarr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int[] ans = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            ans[i] = arr1[i];
        }


        for (int i = 0; i < arr2.length; i++) {
            ans[arr1.length+i] = arr2[i];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}