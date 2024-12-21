import java.util.*;
public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Arrays.sort(arr);
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==arr[i+1]) {
                System.out.println(arr[i]+" is duplicate in arr");
                flag = false;
                return;
            }else{
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("no dupli in arr");
        }
    }
}