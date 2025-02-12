public class lowerbound {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int target = 4;
        int n = arr.length;
        int low = 0;
        int high = arr.length-1;
        int lb = n;

        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        System.out.println(lb);
    }
}
