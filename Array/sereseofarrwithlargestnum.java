public class sereseofarrwithlargestnum {
    public static void main(String[] args) {
        int[] arr = {73,4,52,63,43,8,88,44,99};

        for(int ele:arr){
            System.out.print(ele+" ");
        }

        System.out.println();

        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = -1;

        for (int i = 0; i < n-1; i++) {
            int mx = Integer.MIN_VALUE;
            for (int j = i+1; j < n; j++) {
                mx = Math.max(mx, arr[j]);
            }
            ans[i] = mx;
        }

        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
