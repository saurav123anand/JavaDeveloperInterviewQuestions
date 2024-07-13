package com.example.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void test(List<Double> list){
        List<Double> collect = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);
    }
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
    }
}
