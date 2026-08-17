public class recusion {
    void count(int n) {
    if (n == 0) {
        return;
    }

    System.out.println(n);
    count(n - 1);
    count(n - 1);
}
    public static void main(String[]args) {
        
        recusion obj = new recusion();
        obj.count(5);
    }
}