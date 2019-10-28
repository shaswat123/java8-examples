package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsOne {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        for(Integer i=0;i<99;i++){

            list.add(i);
        }

        System.out.println(list);

        List<Integer> mappedList = list.stream().map(i-> i*2).collect(Collectors.toList());
        System.out.println(mappedList);

        List<Integer> filteredList= list.stream().filter(i-> i%2==0).collect(Collectors.toList());
        System.out.println(filteredList);


    }
}
