class A {

    public int add(int a, int b) {

        return a + b;
    }
    public int sub(int a, int b) {

        return a - b;
    }
    public int multiply(int a, int b) {

        return a * b;
    }
    public int divide(int a, int b) {

        return a / b;
    }

}

public class inheritance {
    public static void main(String[] args) {
        Advancal obj1 = new Advancal();

        System.out.println(obj1.add(4, 5));
        System.out.println(obj1.sub(4, 5));
        System.out.println(obj1.multiply(4, 4));
        System.out.println(obj1.divide(4, 2));
        System.out.println(obj1.power(4,2));
    }


}
