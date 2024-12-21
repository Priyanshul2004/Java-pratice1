public class trivinstr {

    public static void printstr(int i,String str){
        if (i == str.length()) {
            return;
        }
        System.out.println(str.charAt(i));
        printstr(i+1, str);
    }
    public static void main(String[] args) {
        String str = "abcde";
        printstr(0,str);
    }
}
