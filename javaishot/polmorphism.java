class computer{
    public void show(){
        System.out.println("its a computer");
    }
}
class laptop extends computer{
    public void show(){
        System.out.println("its a laptop");
    }
}
public class polmorphism{
    public static void main(String[] args) {

        computer obj= new computer();  // dynamic method dispatch
        obj.show();  // dynamic method dispatch

        obj =new laptop();  // dynamic method dispatch
        obj.show();
         
    }

}
