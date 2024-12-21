public class RemoveAllOccurrencesofaCharacter {
    public static void main(String[] args) {
        String str = "hellow world";
        char target = 'o';

        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != target) {
                ans += str.charAt(i);
            }
        }

        str = ans;
        System.out.println(ans);
    }
}
