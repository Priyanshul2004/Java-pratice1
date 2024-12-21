public class margetwosortedarr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int n = arr1.length+arr2.length;

        int[] mergearr = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            mergearr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergearr[arr1.length+i] = arr2[i];
        }

        for (int i = 0; i < mergearr.length; i++) {
            System.out.print(mergearr[i]+" ");
        }
    }
}
