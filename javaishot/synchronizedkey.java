

class A{
    int count =0;
    public synchronized void increment(){
        count++;
    }
}

public class synchronizedkey {
    public static void main(String [] args){

        A c  = new A();

        Runnable obj1 = () ->{
            for ( int i = 1; i<= 4; i++){
                c.increment();

            }
        };

        Runnable obj2 = () ->{
            for ( int i = 1; i<= 4; i++){
                c.increment();

            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch( Exception e ){
            System.out.println(e);
        }

        System.out.println("final count : " + c.count);
    }

}
