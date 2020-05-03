package com.streams;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFour {

    public static void main(String[] args) {

       HashMap<Character,String>charMap= Stream.of("One","Two","Three","Four","Five","Six","Seven","Hello","Opera","Hi","Music")
                .collect(Collectors.toMap(
                        k->k.charAt(0),
                        v->v,
                        (word1,word2)->word1+","+word2,
                        HashMap::new
                ));

        System.out.println(charMap);
    }
}
