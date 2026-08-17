import java.util.*;

public class hashmap {
    public static void main(String[]args) {
        HashMap <String,String> Details = new HashMap<>();
        Details.put("Name","Harish");
        Details.put("Age","20");
        Details.put("Gender","Male");   
        Details.put("Name","Arun");
        Details.put("Name","vibin"); //First duplicate value will be replaced by the last duplicate value
        System.out.println(Details);
        System.out.println(Details.get("Gender"));
    }
}
