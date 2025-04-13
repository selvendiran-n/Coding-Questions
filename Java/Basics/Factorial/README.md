# Factorial of a Number

This folder contains two Java implementations to find the factorial of a number:

- ✅ Iterative Approach (using loops)
- ✅ Recursive Approach (using method recursion)

---

## 📌 Problem Statement

Write a program to calculate the **factorial of a non-negative integer** `n`.

**Factorial (n!)** is defined as:
- `n! = n × (n - 1) × (n - 2) × ... × 1`
- `0! = 1` (by definition)

---

## 🧠 Approaches

### 1. Iterative Approach - `IterativeFactorial.java`

- Uses a `for` loop to multiply numbers from 1 to `n`.
- Suitable for large input sizes as it avoids deep recursion.
- **Time Complexity**: O(n)  
    - Iterates through the numbers from 1 to `n` to compute the product.
- **Space Complexity**: O(1)  
    - Uses a constant amount of extra space for the `result` variable.

    
**Function Signature**: 
```java
public static long factorial(int n)
```

### 2. Recursive Approach - `RecursiveFactorial.java`

- Uses method recursion to calculate the factorial.
- Elegant and easy to understand, but risks StackOverflowError for large `n`.
- **Time Complexity**: O(n)  
    - Recursively calls itself `n` times before reaching the base case.
- **Space Complexity**: O(n)  
    - Requires O(n) space for the function call stack during recursion.

**Function Signature**: 
 ```java
public static long factorial(int n)
```

# Performance Considerations:
- Recursion Depth: Recursive methods use the stack for function calls. If the input value n is too large, you might encounter a StackOverflowError. For such cases, the iterative method would be preferred to avoid deep recursion.

# Memory Usage:
- The recursive method requires more memory due to function call stack space, which can become problematic for large values of n.

# 💡 BigInteger
- If you expect very large numbers (beyond the range of long), Java BigInteger class   is recommended. BigInteger can handle numbers with arbitrary precision and will allow the calculation of factorials that exceed the storage capabilities of primitive types like int or long.


**Function Signature**: 
```java
public static BigInteger factorial(int n)
```


