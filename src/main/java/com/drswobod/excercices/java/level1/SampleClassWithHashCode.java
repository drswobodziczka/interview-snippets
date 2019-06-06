package com.drswobod.excercices.java.level1;

import java.util.HashMap;
import java.util.stream.IntStream;

public class SampleClassWithHashCode {

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        HashMap<SampleClassWithHashCode, Integer> map = new HashMap<>();
        IntStream
                .range(0,100)
                .forEach(index -> map.put(new SampleClassWithHashCode(), index));
    }
}
