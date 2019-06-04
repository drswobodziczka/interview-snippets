class A {

    public A() {
        System.out.println("constructor A");
    }

    // https://rules.sonarsource.com/java/tag/pitfall/RSPEC-1171
    {
        System.out.println("default A");
    }

    static {
        System.out.println("static A");
    }
}

class B extends A {

    public B() {
        System.out.println("constructor B");
    }

    {
        System.out.println("default B");
    }

    static {
        System.out.println("static B");
    }
}

class C {
    static {
        System.out.println("static C");
    }
}

public class NonStaticClassInitializers {

    public static void main(String[] args) {
        C c;
        new B();
    }
}
