public class peakofmountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1] && arr[i]>arr[i-1]) {
                System.out.println("this is the peak of this mountain = "+arr[i]);
            }
        }
    }
}
