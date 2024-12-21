public class binarysearch {
    public static void main(String[] args) {
        int arr[] = {2,3,6,7,8,9,10,11};
        int target = 3;
    
        boolean flag = false;
        int low = 0;
        int high = arr.length-1;
    
        for (int i = 0; i < arr.length; i++) {
            int mid = (low+high)/2;
            if (arr[mid] == target) {
                flag = true;
            }else if (target > mid) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    
        if (flag == true) {
            System.out.println("Target is in the array");
        }else{
            System.out.println("Target is not in the array");
        }
    }
}