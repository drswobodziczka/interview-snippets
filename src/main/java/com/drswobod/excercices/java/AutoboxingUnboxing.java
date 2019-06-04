package com.drswobod.excercices.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AutoboxingUnboxing {

    // What should be the scope of Jupiter test method?
    @Test
    void testBoxingAndUnboxing() {
        Integer boxed = 127;
        int unboxed = 127;

        System.out.println((boxed.equals(unboxed))); // ??
        System.out.println((boxed == unboxed)); // ??
        System.out.println((boxed == ((Integer) unboxed))); // ??
        System.out.println((new Integer(boxed) == new Integer(unboxed))); // ??
    }
}
