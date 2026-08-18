public class problem02 {
    public static void main(String[]args) {
        String name = "education";
        String vowels = "";
        String Con = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                    vowels = vowels + ch;
                }else {
                    Con = Con + ch;
                }
        }

        System.out.println(vowels.length());
        System.out.println(Con.length());


    }
}
