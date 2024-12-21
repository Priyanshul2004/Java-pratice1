public class ArrayisSorted {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        boolean sorted = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]<arr[i+1]) {
                sorted = true;
            }else{
                sorted = false;
            }
        }
        if (sorted == true) {
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}
