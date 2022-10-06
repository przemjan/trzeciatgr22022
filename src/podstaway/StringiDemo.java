package podstaway;

public class StringiDemo {
    public static void main(String[] args) {

        String name = "Franek";

        int dlugosc = name.length();

        char inicjal = name.charAt(3);

        String duze, male;

        duze = name.toUpperCase();
        male = name.toLowerCase();

        System.out.println(name);

    }
}
