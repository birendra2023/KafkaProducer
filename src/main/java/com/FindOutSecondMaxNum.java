package com;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutSecondMaxNum {
    public static void main(String[] args) {
        int[] arr={65,83,54,34,89,35,90};
        List<Integer> list=Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        System.out.println("==========================");
        Integer secondMax= Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondMax);
        System.out.println("=================");
        Integer scM= Arrays.stream(arr).boxed().sorted().skip(arr.length-3).findFirst().get();
        System.out.println(" Second Max Number is  " + secondMax);
    }
}
