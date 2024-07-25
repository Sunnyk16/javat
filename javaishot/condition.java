public class condition {

    // if & if...else

    public static void coif() {
        int a = 2;
        int b = 3;
        if (a <= 3 || b >= 2) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }
    }

    // comapre three number

    public static void CompThreeNumber() {

        int a = 5;
        int b = 6;
        int c = 4;

        if (a > b && a > c) {
            System.out.println("greater number is a :" + a);
        } else if (b > c) {
            System.out.println("greater number is b :" + b);
        } else {
            System.out.println("greater number is c :" + c);
        }
    }

    // ternary operator

    public static void ternary() {
        int n = 40;

        String result = n % 2 == 0 ? "string is divisible by 2" : "string is not divisible by 2";
        System.out.println(result);
    }

    // Switch case
    public static void SwitchC(){
         int n = 5;

         switch (n) {
             case 1:
             System.out.println("its sunday");
             break;

             case 2:
             System.out.println("its monday");
             break;

             case 3:
             System.out.println("its tuesday");
             break;

             case 4:
             System.out.println("its wednesday");
             break;

             case 5:
             System.out.println("its thrusday");
             break;

             case 6:
             System.out.println("its friday");
             break;

             case 7:
             System.out.println("its saturday");
             break;

             default:
             System.out.println("enter no is not present");
         }
          
    }

    // loops
    public static void loopi() {
        int i =2;
        while(i<=4){
            System.out.println("hi");
            i++;
        }

    }

    public static void main(String[] args) {
        // if else
        coif();

        // if..elseif.args.else
        CompThreeNumber();

        // ternary 
        ternary();

        // SwitchCase
        SwitchC();

        // loops
        loopi();

    }

}
