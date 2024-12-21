import java.util.*;
public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4}; 

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (i<arr1.length && j<arr2.length) {
            if (arr1[i]==arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            }else if (arr1[i]<arr2[j]) {
                i++;
            }else{
                j++;
            }
        }

        System.out.println("Intersection "+ans);
    }
}
