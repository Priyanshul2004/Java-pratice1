package Array;

public class A1printnumsmallerthent {
    public static void main(String[] args) {
        int[] arr = {78,3,5,3,5,3,4,2,};
        int t = 5;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]<t) {
                System.out.print(arr[i]+" ");
            }else{
                System.out.print("");
            }
        }
    }
}
