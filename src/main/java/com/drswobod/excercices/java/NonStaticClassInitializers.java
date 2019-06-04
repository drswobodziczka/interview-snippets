package com.drswobod.excercices.java;

class A {

    public A() {
        System.out.println("constructor com.drswobod.excercices.java.A");
    }

    // https://rules.sonarsource.com/java/tag/pitfall/RSPEC-1171
    {
        System.out.println("default com.drswobod.excercices.java.A");
    }

    static {
        System.out.println("static com.drswobod.excercices.java.A");
    }
}

class B extends A {

    public B() {
        System.out.println("constructor com.drswobod.excercices.java.B");
    }

    {
        System.out.println("default com.drswobod.excercices.java.B");
    }

    static {
        System.out.println("static com.drswobod.excercices.java.B");
    }
}

class C {
    static {
        System.out.println("static com.drswobod.excercices.java.C");
    }
}

public class NonStaticClassInitializers {

    public static void main(String[] args) {
        C c;
        new B();
    }
}
