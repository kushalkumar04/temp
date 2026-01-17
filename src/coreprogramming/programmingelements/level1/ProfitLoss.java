package coreprogramming.programmingelements.level1;

/*
 * This class calculates the profit and profit percentage
 * based on the given cost price and selling price.
 * It displays the cost price, selling price, profit,
 * and the calculated profit percentage.
 */
public class ProfitLoss {

    public static void main(String[] args) {

        // Store the cost price of the item
        double costPrice = 129;

        // Store the selling price of the item
        double sellingPrice = 191;

        // Calculate the profit
        double profit = sellingPrice - costPrice;

        // Calculate the profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Display all the calculated values
        System.out.println(
                "The Cost Price is INR " + costPrice +
                        " and the Selling Price is INR " + sellingPrice +
                        "\nThe Profit is INR " + profit +
                        " and the Profit Percentage is " + profitPercentage
        );
    }
}