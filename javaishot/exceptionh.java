public class exceptionh {
    public static void main(String[] args){
        int i =2  ;
        int j=0;

        try{
            j=18/i;
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong"+e);
        }
        catch(Exception e){
            System.out.println("somethinng went wrong");
        }//parent class

        System.out.println(j);
        System.out.println("executed");

    }

}
