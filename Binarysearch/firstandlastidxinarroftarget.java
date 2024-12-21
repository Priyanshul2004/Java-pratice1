public class firstandlastidxinarroftarget {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7, 8, 9 };

        int n = arr.length;
        int target = 5;

        boolean flag = false;
        int low = 0;
        int high = arr.length-1;

        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid] == target) {
                flag = true;
                break;
            }else if (arr[mid]>target) {
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        if (flag == false) {
            System.out.println("not avl in the arr ");
        }

        int firstidx = n;
        high = n-1;
        low = 0;

        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]>=target) {
                high = mid-1;
                firstidx = Math.min(firstidx, mid);
            }else{
                low = mid+1;
            }
        }

        System.out.println("first idx ix = "+firstidx);

        int laqstidx = n;
        high = n-1;
        low = 0;

        while (low<=high) {
            int mid = (low+high)/2;
            if (arr[mid]>target) {
                high = mid-1;
                laqstidx = Math.min(laqstidx, mid);
            }else{
                low = mid+1;
            }
        }

        System.out.println("Last idx ix = "+laqstidx);
    }
}
