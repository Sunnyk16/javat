@FunctionalInterface
interface A {
    int add(int a, int b);
}

public class lamdafuvtion {
    public static void main(String[] args) {
        A obj = (int i,int j)->{
                return i+j;
            }
            
        ;
        

        int result =obj.add(5, 4);
        System.out.println(result);
        }
};


