package org.example.ai;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstNumInStr {

    public static void main(String args[]){

        // find the string which start with digit

        List<String> stringList = Arrays.asList("One", "2wo","3ree");

        List<String> filteredList = stringList.stream().filter(str -> Character.isDigit(str.charAt(0))).collect(Collectors.toList());

        System.out.println(filteredList);
    }
}
