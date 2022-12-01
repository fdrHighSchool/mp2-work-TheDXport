# Div By 3
#### Respond to the following:

1. A number is considered *prime* if its only factors are 1 and itself. For example, 7 is prime (1 and 7 are the only factors) and 9 is not (1, 3 and 9 are factors).  
Outline an algorithm to determine whether or not a number is prime.  
Think of the following method header:
`public static boolean isPrime(int num)`

  * 1) Create a variable called sum; this variable wil be used to calculate the sum of every digit in the variable num.
  * 2) Convert the num to a String and loop through each index of the String.
  * 3) Take the substring of each digit corresponding to its index by using the method .substring(i, i +1).
  * 4) After each substring is taken, convert that single digit string to an integer by parsing it. 
  * 5) Add the resulting numerical value to the variable sum. Keep doing this until the entire length of the num String is looped through entirely.
  * 6) Now divide sum by 3 using the MOD (%) operator. If the result is equal to 0, then it means that the variable num is a prime number: return true. Otherwise, it wouldn't be prime number: return false.
