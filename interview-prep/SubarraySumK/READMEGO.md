## Subarray Sum Equals K

Given an array of integers `nums` and an integer `k`, return the total number of **contiguous subarrays** whose sum equals $k$.

---

You mentioned that a good first step is to consider the **brute-force approach** using nested loops.

How would you define the process for the brute-force solution, and what would the final time complexity be? 💻

That's an excellent step. **Thinking about test cases** not only helps verify the final code but also reveals potential edge cases that can optimize your initial approach.

We are focused on the problem: **Subarray Sum Equals K**.

Let's generate a list of test cases that cover the core challenges of this problem:

---

### Test Case Generation

| Scenario | Input `nums` | Input `k` | Expected Output | Rationale |
| :--- | :--- | :--- | :--- | :--- |
| **Simple Case** | `[1, 1, 1]` | `2` | `2` | The two subarrays are `[1, 1]` and `[1, 1]`. |
| **Single Element Match** | `[1, 2, 3]` | `3` | `2` | Subarrays are `[1, 2]` and `[3]`. |
| **No Match** | `[1, 2, 3]` | `7` | `0` | No combination sums to 7. |
| **Negative Numbers** | `[1, -1, 1, -1]` | `0` | `4` | Subarrays: `[1, -1]`, `[-1, 1]`, `[1, -1]`, and `[1, -1, 1, -1]`. |
| **Zeroes** | `[0, 0, 0]` | `0` | `6` | Subarrays: `[0]` (3 times), `[0, 0]` (2 times), and `[0, 0, 0]`. |
| **K is Zero** | `[2, -2, 4]` | `0` | `1` | Subarray: `[2, -2]`. |

---

Now, let's return to the brute-force approach. To write the code, we need a clear plan.

Using the input **`nums = [1, 2, 3]`** and **`k = 3`**:

1.  How many loops will you need to define every possible contiguous subarray?
2.  What does the inner loop need to do at each iteration? 🧠

## Initial Approach

I am thinking on using nested loops to check all the possible combinations to form the subarrays. I'll be using two pointer to manage the subarrays groups using fast and slow approach. It's also needed to create a variable to count all possible subarrays. It's necessary to iterate and complete all the subarrays, since there might be some negative numbers that satifiies our target k. 

## Time and Space complexity
Space: O(1) since we just creating single variables.
Time: O(n) since we are using pointers, It's no considered O(n*n) since we are not iterating all the combinations, just the creation of the subarrays

That's a strong start. You've correctly identified the need for nested loops for the brute-force method, the importance of a counter variable, and the complexity introduced by negative numbers. 🧠

However, let's carefully review the **Time Complexity** for the brute-force approach.

You mentioned that using two pointers might keep the complexity at $O(n)$, but if you're checking *all* possible contiguous subarrays, the time complexity is typically higher.

### Brute-Force Time Complexity: $O(n^2)$

Let's trace how the nested loops work in the brute-force method:

1.  **Outer Loop (Pointer `i`):** This loop sets the **start** of the subarray. It runs $N$ times (from index 0 to $N-1$).
2.  **Inner Loop (Pointer `j`):** This loop sets the **end** of the subarray. For each `i`, it also runs up to $N$ times (from index $i$ to $N-1$).

To illustrate, consider an array of size $N=5$:

| Start Index (`i`) | End Index (`j`) | Total Subarrays Checked |
| :--- | :--- | :--- |
| **0** | 0, 1, 2, 3, 4 | 5 checks |
| **1** | 1, 2, 3, 4 | 4 checks |
| **2** | 2, 3, 4 | 3 checks |
| **3** | 3, 4 | 2 checks |
| **4** | 4 | 1 check |

The total number of subarrays you generate and sum is $5 + 4 + 3 + 2 + 1 = 15$. In general, this sum is approximately $N^2/2$, which makes the brute-force time complexity $\mathbf{O(n^2)}$.

---

### Moving to Optimization

To land the Software Engineer role, the interviewer will expect you to find a solution better than $O(n^2)$. This is where your reference to **pointers** and the hint about **Prefix Sums** become crucial.

Your goal is to get this down to $\mathbf{O(n)}$.

Can you explain the **Prefix Sum** technique and how we can use a **Hash Map** alongside it to count the subarrays in a single pass?

---

The prefix Sum technique is used to create an array of exactly the same length than the one we are receiving as parameter and then the first element is equal than numbers[0] but the following elements are equal than numbers[i] - prefixSum[i - 1]
And we are going to use a HashMap to store the value of prefix sum that gets specific sum and its number of occurences

You're absolutely on the right track by identifying the **Prefix Sum** technique and the **HashMap** as the tools needed to achieve the optimal $O(n)$ solution. That's a strong pivot from the $O(n^2)$ approach.

However, let's just clarify the definition of a prefix sum.

A prefix sum, or cumulative sum, at index $i$ is the sum of all elements from the start of the array up to and including the element at $i$.

If `prefixSum[i]` is the cumulative sum up to index $i$, and `nums` is the input array:

$$\text{prefixSum}[i] = \text{prefixSum}[i-1] + \text{nums}[i]$$

It seems you might have mixed up the operation—it should be **addition**, not subtraction, to build the running total.

***

### The Key Insight

Now, let's focus on the HashMap. You correctly want to store the value of the prefix sum and its number of occurrences.

The core idea is this: if the cumulative sum up to the current index (`currentSum`) is $S$, and we are looking for a subarray that sums to $K$, then we need to see if a previous prefix sum existed that equals **$S - K$**.

If we find a previous sum $S_{\text{prev}}$ such that:

$$S - S_{\text{prev}} = K$$

Then the subarray *between* $S_{\text{prev}}$ and $S$ must sum to $K$.

How can we use the HashMap you described—which stores `(prefixSum, count)`—to check for the required previous sum ($S_{\text{prev}} = S - K$) in $O(1)$ time? 🤔

---

# Core logic

1. Create a HashMap to store prefixSum : number of ocurrences
2. Create a prefixSum array from my parameter array
3. Fill my map with the key values and the number of appeareances
4. Return the value of k, if not, return just 0