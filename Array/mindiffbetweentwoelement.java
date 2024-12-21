public class mindiffbetweentwoelement {
    public static void main(String[] args) {
        int[] arr = { 3, 8, -10, 23, 19, -4, -14, 27 };
        int n = arr.length;
        int mindiff = Integer.MAX_VALUE;

        int[] resutidx = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = arr[i] - arr[j];
                int maindiff = Math.abs(diff);

                if (mindiff > maindiff) {
                    mindiff = maindiff;
                    resutidx[0] = i;
                    resutidx[1] = j;
                }
            }
        }

        System.out.println(mindiff);
        for (int i = 0; i < resutidx.length; i++) {
            System.out.println("result index is "+resutidx[i]+" ");
        }
    }
}