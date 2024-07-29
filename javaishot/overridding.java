class A{
    public void show(){
        System.out.println("in a");
    }

}
class B{
    public void show(){
        System.out.println("in b");
    }
}
public class overridding {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show(); 
    }

}
