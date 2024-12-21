import java.util.Arrays;

public class validanagramornot {
    public static void main(String[] args) {
        String s1 = "ttkktt";
        String s2 = "kkttkk";

        int n1 = s1.length();
        int n2 = s2.length();

        for (int i = 0; i < n1; i++) {
            if (n1 != n2) {
                System.out.println("Nota a valid anagram");
            }else{
                char[] ch1 = s1.toCharArray();
                char[] ch2 = s2.toCharArray();

                Arrays.sort(ch1);
                Arrays.sort(ch2);

                if (Arrays.equals(ch1, ch2)) {
                    System.out.println( "validanagram");
                    break;
                }else{
                    System.out.println( "not a valid anagram");
                    break;
                }
            }
        }
    }
}
