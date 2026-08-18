import java.util.*;

public class problem01 {
    public static void main(String[]argas) {
        int[] arr = {1,2,3,2,4};
        int firstValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (firstValue == arr[i]) {
                System.out.println("true: "+arr[i]);
            }else {
                System.out.println("False: "+arr[i]);
            } 
        }
    }
}
