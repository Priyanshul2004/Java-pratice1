import java.util.Arrays;
import java.util.*;

public class missingelementinarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int start = 1;
        boolean found = true;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] == start) {
                start++;
            }else{
                found = false;
            }
        }

        if (found == false) {
            System.out.println(start+" is missing");
        }else{
            System.out.println("missing element is "+start);
        }
    }
}


// import java.util.Arrays;

// public class MissingElementInArr {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5, 6};  // Example array
//         int n = arr.length;  // Size of the array
//         int start = 1;  // Starting value
//         Arrays.sort(arr);
//         for (int i = 0; i < n; i++) {
//             if (arr[i] != start) {
//                 System.out.println(start + " is missing");
//                 return;  // Exit after finding the missing element
//             }
//             start++;  // Increment start for the next expected number
//         }
//         System.out.println("Missing element is " + (start));
//     }
// }
