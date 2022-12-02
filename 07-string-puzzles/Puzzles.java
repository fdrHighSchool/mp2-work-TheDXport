// Xinathan Dongapatis
// APCSA Classwork/Homework?? idek, but its prob just classwork
// 11/28/22

public class Puzzles {

    public static void main(String[] args) {

// Given two strings, append them together and return the result. However,if the concatenation creates a double-char, then omit one of the chars

System.out.println( conCat("abc","cat"));
System.out.println( conCat("dog", "cat"));
System.out.println( conCat("roller", "skate"));
System.out.println( conCat("roller", "roller"));
System.out.println( conCat("abc", "") + "\n");

// Given a string of even length, return the first half. So the String "WooHoo" yields "Woo"

System.out.println( firstHalf("WooHoo"));
System.out.println( firstHalf("HelloThere"));
System.out.println( firstHalf("abcdef") + "\n");

// Given a string and an int n, return a string made of n repetitions of the last n chars of the string.
// You may assume that n is in between 0 and the length 0 and the length of the string, inclusive

System.out.println( repeatEnd("Hello", 3));
System.out.println( repeatEnd("Hello", 2));
System.out.println( repeatEnd("Hello", 1) + "\n");

// Return the number of times that the string "hi" appears anywhere in the given string.

System.out.println( countHi("abc hi ho"));
System.out.println( countHi("ABChi hi"));
System.out.println( countHi("hihi") + "\n");

// Given two strings, base and remove, return a version of the base strig where all instances of the remove string have been removed. 
// You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

System.out.println( withoutString("Hello there", "llo"));
System.out.println( withoutString("Hello there", "e"));
System.out.println( withoutString("Hello there", "x") + "\n");

// Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other chars.
// Return 0 if there are no digits in the string.

System.out.println( sumDigits("aa1bc2d3"));
System.out.println( sumDigits("aa11b33"));
System.out.println( sumDigits("Chocolate") + "\n");

// Write a method, makeSarcastic() that takes in a String and returns the sarcastic version with alternating uppercase/lowercase letters.
// Example: "Hello" would return "hElLo"

System.out.println( makeSarcastic("For me it was never about money, but solving problems for the future of humanity."));

    }

    public static String conCat(String str1, String str2) {

        String result = str1 + str2;

        if (str1.equals("") || str2.equals("")) {
            return result;
        } else {

            if (str1.charAt(str1.length()-1) == str2.charAt(0)) {
                result = str1 + str2.substring(1);
            }

        }
        return result;
    }
    public static String firstHalf(String str) {

        return str.substring(0, str.length()/2);
    }
    public static String repeatEnd(String str, int n) {

        String r = "";

            for (int i = 0; i < n; i++) {
                r += str.substring(str.length()-n);
            }

        return r;
    }
    public static int countHi(String str) {
int r = 0;
       
        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
            r++;
           }
        }

return r;


    }
    public static String withoutString(String base, String remove) {
        String r = "";
        
       

    }
    public static int sumDigits(String str) {
        int sum = 0;
        char digitsArr[] = new char[10];
        
        digitsArr[0] = '0';
        digitsArr[1] = '1';
        digitsArr[2] = '2';
        digitsArr[3] = '3';
        digitsArr[4] = '4';
        digitsArr[5] = '5';
        digitsArr[6] = '6';
        digitsArr[7] = '7';
        digitsArr[8] = '8';
        digitsArr[9] = '9';

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < digitsArr.length; j++) {
                if (str.charAt(i) == digitsArr[j]) {
                    sum += Integer.parseInt(str.substring(i, i+1));
                }
            }
        }



return sum;
    }
    public static String makeSarcastic(String str) {
        String sarcasticFinal = "";

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                sarcasticFinal += String.valueOf(str.charAt(i)).toLowerCase();
            } else {
                sarcasticFinal += String.valueOf(str.charAt(i)).toUpperCase();
            }



        }


        return sarcasticFinal;
    }

}
