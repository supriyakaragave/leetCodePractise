package org.example.logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class candies {

    public static java.util.List<Boolean> kidsLargestNoOfWithCandies(int[] candies, int extraCandies) {

        int maxLength = candies.length;

        int highest = Arrays.stream(candies)
                .boxed()  // convert int -> Integer for sorting with Comparator
                .sorted(Comparator.reverseOrder())  // largest first
                .findFirst()  // now get the next one
                .orElseThrow(() -> new RuntimeException("Not enough elements"));

        return java.util.stream.IntStream.range(0, maxLength)
                .mapToObj(i -> {

                    if ((candies[i] + extraCandies) >=highest)
                    {
                        return true;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }
}
