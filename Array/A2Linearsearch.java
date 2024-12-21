public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int t = 5;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == t) {
                found = true;
            }
        }

        if (found == true) {
            System.out.println("T is in arr");
        }else{
            System.out.println("T is not in the arr");
        }
    }
}
