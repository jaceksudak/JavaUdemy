package jaceksudak.udemy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player jack = new Player("Jacek",15,3);
        System.out.println(jack.toString());
        saveObject(jack);

        jack.setHitPoints(2);
        System.out.println(jack);
        jack.setLevel(5);
        saveObject(jack);
        loadObject(jack);
        System.out.println(jack);
    }



    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISavable objectToSave) {
        for( int i=0; i<objectToSave.save().size(); i++ ) {
            System.out.println("Saving "+objectToSave.save().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.load(values);
    }
}
