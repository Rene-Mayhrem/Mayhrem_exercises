# RECURSION

The two essential components for recursion are:

- The *base case*, is the case where the recursion function should stop calling itself and return a value, this is important because without this base case, we will be creating an infintite loop

- The *recursive step* is the part of the function, where it call itself, but it continues because it hasn't reach the end, it's like calling a smaller version or simpler version.

## Task
Think about a simple task like counting down from 5 to 1. What would be the base case—the condition that tells the countdown to stop?

- base case: when the number, in this case the parameter is less than one
- recursive step: if the parameter number is greater than 1, we print the number and we call the function again with the value of the parameter -1

```java
public void countdown(int number) {
    // base case
    if (number == 0) {
        return;
    // recursive step
    } else {
        System.out.println(number);
        countdown(number - 1);
    }
}
```

Ready for a new challenge? How do you think we would use the same concepts to write a function that counts up from 1 to 5 instead?

```java
public void countup (int number) {
    // base case 
    if (number > 5) {
        return;
    } else {
        // recursive stpe
        System.out.println(number);
        countup(number + 1);
    }
} 
```

Sounds good. Let's tackle the factorial problem.

The factorial of a number (n!) is the product of all positive integers less than or equal to n. For example, 5!=5×4×3×2×1=120.

The cool thing about factorials is that they have a natural recursive structure: n!=n×(n−1)!. For example, 5!=5×4!.

Thinking about our countdown example, what would be the base case for a factorial function? In other words, what is the simplest factorial problem that we can solve without any further calculation?

```java
// base case -> number == 1 -> return type
// recursive stpe -> total *= function(number - 1);
public int getFactorial (int number) {
    if (number == 1) {
        return 1;
    } else {
        return number * getFactorial(number - 1);
    }
}
```

Sounds good! The Fibonacci sequence is a great next step, as it introduces a slightly different challenge.

The Fibonacci sequence starts with 0 and 1, and each subsequent number is the sum of the two preceding ones. So the sequence looks like this: $0, 1, 1, 2, 3, 5, 8, ...$.

The recursive rule is `fib(n) = fib(n-1) + fib(n-2)`.

Unlike our previous problems, this one has **two** base cases. Can you identify what they are?

```java
public int getFibonacciNumber (int number) {
    if (number == 0){
        return 0;
    } else if (number == 1) {
        return 1;
    } else {
        return getFibonacciNumber(number -1) + getFibonacciNumber(number - 2);
    }
}
```

Great idea! Recursion is used all the time with data structures. Let's work with a simple linked list.

Think of a linked list as a chain of nodes, where each node holds a value and a pointer to the next node in the chain. The last node's pointer is `null`.

Our goal is to write a recursive function to find the length of the list. Recursively, the length of a list is `1` (for the current node) plus the length of the rest of the list.

What would be the **base case** for our function? What's the simplest list we can have that tells our function to stop counting?

```java
public int getLength(Node node) {
    // base case
    if (node == null) {
        return 0;
    }
    // recursive step
    else {
        return 1 + getLength(node.next);
    }
}
```