public class RotationofAnotherString {

    public static boolean RotationofAnotherStringornot(String s1,String s2){
        if (s1.length()!=s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            String allsubofs1 = s1.substring(i)+s1.substring(0, i);
            if (allsubofs1.equals(s2)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";

        boolean result = RotationofAnotherStringornot(s1, s2);
        System.out.println(result);
    }
}
