import java.util.*;
public class ass {
    public static void main(String[]args){
        int[] original = {30,44,27,50};
        int[] sorted = Arrays.copyOf(original, original.length);

        Arrays.sort(sorted);

        for (int i = sorted.length-1; i >= 0; i--) {
            int decendingOrder = sorted[i];
            System.out.println("decending value:"+(decendingOrder));
        }

        System.out.println("original value:"+Arrays.toString(original));
        System.out.println("sorted value:"+Arrays.toString(sorted));
        
        

    }
}
