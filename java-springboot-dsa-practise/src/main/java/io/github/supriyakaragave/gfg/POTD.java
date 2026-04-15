package io.github.supriyakaragave.gfg;

public class POTD {

    //https://www.geeksforgeeks.org/problems/urlify-a-given-string--141625/1
    String URLify(String s) {
        // code here
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            if (c == ' ') {
                sb.append('%').append('2').append('0');
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

