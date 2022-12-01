# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

    * 1) Find all exceptions for these sign additions for values over 99 and under the failing grade. (If grade >= 100, automatically add a '+'. If         
    *    grade<=failing grade, automatically change the grade to an F.
    * 2) Convert the grade to a string
    * 3) Find the last character of the grade
    * 4) ParseInt that character
    * 5) If that character is 7, 8, or 9, add a '+' to the end. Otherwise, if that character is 0, 1, 2, add a '-' to the end.


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  *    If grade is strictly greater than or equal to 100, automatically add a '+'.


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  *   If grade is strictly less than or equal to the failing grade, automatically change the grade to an F.
