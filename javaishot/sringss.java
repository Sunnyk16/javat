class mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(name+" : " + brand + " : "+price);
    }
}
public class sringss {
    // strings
    public static void strings(){
        String name = "sunny ";
        System.out.println(name);

        // capacity check

        StringBuffer sb= new StringBuffer("sunny");
        System.out.println(sb.capacity());

    }

    public static void main(String [] args){
        // Strings
        // strings();

        mobile obj1= new mobile();
        obj1.brand="apple";
        obj1.price=500000;
        mobile.name="iphone 13";

        // mobile obj2= new mobile();
        // obj2.brand="oneplus";
        // obj2.price=50000;
        // mobile.name="oneplus 11r";

        obj1.show();
        // obj2.show();



 


    } 

}
