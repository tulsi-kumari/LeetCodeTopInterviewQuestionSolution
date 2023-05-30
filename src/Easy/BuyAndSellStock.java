package Easy;

public class BuyAndSellStock {
    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
    // future to sell that stock.
    //
    //Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};

        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {

            int ans=0;
            int i=0;
            int j=1;
            while(j<prices.length){
                ans=Math.max(ans,prices[j]-prices[i]);
                if(prices[i]>prices[j]){
                    i++;
                    j=i+1;
                }else{
                    j++;
                }
            }
            return ans;
        }

}
