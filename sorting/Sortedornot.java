public class Sortedornot {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 7, 2, 4, 66};

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i+1]) {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }
    }
}