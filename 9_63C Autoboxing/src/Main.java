import java.util.Scanner;

/**
 * Created by Jacek on 2017-03-23.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("X Bank");

    public static void main(String[] args) {
        System.out.println("Witaj w X Banku");
        boolean quit = true;
        while(quit) {
            printInstructions();
            int option = scanner.nextInt();
            double amount;
            String customer, branch;
            scanner.nextLine();
            switch(option) {
                case 1:
                    System.out.println("Dodaje placowke.");
                    branch = insertBranch();
                    bank.addBranch(branch);
                    break;
                case 2:
                    System.out.println("Dodaje klienta.");
                    branch = insertBranch();
                    customer = insertCustomer();
                    amount = insertAmount();
                    bank.addCustomer(branch,customer,amount);
                    break;
                case 3:
                    System.out.println("Dodaje transakcje.");
                    branch = insertBranch();
                    customer = insertCustomer();
                    amount = insertAmount();
                    bank.addTransaction(branch,customer,amount);
                    break;
                case 4:
                    System.out.println("Wyswietlam liste klientow placowki.");
                    branch = insertBranch();
                    bank.showBranchList(branch);
                    break;
                case 5:
                    System.out.println("Wyswietlam transakcje klienta z placowki.");
                    branch = insertBranch();
                    customer = insertCustomer();
                    bank.showCustomerList(branch,customer);
                    break;
                case 6:
                    quit = false;
                    break;
                default:
                    System.out.println("Nie wybrano poprawnie.");
            }
        }
        System.out.println("Papa");


//        Customer c1 = new Customer("Jacek", 12.32);
//        System.out.println(c1.getName());
//
//        Branch b1  = new Branch("Placowka Dmowskiego");
//        b1.addCustomer("Jacek",12.52);
//        b1.addCustomerTransaction("Jacek", 2.32);
//        b1.addCustomerTransaction("Basia", 543);
//        b1.addCustomerTransaction("Jacek", 231);
//        b1.addCustomer("Jacek",123.21);
//        b1.addCustomer("Basia",123.21);
//        b1.getCustomerList();
//        b1.getCustomerTransactionList("Martynka");
//        b1.getCustomerTransactionList("Jacek");

//        bank.addBranch("Dmowskiego");
//        bank.addBranch("Dmowskiego");
//        bank.addCustomer("Dmowskiego","Jacek",999.9);
//        bank.addCustomer("Dmowskiego","Jacek",999.9);
//        bank.addCustomer("Dmowskiego","Basia",99.9);
//        bank.addTransaction("Dmowskiego","Jacek",1123);
//        bank.addTransaction("Dmowskiego","Jaroslaw",1123);
//        bank.showCustomerList("Dmowskiego","Jacek");
//        bank.showCustomerList("Dmowskiego","Jaroslaw");
//        bank.showBranchList("Dmowskiego");
//        bank.showBranchList("Dmowskiego2");

    }

    private static void printInstructions() {
        System.out.println("Lista opcji: ");
        System.out.println("\t 1. Dodaj placowke banku.");
        System.out.println("\t 2. Dodaj klienta do placowki banku.");
        System.out.println("\t 3. Dodaj transakcje do klienta w placowce banku.");
        System.out.println("\t 4. Wyswietl liste klientow placowki banku.");
        System.out.println("\t 5. Wyswietl liste transakcji klienta w danej placowce banku.");
        System.out.println("\t 6. Wyjscie.");
    }

    private static double insertAmount() {
        System.out.println("Podaj kwote: ");
        String tempString = scanner.nextLine();
        Scanner doubleScanner = new Scanner(tempString);
        while(doubleScanner.hasNext()) {
            if(doubleScanner.hasNextDouble()) {
                return doubleScanner.nextDouble();
            }
        }
        System.out.println("Zla kwota");
        return 0;
    }

    private static String insertBranch() {
        System.out.println("Podaj nazwe placowki: ");
        return scanner.nextLine();
    }

    private static String insertCustomer() {
        System.out.println("Podaj nazwe klienta: ");
        return scanner.nextLine();
    }


}
