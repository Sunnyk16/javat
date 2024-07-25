class calculator{

    int a =4; // instance variale
    public int add( int n1,int n2, int n3){
        // local variable
        return n1+n2+n3;
    }
    public int add( int n1,int n2){
        return n1+n2;
    }
}
// method overloading

public class methodoverloading {
    public static void main(String[] args){

        calculator obj =new calculator();
        int result= obj.add(4,5 ,6);
        System.out.println("result : "+result);

    }

}
