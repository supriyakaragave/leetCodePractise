package org.example.logic;

import java.util.*;
import java.util.stream.IntStream;

public class minOperationsOnArray {

    public int minOperations(int[] nums) {
        int n = nums.length;

        long ones = Arrays.stream(nums).filter(x -> x == 1).count();
        if (ones > 0) return (int) (n - ones);

        // For each starting index i, find the shortest subarray with gcd == 1
        int minLen = IntStream.range(0, n)
                .map(i -> IntStream.range(i + 1, n + 1)
                        .filter(j -> arrayGcd(Arrays.copyOfRange(nums, i, j)) == 1)
                        .map(j -> j - i)
                        .findFirst()
                        .orElse(Integer.MAX_VALUE))
                .min()
                .orElse(Integer.MAX_VALUE);

        return (minLen == Integer.MAX_VALUE) ? -1 : (minLen - 1) + (n - 1);
    }

    private int arrayGcd(int[] arr) {
        return Arrays.stream(arr)
                .reduce(this::gcd)
                .orElse(0);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
