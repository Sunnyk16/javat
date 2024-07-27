class human{
    private int age;
    private String name;

    // public void setage(int a){
    //     age =a;  // local variable
    // }

    // this keyword
    public void setage(int age){
        this.age =age;  // instance variable
    }
 
    public int getage(){
        return age; 
    } 

    public void setname(String n){
        name= n ;
    }
    public String getname(){
        return name; 
    }



    
}
public class encapsulation {
    public static void main(String[] args) {

        human obj1= new human();
        obj1.setage(5);

        System.out.println("age : "+obj1.getage());
        
    }

}
