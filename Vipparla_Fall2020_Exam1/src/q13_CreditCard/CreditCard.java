/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q13_CreditCard;

/**
 *
 * @author Sri vasavi Vipparla
 */
public class CreditCard {

    public static boolean isValid(long number) {
        if ((getSize(number) >= 13 && getSize(number) <= 16)
                && (prefixMatched(number, 4) == true || prefixMatched(number, 5) == true
                || prefixMatched(number, 37) == true || prefixMatched(number, 6) == true)
                && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)) {
            return true;
        } else {
            return false;
        }
    }
/* this method is used to get the lengh of the credit card*/
    public static int getSize(long d) {
        int length = String.valueOf(d).length();
        return length;
    }

    /**
     * Return the first k number of digits from number. If the number of digits
     * in number is less than k, return number.
     */
    public static long getPrefix(long number, int k) {
        String num = number + "";
        int k1 = String.valueOf(k).length();
        String k2 = k + "";
        if (num.substring(0, k1).equals(k2)) {
            return k;
        } else {
            return number;
        }
    }
/*	Double every second digit from right to left.*/
    public static int sumOfDoubleEvenPlace(long number) {
        String number1 = number + "";
        int size = String.valueOf(number).length();
        int add = 0;
        for (int i = size - 2; i >= 0; i -= 2) {
            int twice=getDigit(Integer.parseInt(number1.charAt(i) + "") * 2);
            add = add +twice;

        }
        return (add);
    }
/* Add all digits in the odd places from right to left in the card number*/
    public static int sumOfOddPlace(long number) {
        int add = 0;
        String number1 = number + "";
        int size = String.valueOf(number).length();
        for (int i = size - 1; i >= 0; i -= 2) {
            add += Integer.parseInt(number1.charAt(i) + "");
        }
        return add;
    }
    /* Return true if the digit d is a prefix for number else false*/
    public static boolean prefixMatched(long number, int d) {
        long d1=getPrefix(number,d);
        String d2=d1+"";
        String num=number+"";
        int size = String.valueOf(d).length();
        if(num.substring(0,size).equals(d2)){
            return true;}
            else
            return false;
        }
  /*  Return this number if it is a single digit, otherwise,
       return the sum of the two digits */

    public static int getDigit(int number) {
        int size = String.valueOf(number).length();
        if (size == 1) {
            return number;
        } else {
            int n1 = number / 10;
            int n2 = number % 10;
            int n = n1 + n2;
            return n;
            }

        }

    }

