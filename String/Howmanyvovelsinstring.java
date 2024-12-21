import java.util.Scanner;

public class Howmanyvovelsinstring {

    public static boolean isvovle(char ch){
        if (ch == 'a' || ch == 'A') return true;
        if (ch == 'e' || ch == 'E') return true;
        if (ch == 'i' || ch == 'I') return true;
        if (ch == 'o' || ch == 'O') return true;
        if (ch == 'u' || ch == 'U') return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isvovle(ch) == true) {
                count++;
            }
        }

        System.out.println("Total number of voval in string is "+count);
    }
}
