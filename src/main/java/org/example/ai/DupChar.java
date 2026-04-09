package org.example.ai;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupChar {

    public static void main(String args[]){

        String str = "Java Concept Of The Day";

        Map<Character, Long> map = str.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> filteredList = listOfIntegers.stream().filter(i -> i % 5 == 0).collect(Collectors.toList());
        System.out.println(filteredList);

    }
}
