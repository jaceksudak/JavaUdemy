/**
 * Created by Jacek on 2017-03-22.
 */
public class Contact {
    private int phoneNumber;
    private String name;

    public Contact(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
