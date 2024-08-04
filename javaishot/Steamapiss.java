
// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;




public class Steamapiss {

    public static void  foreachh(){
        List <Integer> nums =Arrays.asList(2,4,6,8);

        nums.forEach(n -> System.out.println(n));
    }
    public static void main(String[] args) {

        

        //

        List <Integer> nums =Arrays.asList(4,5,6,7,8,9);

        int sum =0;
        for (int n : nums){
            if(n%2==0){
                n=n*2;
                sum=sum +n;
            }
        }

        System.out.println("nums : " + nums);
        System.out.println(sum);

        foreachh();


    }

}
