package podstaway;


public class Zmienne {
    public static void main(String[] args) {

        int liczba;

        double liczba1;

        liczba = 13;
        liczba1 = 24.9;

        System.out.println("Moja liczba" + liczba +
                ", druga liczba" + liczba1);

        liczba = (int)liczba1;

        System.out.println("Moja liczba: " +liczba);


        int workHoursPerYear;
        int hours = 8;
        int workDays = 5;
        int weeks = 52;


        workHoursPerYear = hours * workDays * weeks;

        String napis = "Jest \n słonecznie \t i ładnie";

        System.out.println("Mój  \"napis\" " +napis);
        System.out.print("Mój \n napis " +napis +" \n");
        System.out.print("Mój napis " +napis);

        char znak = '#';

        boolean slonce = true; //false

        //  https://github.com/przemjan/trzeciatgr22022


    }
}
