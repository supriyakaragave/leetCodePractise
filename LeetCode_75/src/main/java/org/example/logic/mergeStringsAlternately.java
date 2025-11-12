package org.example.logic;

public class mergeStringsAlternately {

    public static String mergeAlternately(String str1, String str2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;

        while (i < str1.length() || j < str2.length()) {
            if (i < str1.length()) merged.append(str1.charAt(i++));
            if (j < str2.length()) merged.append(str2.charAt(j++));
        }

        return merged.toString();
    }

    public static String mergeAlternatelyUsingStreams(String str1, String str2) {
        int maxLength = Math.max(str1.length(), str2.length());

        return java.util.stream.IntStream.range(0, maxLength)
                .mapToObj(i -> {
                    StringBuilder sb = new StringBuilder();
                    if (i < str1.length()) sb.append(str1.charAt(i));
                    if (i < str2.length()) sb.append(str2.charAt(i));
                    return sb.toString();
                })
                .collect(java.util.stream.Collectors.joining());
    }
}
