121. Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

# Approach

Using two pointers, maybe by using two pointer one faster than the other, we could go from slow to fast and compare the MaxDistance between pointer, we only need to go from left to right. I'd create a variable call current profit to determine the difference between profits. Creating a variable for maxProfit to compare the current profit with the maxProfit value, return that value.

I am thinking about having two pointers:

- Traverse the array 
- Keep tracking of minPrice (toBuy)
- Kepp tracking of maxProfit (toSell)




