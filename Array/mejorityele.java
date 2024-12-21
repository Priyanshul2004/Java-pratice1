public class mejorityele {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 5, 3};
        int eligbility = arr.length/2;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count >= eligbility) {
                System.out.println(arr[i]+" is majorty element");
                found = true;
                break;
            }
        }

        if (found== true) {
            System.out.println("majorty is alavale");
        }else{
            System.out.println("majorty is not alavale");
        }
    }
}
