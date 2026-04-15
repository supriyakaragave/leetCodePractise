package io.github.supriyakaragave.gfg;

public class POTD {

    //https://www.geeksforgeeks.org/problems/urlify-a-given-string--141625/1
    // Given a string s, replace all the spaces in the string with '%20'.
    // Input: s = "Mr Benedict Cumberbatch"
    // Output: "Mr%20Benedict%20Cumberbatch"


    // Java Solution
    //== >  return s.replace(" ", "%20");
    //Time Complexity : O(n) (internally scans string)
    //Space Complexity : O(n) (creates new string)
    //Notes : Internally optimized in JVM | May use regex engine in some cases (slightly heavier)
    //Pros : Shortest code | Very readable
    // Cons : Slight overhead vs manual | Not always preferred in interviews

    // StringBuilder approach
    // for (char c : s.toCharArray()) {
    //        if (c == ' ') {
    //            result.append("%20");
    //        } else {
    //            result.append(c);
    //        }
    //    }

    //Time Complexity : O(n)
    //Space Complexity : O(n)
    //Notes  : No regex / internal overhead | Direct character handling
    //Pros : Fast and predictable |Interview-friendly|Easy to explain
    //Cons :Slightly more code
/*
Performance Comparison :

            | Approach         | Time | Space | Performance | Interview Value |
            | ---------------- | ---- | ----- | ----------- | --------------- |
            | `replace()`      | O(n) | O(n)  | Good        | Low             |
            | `StringBuilder`  | O(n) | O(n)  | **Better**  | High            |
            | In-place (array) | O(n) | O(1)  | **Best**    | Very High       |

StringBuilder difference :
result.append("%20");
    Appends a String object
    Internally: JVM copies "%", "2", "0" from string
    Single method call

sb.append('%').append('2').append('0');
    Appends 3 individual characters
    No intermediate String needed
    3 method calls, but simpler operations
*/
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

