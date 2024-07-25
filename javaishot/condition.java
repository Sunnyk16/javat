public class condition {

    // if & if...else

    public static void coif(){
        int a =2;
        int b = 3;
        if(a<=3 || b>=2){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }

    // comapre three number

    public static void CompThreeNumber(){
        
        int a = 5;
        int b = 6;
        int c = 4;
        
        if(a>b && a>c){
            System.out.println("greater number is a :"+a);
        }
        else if(b>c){
            System.out.println("greater number is b :"+b);
        }
        else{
            System.out.println("greater number is c :"+c);
        }
    } 

    public static void main(String [] args){
        // if else
        coif();

        // if..elseif.args.else
        CompThreeNumber();

    }

}
