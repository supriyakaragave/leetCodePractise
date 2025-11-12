package org.example.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.example.logic.candies.kidsLargestNoOfWithCandies;
import static org.example.logic.mergeStringsAlternately.*;
import static org.example.logic.onesAndZeroes.findMaxForm;

@RestController
@RequestMapping("/leetcode75")
public class RestApiController {

    @Operation(summary = "Merge two strings alternately",
            description = "Merges two strings character by character alternately until both are exhausted.")
    @GetMapping("/merge-strings-alternately")
    public String mergeStrings( @Parameter(description = "First string") @RequestParam String str1,
                                @Parameter(description = "Second string") @RequestParam String str2) {
        return mergeAlternately(str1, str2);
    }

    @Operation(summary = "Find greatest common divisor of two strings",
            description = "Returns the largest string that divides both input strings.")
    @GetMapping("/gcdOfStrings")
    public String gcdOfStrings(@RequestParam(name = "str1", required = true) String str1, @RequestParam(name = "str2", required = true) String str2) {
        return org.example.logic.gcdOfStrings.gcdOfStrings(str1, str2);
    }

    @GetMapping("/countOnesAndZeroes")
    public int countOnesAndZeroes(@RequestParam String[] str, @RequestParam int m,@RequestParam int n){
        return findMaxForm(str, m,n);
    }

    @GetMapping("/kidsWithCandies")
    public List<Boolean> kidsWithCandies(@RequestParam int[] candies, @RequestParam int extraCandies){
        return kidsLargestNoOfWithCandies(candies,extraCandies);
    }
}
