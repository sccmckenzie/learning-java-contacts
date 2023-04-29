package contacts;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        ContactBuilder builder = ContactCLI.getContactBuilderFromCLI();
        Contact contact = builder.getResult();
        phoneBook.addContact(contact);

    }
}
