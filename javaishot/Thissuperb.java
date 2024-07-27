class A {
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        System.out.println("in a int");
    }

}

class B extends A {

    public B() {
        super();
        System.out.println("in b");
    }

    public B(int b) {
        super(b);
        System.out.println("in b int");
    }
}

public class Thissuperb {
    public static void main(String[] args) {
        B obj1 = new B();

    }
    // In your context, A is the superclass and B is the subclass that extends A. The constructors in B can call constructors in A using the super keyword to ensure proper initialization of the superclass part of the B objects.

}
