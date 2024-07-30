public class Throww {
    public static void main(String[] args){
        int i =20  ;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException();
            }
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("thats the default output");
        }
        catch(Exception e){
            System.out.println("somethinng went wrong");
        }//parent class

        System.out.println(j);
        System.out.println("executed");

    }

}
