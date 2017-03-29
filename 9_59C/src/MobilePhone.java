import java.util.ArrayList;

/**
 * Created by Jacek on 2017-03-22.
 */
public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();


    public void list() {
        System.out.println("Wypisz liste kontaktow.");
        System.out.println("Ilosc kontaktow na liscie: "+contactList.size()+".");
        for(int i=0;i<contactList.size();i++) {
            System.out.println((i+1)+". "+contactList.get(i).getName()+" "+contactList.get(i).getPhoneNumber());
        }
        System.out.println("");
    }

    private int searchForID(String name) {
        for(int i=0;i<contactList.size();i++) {
            System.out.println(contactList.get(i).getName());
            if(contactList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private int searchForID(int phoneNumber) {
        for(int i=0;i<contactList.size();i++) {
            if(contactList.get(i).getPhoneNumber()==phoneNumber) {
                return i;
            }
        }
        return -1;
    }


    public void add(String name, int number) {
        if(searchForID(number)==-1) {
            contactList.add(new Contact(number, name));
            System.out.println("Dodano kontakt o nazwie "+name+" i numerze "+number+" do listy kontaktow.");
        } else {
            System.out.println("Ten numer juz jest na liscie kontaktow.");
        }

    }

    public void update(String name, int number) {
        int queryID = searchForID(name);
        if(queryID!=-1) {
            System.out.println("Zmieniono kontakt "+name+". Stary numer: "+contactList.get(queryID).getPhoneNumber()+
            " zostal zmieniony na: "+number);
            contactList.get(queryID).setPhoneNumber(number);
        }
        else {
            System.out.println("Nie ma w spisie kontaku o nazwie: "+name);
        }
    }

    public void query(String name) {
        int queryID = searchForID(name);
        if(queryID!=-1) {
            System.out.println("Znaleziono kontakt o nazwie "+name+" Kontakt ma numer: "+contactList.get(queryID).getPhoneNumber());
        } else {
            System.out.println("Nie ma w spisie kontaku o nazwie: "+name);
        }
    }

    public void remove(String name) {
        int queryID = searchForID(name);
        if(queryID!=-1) {
            contactList.remove(queryID);
            System.out.println("Kontakt o nazwie " + name + " zostal usuniety.");
        } else {
            System.out.println("Nie ma takiego kontaktu na liscie.");
        }
    }

}
