import java.util.Scanner;

/**
 * Created by Jacek on 2017-03-08.
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        while (checkBurgerPrice()) {}
    }

    public static boolean checkBurgerPrice() {
        System.out.println("Wybierz rodzaj burgera jaki sprawdzić (1-Basic, 2-Healthy, 3-Deluxe, 4-wyjscie:");
        switch(scanner.nextInt()) {
            case 1:
                System.out.println("Wybrano BasicBurgera.");
                System.out.println("Czy dodac salate (true-tak, false-nie)");
                boolean lettuce = scanner.nextBoolean();
                System.out.println("Czy dodac ser (true - tak, false - nie)");
                boolean cheese = scanner.nextBoolean();
                System.out.println("Czy dodac pikle (true - tak, false - nie)");
                boolean pickles = scanner.nextBoolean();
                System.out.println("Czy dodac pomidory (true - tak, false - nie)");
                boolean tomato = scanner.nextBoolean();

                BaseHamburger burger1 = new BaseHamburger(lettuce,cheese,pickles,tomato);
                System.out.println("Cena tego Burgera to: "+burger1.getPrice());
                return true;

            case 2:
                System.out.println("Wybrano HealthyBurgera.");
                System.out.println("Czy dodac salate (true - tak, false - nie)");
                lettuce = scanner.nextBoolean();
                System.out.println("Czy dodac ser (true - tak, false - nie)");
                cheese = scanner.nextBoolean();
                System.out.println("Czy dodac pikle (true - tak, false - nie)");
                pickles = scanner.nextBoolean();
                System.out.println("Czy dodac pomidory (true - tak, false - nie)");
                tomato = scanner.nextBoolean();
                System.out.println("Czy dodac cebule (true - tak, false - nie)");
                boolean onion = scanner.nextBoolean();
                System.out.println("Czy dodac oliwki (true - tak, false - nie)");
                boolean olives = scanner.nextBoolean();

                HealthyHamburger burger2 = new HealthyHamburger(lettuce,cheese,pickles,tomato,onion,olives);
                System.out.println("Cena tego Burgera to: "+burger2.getPrice());
                return true;

            case 3:
                System.out.println("Wybrano DeluxeBurgera. Brak dodatków, ale są frytki i piciu.");

                DeluxeHamburger burger3 = new DeluxeHamburger();
                System.out.println("Cena tego Burgera to: "+burger3.getPrice());
                return true;

            case 4:
                System.out.println("Papa.");
                return false;

            default:
                System.out.println("Nie dokonano właściwego wyboru");
                return true;
        }
    }

}
