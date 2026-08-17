import java.util.*;
public class maximum {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int maximum = arr[0];
        int minimum = arr[0];
        
        for (int i = 1; i < size; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            } else if ( arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        System.out.println("maximum:"+maximum);
        System.out.println("minimum:"+minimum);
    }
}

