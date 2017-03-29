import java.util.ArrayList;

/**
 * Created by Jacek on 2017-03-23.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactionList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionList() {
        return transactionList;
    }

    public void addTransaction(Double transaction) {
        transactionList.add(transaction);
    }

    public Customer(String name, Double initialTransaction) {
        this.name = name;
        this.addTransaction(initialTransaction);
    }
}
