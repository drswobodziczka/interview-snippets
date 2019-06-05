package com.drswobod.excercices.java;

class AutoboxingUnboxing {

    void testBoxingAndUnboxing() {
        Integer boxedInt = 127;
        int primitiveInt = 127;

        System.out.println((boxedInt.equals(primitiveInt))); // ??
        System.out.println((boxedInt == primitiveInt)); // ??
        System.out.println((boxedInt == ((Integer) primitiveInt))); // ??
        System.out.println((new Integer(boxedInt) == new Integer(primitiveInt))); // ??
    }

    public static void main(String[] args) {
        new AutoboxingUnboxing().testBoxingAndUnboxing();
    }
}
