public class mergetwosortedarr {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 4, 5, 6 };

        System.out.println("first array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "");
        }
        System.out.println();
        System.out.println("second array");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "");
        }

        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<a.length && j<b.length) {
            if (a[i]<=b[j]) {
                c[k] = a[i];
                k++;
                i++;
            }else{
                c[k] = b[j];
                k++;
                j++;
            }
        }
        if (i == a.length) {
            while (j<b.length) {
                c[k++] = b[j++];
            }
        }
        if (j == b.length) {
            while (i<a.length) {
                c[k++] = a[i++];
            }
        }

        System.out.println();
        System.out.println("ans array");
        for (int m = 0; m < c.length; m++) {
            System.out.print(c[m] + "");
        }
    }
}
