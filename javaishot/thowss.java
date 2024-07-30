public class thowss {
    public static void main(String[] args) {

        try {
            Class.forName("Demo");
            
        } 
        catch (ClassNotFoundException e) {
            System.out.println("not able to found");
        }

        int i = 2;
        int j = 0;

        try {
            j = 18 / i;
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong" + e);
        } catch (Exception e) {
            System.out.println("somethinng went wrong");
        } // parent class

        System.out.println(j);
        System.out.println("executed");

    }

}
