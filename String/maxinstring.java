public class maxinstring {
    public static void main(String[] args) {
        String[] str = {"123","4242","2413","5555555"};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length; i++) {
            int num = Integer.parseInt(str[i]);
            max = Math.max(max, num);
        }

        System.out.println(max);
    }
}
