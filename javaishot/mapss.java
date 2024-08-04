
import java.util.HashMap;
import java.util.Map;

public class mapss {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("a", 1);
        students.put("b", 2);
        students.put("c", 3);

        System.out.println(students);

        for(String key : students.keySet()){
            System.out.println(key + "  :  " + students.get(key));
        } 

    }

    
}
