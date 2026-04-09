package org.example.javaCode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDM {

    public static void main(String args[]){

        List<String> strList = Arrays.asList("ab","abc","abcd","abd","abcde","abcdef");

        List<String> filteredList = strList.stream().filter(n -> n.length() %2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);
    }

}
