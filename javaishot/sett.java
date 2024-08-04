import java.util.HashSet;
import java.util.Set;

public class sett {
    public static void main(String[] args) {
        
        Set<Integer> nums = new HashSet <Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(2);
         
        for( int n : nums){
            System.out.println(n);
        }
    }

}
