import java.util.ArrayList;
import java.util.Collection;

public class colllections {
    public static void main(String [] args ){

        Collection<Integer> nums =new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        System.out.println(nums);

        for (int n : nums){
            System.out.println(n);
        }
    }

    

}
