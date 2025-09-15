package ua.opnu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // ======== Logical operations ========

    /**
     * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     * Example:
     * icyHot(120, -1) → true
     * icyHot(-1, 120) → true
     * icyHot(2, 120) → false
     */
    private static final int LOW_TEMP = 0; // low temperature
    private static final int HIGH_TEMP = 100; // high temperature
    public boolean icyHot(int temp1, int temp2) {
        return (temp2 < LOW_TEMP && temp1 > HIGH_TEMP)
            || (temp1 < LOW_TEMP && temp2 > HIGH_TEMP);
    }

    /**
     * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     * Example:
     * in1020(12, 99) → true
     * in1020(21, 12) → true
     * in1020(8, 99) → false
     */
    private static final int LOW_BORDER = 10; // low border
    private static final int HIGH_BORDER = 20; // high border
    public boolean in1020(int a, int b) {
        return (a >= LOW_BORDER && a <= HIGH_BORDER)
            || (b >= LOW_BORDER && b <= HIGH_BORDER);
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1
     * or more of them are teen.
     * Example:
     * hasTeen(13, 20, 10) → true
     * hasTeen(20, 19, 10) → true
     * hasTeen(20, 10, 13) → true
     */
    private static final int LOW_BORDER_TEEN = 13; // low border to be teen
    private static final int HIGH_BORDER_TEEN = 19; // high border to be teen
    public boolean hasTeen(int a, int b, int c) {
        return (a >= LOW_BORDER_TEEN && a <= HIGH_BORDER_TEEN)
            || (b >= LOW_BORDER_TEEN && b <= HIGH_BORDER_TEEN)
            || (c >= LOW_BORDER_TEEN && c <= HIGH_BORDER_TEEN);
    }

    // ======== Boolean expressions ========

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * Example:
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     * Example:
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    /**
     * Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative"
     * is true, then return true only if both are negative.
     * Example:
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     */
    private static final int BORDER_SIGN = 0; // border to discover sign
    public boolean posNeg(int a, int b, boolean negative) {
        return ((a < BORDER_SIGN) ^ (b < BORDER_SIGN)) && !negative
             || (a < BORDER_SIGN  && b < BORDER_SIGN   && negative);
    }

    // ======== Loops and Arrays ========

    /**
     * Given an array of ints, return the number of 9's in the array.
     * Example:
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    private static final int FIND_NUM = 9; // number to find
    public int arrayCount9(int[] nums) {
        int numberOfNine = 0; // initial number of 9's in the array
        for(int i : nums) {
            if (i == FIND_NUM) {
                numberOfNine++;
            }
        }
        return numberOfNine;
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     * Example:
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     */
    private static final int NUMBER_NUM = 4; // number of numbers
    public boolean arrayFront9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (count++ == NUMBER_NUM) {
                break;   // check only the first 4 elements
            }
            if (num == FIND_NUM) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
     * Example:
     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     */
    private static final int NUMBER_FIRST = 1;
    private static final int NUMBER_SECOND = 2;
    private static final int NUMBER_THIRD = 3;
    public boolean array123(int[] nums) {
        int len = nums.length;
        for (int i = NUMBER_SECOND; i < len; i++) {
            if (nums[i-NUMBER_SECOND] == NUMBER_FIRST
               && nums[i-NUMBER_FIRST] == NUMBER_SECOND
               && nums[i] == NUMBER_THIRD) {
                return true;
            }
        }
        return false;
    }

    // ======== Strings ========

    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     * Example:
     * helloName("Bob") → "Hello Bob!"
     * helloName("Alice") → "Hello Alice!"
     * helloName("X") → "Hello X!"
     */
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    /**
     * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding"
     * yields "codign".
     * Example:
     * lastTwo("coding") → "codign"
     * lastTwo("cat") → "cta"
     * lastTwo("ab") → "ba"
     */
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str; //if the length is less than 2, return the string as is
        }
        // take everything except the last two characters
        String start = str.substring(0, str.length() - 2);
        // the last two symbols are swapped
        char secondLast = str.charAt(str.length() - 2);
        char last = str.charAt(str.length() - 1);
        return start + last + secondLast;
    }

    /**
     * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
     * The string length will be at least 2.
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     */
    public String middleTwo(String str) {
        int mid = str.length() / 2; // line midpoint index
        return str.substring(mid - 1, mid + 1); // take characters mid-1 and mid
    }

}
