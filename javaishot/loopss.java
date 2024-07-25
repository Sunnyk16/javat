public class loopss {

    // while loop
    public static void loopi() {

        int i = 1;
        while (i <= 4) {
            System.out.println("hi");

            // nesting
            int j = 0;
            while (j <= 1) {
                System.out.println("sunny here");
                j++;
            }

            i++;
        }
    }

    // for loop
    public static void forl(){
        for( int i =0; i<=5; i++){
            System.out.println("hi");
        }
    }

    // for loop
    public static void forll(){
        for( int i =0; i<=5; i++){
            System.out.println("hi");

            // nested loop
            
            for(int j=1;j<=1;j++){
                System.out.println("sunny here");
            }
        }
    }

    public static void main(String[] args) {
        // while
        // loopi();

        // for
        forl();
        forll();
    }

}
