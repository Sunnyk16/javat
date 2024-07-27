class Hhuman {
    private int age; // instance variable
    private String name; // instance variable

    // public void setage(int a){
    // age =a; // local variable
    // }

    // this keyword
    public void setage(int age) {
        this.age = age; // instance variable
    }

    public int getage() {
        return age;
    }

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }

    public Hhuman() {
        // System.out.println("in contructor");
        age=21;
        name ="sunny";
    }

}

public class Demo {
    public static void main(String[] args) {

        Hhuman obj1 = new Hhuman();

        // obj1.setname("sunny");
        // obj1.setage(5);

        System.out.println(obj1.getage());
        System.out.println(obj1.getname());
    }

}
