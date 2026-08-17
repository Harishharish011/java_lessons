import java.util.*;
public class array {
    public static void main(String[] args) {
        int[] marks = {10,20,30,40,50,22,33};
        Arrays.sort(marks);
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == 22) {
                break;
            }
            System.out.println(marks[i]);
        }

    }
}