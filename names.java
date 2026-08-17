import java.util.*;
public class names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names: ");
        int size = sc.nextInt();

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter name:");
            names[i] = sc.nextLine();
            
            System.out.println("Printed :"+names[i]);
        }
        String nameList = Arrays.toString(names);
        System.out.println(nameList);

        sc.close();
    }
}
