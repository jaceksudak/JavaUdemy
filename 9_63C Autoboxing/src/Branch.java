import java.util.ArrayList;

/**
 * Created by Jacek on 2017-03-23.
 */
public class Branch {
    private String branchName;
    private ArrayList<Customer> customerList = new ArrayList<>();

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void addCustomer(String customerName, double amount) {
        int i = checkCustomerNumber(customerName);
        if(i==-1) {
            Customer newCustomer = new Customer(customerName, amount);
            customerList.add(newCustomer);
            System.out.println("Dodano klienta o nazwie "+customerName+" do listy, dodano pierwsza transakcje wysokosci: "+amount);
        } else {
            System.out.println("Klient o nazwie "+customerName+" juz jest na liscie w tej placowce.");
        }
    }

    public void addCustomerTransaction(String customerName, double amount) {
        int i = checkCustomerNumber(customerName);
        if(i!=-1) {
            customerList.get(i).addTransaction(amount);
            System.out.println("Dodano transakcje w kwocie: "+amount+" do listy transakcji klienta "+customerName);
        } else {
            System.out.println("Nie ma w bazie klienta o nazwie "+customerName );
        }
    }

    public void getCustomerList() {
        if(customerList.size()>0) {
            System.out.println("Lista klientow placowki "+this.branchName+":");
            for(int i=0; i<customerList.size();i++) {
                System.out.println((i+1)+".\t"+customerList.get(i).getName());
            }
        } else {
            System.out.println("Brak klientow na liscei tej placowki.");
        }
    }

    public void getCustomerTransactionList(String customerName) {
        int i = checkCustomerNumber(customerName);
        if(i!=-1) {
            System.out.println("Lista transakcji klienta "+customerName+": ");
            for(int j=0;j<customerList.get(i).getTransactionList().size();j++) {
                System.out.println("\t"+(j+1)+".\t"+customerList.get(i).getTransactionList().get(j)+" $");
            }
        } else {
            System.out.println("Nie ma w bazie klienta o nazwie "+customerName );
        }
    }

    private int checkCustomerNumber(String customerName) {
        for(int i=0;i<customerList.size();i++) {
            if(customerList.get(i).getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }



}
