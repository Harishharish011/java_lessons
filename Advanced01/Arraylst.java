import java.util.*;

public class Arraylst {
    public static void main(String[] args) {

        ArrayList <String> A_sentence = new ArrayList<>();

        A_sentence.add("i'm");
        A_sentence.add("monkey.D.luffy");
        A_sentence.add("Who is gonna became king of the pirates!");
        A_sentence.addFirst("hy!");

        System.out.println("sentences's size: "+ A_sentence.get(1));
        
        System.out.println("sentences's name: "+ A_sentence.contains("monkey.D.luffy,"));


        for (int i = 0; i < A_sentence.size(); i++) {
            System.out.println(A_sentence);
        }
    }
}