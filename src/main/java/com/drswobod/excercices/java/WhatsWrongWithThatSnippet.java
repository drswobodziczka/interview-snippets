package com.drswobod.excercices.java;

import java.util.HashMap;
import java.util.stream.IntStream;

public class WhatsWrongWithThatSnippet {

    // TODO: provide time measurement to show how bad is performance
    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        HashMap<WhatsWrongWithThatSnippet, Integer> map = new HashMap<>();
        IntStream
                .range(0,100)
                .forEach(index -> map.put(new WhatsWrongWithThatSnippet(), index));
    }
}
