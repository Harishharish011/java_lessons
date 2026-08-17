public class Reversing {
    public static void main(String[] args) {
        int Key = 12321;
        int original = Key;
        int reversed = 0;

        while (Key != 0) {
            int digit = Key % 10;
            reversed = reversed * 10 + digit;
            Key /= 10;
        }

        if (original == reversed) {
            System.out.println("The number is a palindrome." + reversed);
        } else {
            System.out.println("The number is not a palindrome."+ reversed);
        }
    }
}
