public class palindromstring {
    public static void main(String[] args) {
        String str = "shahs";

        int i = 0;
        int j = str.length()-1;

        while (i<j) {
            char ch = str.charAt(i);
            char dh = str.charAt(j);

            if (ch == dh) {
                i++;
                j--;
            }else{
                System.out.println("Not a aplindrom");
                return;
            }
        }

        System.out.println("palindrom string");
    }
}