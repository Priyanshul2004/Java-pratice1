public class mostoccuringelementinthestring {
    public static void main(String[] args) {
        String str = "priyanshultiwari";

        int[] feq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            int idx = (int)ch - 97;
            feq[idx]++;  
        } 

        int maxfeq = -1;
        for (int i = 0; i < feq.length; i++) {
            maxfeq = Math.max(maxfeq, feq[i]);
        }

        for (int i = 0; i < feq.length; i++) {
            if (feq[i] == maxfeq) {
                char ch = (char)(i+97);
                System.out.println(ch);
                break;
            }
        }
    }
}