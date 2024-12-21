public class conatinallnumberstr {
    public static void main(String[] args) {
        String str = "12a45";
        
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > '9' || ch < '0') {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("str contain only  numbers ");
        }else{
            System.out.println("str does not conatin only numbers ");
        }
    }
}
