package org.example.logic;

public class gcdOfStrings {

    public static String gcdOfStrings(String str1, String str2) {
        // If concatenation order doesn't match, there’s no common divisor
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // GCD of lengths gives the length of the repeating unit
        int gcdLength = gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
