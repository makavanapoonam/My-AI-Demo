package org.example.ai;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String args[]){

        List<String> stringList = Arrays.asList("poonam", "yash", "pooja");

        List<String> filteredList = stringList.stream().filter(name -> name.startsWith("p")).collect(Collectors.toList());
        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());

        System.out.println(filteredList);
        System.out.println(sortedList);
    }
}
