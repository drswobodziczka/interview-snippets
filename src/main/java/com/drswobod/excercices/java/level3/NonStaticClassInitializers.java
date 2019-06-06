package com.drswobod.excercices.java.level3;

class A {

    A() {
        System.out.println("constructor com.drswobod.excercices.java.level3.A");
    }

    // https://rules.sonarsource.com/java/tag/pitfall/RSPEC-1171
    {
        System.out.println("default com.drswobod.excercices.java.level3.A");
    }

    static {
        System.out.println("static com.drswobod.excercices.java.level3.A");
    }
}

class B extends A {

    B() {
        System.out.println("constructor com.drswobod.excercices.java.level3.B");
    }

    {
        System.out.println("default com.drswobod.excercices.java.level3.B");
    }

    static {
        System.out.println("static com.drswobod.excercices.java.level3.B");
    }
}

class C {
    static {
        System.out.println("static com.drswobod.excercices.java.level3.C");
    }
}

public class NonStaticClassInitializers {

    public static void main(String[] args) {
        C c;
        new B();
    }
}
