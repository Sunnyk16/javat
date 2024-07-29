interface A {
    void show();

    void config();

    final String area = "mumbai";
}

class B implements A {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

public class interfaces {
    public static void main(String[] args) {
        B obj = new B();
        obj.config();
        obj.show();
        System.out.println(A.area);
    }

}
