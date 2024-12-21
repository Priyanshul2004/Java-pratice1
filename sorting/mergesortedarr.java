public class mergesortedarr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];

        for (int i = 0; i < ans.length; i++) {
            if (arr1[i]>arr2[i]) {
                ans[i] = arr2[i];
            }else{
                ans[i] = arr1[i];
            }
        }
    }
}
