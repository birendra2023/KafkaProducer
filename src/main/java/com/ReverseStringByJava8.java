package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringByJava8 {
    public static void main(String[] args) {
        String str="Birendra";
        String[] splt=str.split("");
        List<String> reveseString= Arrays.stream(splt).collect(Collectors.toList());
        Collections.reverse(reveseString);
        reveseString.forEach(System.out::println);
    }
}
