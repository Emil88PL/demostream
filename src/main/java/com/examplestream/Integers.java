package com.examplestream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Integers {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(3, 4, 7, 8, 12);
        System.out.println(number);
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);
        int max = number.stream().max(Integer::compare).get();
        System.out.println(max);
        int min = number.stream().min(Integer::compare).get();
        System.out.println(min);
    }
}
