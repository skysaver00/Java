import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myContacts = new ArrayList<Contact>();
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact) {
        int position = findContact(contact.getName());
        if(position >= 0) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact.getName());
        if(position >= 0) {
            myContacts.set(position, newContact);
            return true;
        } else return false;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact.getName());
        if(position >= 0) {
            myContacts.remove(position);
            return true;
        } else return false;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String number) {
        for(int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if(contact.getName() == number) return i;
        }
        return -1;
    }

    public Contact queryContact(String number) {
        int position = findContact(number);
        if(position >= 0) {
            return this.myContacts.get(position);
        } else return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " +
                    contact.getPhoneNumber());
        }
    }
}
