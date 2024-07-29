class A{
    public void add( int a ,int b){
        System.out.println("addition : "+ a+b);
    }

}
class B extends A{
    public void minus(int a, int b){
        System.out.println("minus"+(a-b));
    }
}
public class finall {
    public static void main(String[] args) {
        // final used with variable 
        // final int pie = 3;
        // System.out.println(""+pie);

        A obj= new A();
        obj.add(4, 5);

        
    }

}
