import java.util.*;

public class hashset {
    public static void main(String[]args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(7);
        set.add(3);
        set.add(4);  
        set.remove(4);
        
        
        /*
        System.out.println(set.remove(4));
        System.out.println(set); */

        for (int i: set) {
            
            System.out.println(i);
        }
        
    }
}
