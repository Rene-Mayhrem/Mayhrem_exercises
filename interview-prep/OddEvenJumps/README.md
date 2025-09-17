{
    Ñ?P¡}|{p*+}
p+|¿}+}
¿+|
}

|

|¿¿

+{{ot it. This is a significantly more challenging problem. Let's start the interview.

***

### **Problem 975: Odd Even Jump**

You are given an integer array `arr`. From an index `i`, you can perform a jump to an index `j` where `i < j`.

* **Odd Jumps (1st, 3rd, ...):** Find the smallest `arr[j] >= arr[i]` among all valid `j`'s. If there's a tie in `arr[j]` values, pick the smallest index `j`.
* **Even Jumps (2nd, 4th, ...):** Find the largest `arr[j] <= arr[i]` among all valid `j`'s. If there's a tie in `arr[j]` values, pick the smallest index `j`.

A starting index `i` is considered "good" if you can reach the end of the array (index `arr.length - 1`) by a sequence of these jumps.

Return the number of good starting indices.

**Example:** `arr = [10, 13, 12, 14, 15]`
* From index `4` (value `15`): You are at the end. It's a **good** start.
* From index `3` (value `14`): An odd jump can be made to index `4` (`15 >= 14`). From `4`, you are at the end. It's a **good** start.
* From index `2` (value `12`): An odd jump can be made to index `3` (`14 >= 12`). From `3`, an odd jump to `4`. It's a **good** start.

What's your initial approach to solving this problem?+

