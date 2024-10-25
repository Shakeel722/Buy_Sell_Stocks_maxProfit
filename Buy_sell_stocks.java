public class Buy_sell_stocks {

    // function to buy and sell stock for maximum profit

    public static void BuyAndSellStocks (int[] prices){
        int BuyPrice = prices[0];
        int maxProfit = 0;
        int maxProfitSellingPrice = 0;

        // travel the array and find the minimum Buy price
        for(int i=1 ; i< prices.length; i++){

            if(prices[i] > BuyPrice){ // selling price is greater than the buying price.

               int profit = prices[i] - BuyPrice; // today's profit 
                maxProfit = Math.max(profit, maxProfit);

                maxProfitSellingPrice = Math.max(prices[i] , maxProfitSellingPrice);


            }
            else {
                 // my selling price is smaller than the buy price
                BuyPrice = prices[i];
           
            }
           
        }
        System.out.println("For max profit");
        System.out.println("The Buy price of stock should be: " + BuyPrice);
        System.out.println("The Selling price of stock should be: " + maxProfitSellingPrice );
        System.out.println("The maximum profit attained becomes: " + maxProfit);
    


  
    }



    public static void main(String []args){
        int[] prices = {7, 1, 5, 3, 6, 4};
          
        // calling my function for the max profit for my stocks;
     BuyAndSellStocks(prices);
    }
    
}
