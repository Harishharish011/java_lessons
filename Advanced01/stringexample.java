public class stringexample {
    public static void main(String[]args) {
         String str = new String ("java"); 
         String name= str.concat("programming!");
        String upper_name = name.toUpperCase();
        String first_four = "HEXA";
        String lower_name = name.toLowerCase();

        String spaceCorrection = "Hy! How are you?";

        String compare = "JAVAPROGRAMMING!";

         System.out.println(name);
         //Extracts the substring from the actual string.
         System.out.println(name.substring(0,12));
         //prints only the specific character in the string.
         System.out.println(name.charAt(1));
         System.out.println(upper_name);
         System.out.println(lower_name);

         //Used to compare one string with another.
         System.out.println("equals to UpperCase: "+ compare.equals(upper_name));         
         System.out.println("equals to lowerCase: "+ compare.equals(lower_name));   
         
         //contain: used to check things in the string.
         System.out.println( "checking the words in the string: "+ compare.contains("JAVA"));

         //replace: used to replace certain things in the string.
         System.out.println(compare.replace("JAVA","HEXA"));

         //replaceAll : used to replace the entire string into another.
         System.out.println(compare.replaceAll(compare, lower_name));

         //length: used to findout the length of the string.
         System.out.println("length of the string: "+ compare.length());

         //removing the spaces btw using the replace method.
         System.out.println( "After removing the space: "+ spaceCorrection.replace(" ",""));

    }
}
