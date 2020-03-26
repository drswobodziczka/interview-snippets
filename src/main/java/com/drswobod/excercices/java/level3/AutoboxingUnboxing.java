package com.drswobod.excercices.java.level3;

class AutoboxingUnboxing {

    private static final Integer BOXED_INT = 127;
    private static final int PRIMITIVE_INT = new Integer(127);;

    private void testBoxingAndUnboxing() {

        System.out.println((BOXED_INT.equals(PRIMITIVE_INT))); // ??
        System.out.println((BOXED_INT == PRIMITIVE_INT)); // ??
        System.out.println((BOXED_INT == ((Integer) PRIMITIVE_INT))); // ??
        System.out.println((new Integer(BOXED_INT) == new Integer(PRIMITIVE_INT))); // ??
    }

    private void callMeBoxed(Integer i) {
        System.out.println("call me boxed " + i);
    }

    private void callMePrimitive(int i) {
        System.out.println("call me primitive " + i);
    }

    public static void main(String[] args) {
        AutoboxingUnboxing autoboxingUnboxing = new AutoboxingUnboxing();

        autoboxingUnboxing.testBoxingAndUnboxing();
        autoboxingUnboxing.callMePrimitive(BOXED_INT);
        autoboxingUnboxing.callMeBoxed(PRIMITIVE_INT);
    }
}
