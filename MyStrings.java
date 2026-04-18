public class MyStrings {
    public static void main(String[] args) {

        String item1 = "Laptop";
        String item2 = "Charger";

        System.out.println("Items: " + item1 + " " + item2);

        System.out.println("Length of item1: " + item1.length());

        System.out.println("Uppercase of item2: " + item2.toUpperCase());

        System.out.println("Lowercase of item1: " + item1.toLowerCase());

        System.out.println("Part of item1: " + item1.substring(0, 3));

        System.out.println("Same or not: " + item1.equals(item2));
    }
}