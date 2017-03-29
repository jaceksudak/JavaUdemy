import java.util.ArrayList;

/**
 * Created by Jacek on 2017-03-23.
 */
public class Bank {
    private String bankName;
    private ArrayList<Branch> branchList = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addBranch(String branchName) {
        int i = checkBranchNumber(branchName);
        if(i==-1) {
            Branch newBranch = new Branch(branchName);
            branchList.add(newBranch);
            System.out.println("Dodano placowke o nazwie "+branchName);
        } else {
            System.out.println("Placowska juz istnieje.");
        }
    }

    public void addCustomer(String branchName, String customerName, double transactionAmount) {
        int i = checkBranchNumber(branchName);
        if(i!=-1) {
            System.out.println("Dodaje klienta do listy placowki "+branchName);
            branchList.get(i).addCustomer(customerName,transactionAmount);
        } else {
            System.out.println("Placowka o nazwie "+branchName+" nie istnieje.");
        }
    }

    public void addTransaction(String branchName, String customerName, double transactionAmount) {
        int i = checkBranchNumber(branchName);
        if(i!=-1) {
            System.out.println("Proba dodania transakcji...");
            branchList.get(i).addCustomerTransaction(customerName,transactionAmount);
        } else {
            System.out.println("Placowka o nazwie "+branchName+" nie istnieje.");
        }
    }

    public void showBranchList(String branchName) {
        int i = checkBranchNumber(branchName);
        if(i!=-1) {
            System.out.println("Proba wyswietlenia listy...");
            branchList.get(i).getCustomerList();
        } else {
            System.out.println("Placowka o nazwie "+branchName+" nie istnieje.");
        }
    }

    public void showCustomerList(String branchName, String customerName) {
        int i = checkBranchNumber(branchName);
        if(i!=-1) {
            System.out.println("Proba wyswietlenia listy transakcji klienta...");
            branchList.get(i).getCustomerTransactionList(customerName);
        } else {
            System.out.println("Placowka o nazwie "+branchName+" nie istnieje.");
        }
    }


    private int checkBranchNumber(String branchName) {
        for(int i=0;i<branchList.size();i++) {
            if(branchList.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }




}
