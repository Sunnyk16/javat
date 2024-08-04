class A extends Thread{
    public void show(){
        for (int i =0;i<=5;i++){
            System.out.println("Hello");
            try
            {Thread.sleep(10);
            }catch(Exception e){
                System.out.println(e);
            }
            
        }
    }
}

class B extends Thread{
    public void show(){
        for (int i =0;i<=5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);               
            } catch (Exception e) {
                System.out.println(e);
                
            }
        }
    }
}

public class threadds {
    public static void main(String[] args) {
        A obj =new A();
        B obj1 =new B();

        // Remove the line that prints the result of obj1.show()

        obj1.setPriority(Thread.MAX_PRIORITY);
        obj.start();
        obj1.start();

        System.out.println("execution complete");

    }

}
