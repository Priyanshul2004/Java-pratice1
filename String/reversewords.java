public class reversewords {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("priyanshul tiwari");
        int n = sb.length();

        int i=0;
        int j=0;

        while (j<n) {
            if (sb.charAt(j) != ' ') {
                j++;
            }else{
                reverse(sb, i, j-1);
                i = j+1;
                j = i;
            }
        }
        reverse(sb, i, j-1);

        System.out.println(sb);
    }
    public static void reverse(StringBuilder sb , int i ,int j){
        int n = sb.length();
        while (i<=j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}