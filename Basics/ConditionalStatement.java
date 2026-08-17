import java.util.*;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();

        if (age < 3) {
            System.out.println("You are a baby.");
        } else if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");

        }

    }
}

