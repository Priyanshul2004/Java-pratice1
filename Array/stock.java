public class stock {
    public static void main(String[] args) {
        int[] prizes = {7,1,5,3,6,4};
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prizes.length; i++) {
            if (prizes[i] > buy ) {
                int profit = prizes[i]-buy;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buy = prizes[i];
            }
        }

        System.out.println("buy idx "+buy);
        System.out.println("profit day idx "+maxprofit);
    }
}
