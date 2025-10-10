### 🎯 Problem (LC 2300)

You are given two integer arrays:

* `spells` — where `spells[i]` represents the strength of the i-th spell
* `potions` — where `potions[j]` represents the strength of the j-th potion

And an integer `success`.

A spell and a potion **form a successful pair** if their product is **greater than or equal to `success`**:

```
spells[i] * potions[j] >= success
```

Return an array `res` of length `spells.length` where `res[i]` is the **number of potions that form a successful pair with the i-th spell**.

#### Example:

```
Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7
Output: [4,0,3]
Explanation:
- Spell 5 pairs with potions [2,3,4,5] → 4 successful pairs
- Spell 1 pairs with none → 0
- Spell 3 pairs with [3,4,5] → 3 successful pairs
```

---

### 🧠 **Interviewer:**

Before coding, can you **walk me through how you’d approach this problem**?

Some hints to consider:

* How can you avoid checking every pair (`O(n*m)`)?
* Would sorting or binary search help?

Please explain your thought process **out loud**, as you would in an actual interview.

## Checking parameters
- Spells
- potions
- sucess

Basically I'd need to check if the product of spells[i] * postions[j] >= success
Which represents a basic operation, but doing this iteration by iteration would cost a O(n*m) which is not the best case.

# Steps
- Sort the potions elements by ascending order
- Use binary search to find a the first element that represents a success case in the potions array
- Return the length of potions - index of the first accepted element. Since our array is sorted, we just need to find one element to return the others element since those values are greather than success