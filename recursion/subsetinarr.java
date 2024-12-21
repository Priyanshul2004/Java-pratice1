import java.util.ArrayList;
import java.util.List;

public class subsetinarr {
     public static void printSubset(int i, int[] arr, List<Integer> ans) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }
        ans.add(arr[i]);
        printSubset(i + 1, arr, ans);
        ans.remove(ans.size() - 1);
        printSubset(i + 1, arr, ans);
    }
    public static void main(String[] args) {
         int[] arr = {1, 2, 3};
        List<Integer> ans = new ArrayList<>();
        printSubset(0, arr, ans);
    }
}
