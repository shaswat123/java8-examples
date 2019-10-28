package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTwo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(65);
        list.add(97);
        list.add(23);
        list.add(98);
        list.add(33);
        list.add(21);
        list.add(88);
        list.add(11);
        list.add(77);

        System.out.println(list.stream().sorted().collect(Collectors.toList()));

        System.out.println(list.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList()));

        System.out.println(list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList()));

        System.out.println(list.stream().min((i1,i2)-> i1.compareTo(i2)).get());

        System.out.println(list.stream().max((i1,i2)-> i1.compareTo(i2)).get());

        System.out.println(list.stream().min(Comparator.naturalOrder()).get());

        System.out.println(list.stream().max(Comparator.naturalOrder()).get());


        Double  [] d = {10.0,98.0,56.0,33.8,32.87,12.0};
              Stream<Double> st=  Stream.of(d).sorted();
              st.forEach(System.out::println);






    }
}
