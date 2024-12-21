public class H1updateallevenposition {
    public static void main(String[] args) {
        String str = "priyanshul";
        System.out.println(str);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i%2 == 0) {
                result += 'a';
            }else{
                result += str.charAt(i);
            }
        }
        str = result;
        System.out.println(str);
    }
}