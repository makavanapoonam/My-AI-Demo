package org.example.ai;

import java.util.*;

public class SecondHighestNum {

    public static void main(String args[]){
        List<Integer> integerList = Arrays.asList(1,2,5,3,6,9);
        Optional<Integer> secondHighestNum = integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHighestNum);

        List<Integer> number= Arrays.asList(2,3,5,6);
        int[] arr = {5, 12, 18, 2, 25};

        int avg = (int) Arrays.stream(arr).filter(n -> n > 10).average().getAsDouble();
        System.out.println(avg);
    }
}
