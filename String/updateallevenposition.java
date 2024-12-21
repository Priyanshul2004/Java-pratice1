public class updateallevenposition {
    public static void main(String[] args) {
        String str = "Priyanshul";
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i%2 == 0) {
                res += 'a';
            }else{
                res += str.charAt(i);
            }
        }
        str = res ;
        System.out.println(res);
    }
}
