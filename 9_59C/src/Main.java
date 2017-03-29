import java.util.Scanner;

/**
 * Created by Jacek on 2017-03-22.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MobilePhone myPhone = new MobilePhone();
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            System.out.println("Podaj polecenie: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myPhone.list();
                    break;
                case 2:
                    System.out.println("Podaje nazwe szukanego kontaktu: ");
                    myPhone.query(scanner.next());
                    break;
                case 3:
                    System.out.println("Podaj nazwe nowego kontaktu: ");
                    String tempString=scanner.nextLine();
                    System.out.println("Podaj numer nowego kontaktu: ");
                    myPhone.add(tempString,scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Podaj nazwe kontaktu ktory ma zostac zmieniony: ");
                    tempString=scanner.nextLine();
                    System.out.println("Podaj nowy numer: ");
                    myPhone.update(tempString,scanner.nextInt());
                    break;
                case 5:
                    System.out.println("Podaj nazwe kontaktu ktory ma zostac usuniety: ");
                    myPhone.remove(scanner.nextLine());
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nWpisz: ");
        System.out.println("\t 0 - By wyswietlic liste instrukcji programu.");
        System.out.println("\t 1 - By wyswietlic liste kontaktow.");
        System.out.println("\t 2 - By wyszukac kontakt.");
        System.out.println("\t 3 - By dodac kontakt.");
        System.out.println("\t 4 - By zmodyfikowac kontakt.");
        System.out.println("\t 5 - By usunac kontakt.");
        System.out.println("\t 6 - By wyjsc z programu.");
    }


}
