package contacts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Scanner scanner = new Scanner(System.in);
        PhoneBookOption option = null;

        while (option != PhoneBookOption.EXIT) {
            System.out.print("Enter action (add, remove, edit, count, info, exit): ");
            try {
                option = PhoneBookOption.valueOf(scanner.nextLine().toUpperCase());

                switch (option) {
                    case ADD:
                        ContactPersonBuilder builder = ContactCLI.getContactPersonBuilderFromCLI();
                        Contact contact = builder.getResult();
                        phoneBook.addContact(contact);
                        break;
                    case COUNT:
                        phoneBook.printCount();
                        break;
                    case INFO:
                        if (phoneBook.getCount() == 0) {
                            System.out.println("No records to list!");
                        } else {
                            phoneBook.listContacts();
                            System.out.print("Enter index to show info: ");
                            int record = Integer.parseInt(scanner.nextLine());
                            phoneBook.printContactDescription(record);
                        }
                        break;
                    case REMOVE:
                        if (phoneBook.getCount() == 0) {
                            System.out.println("No records to remove!");
                        } else {
                            phoneBook.listContacts();
                            System.out.print("Select a record: ");
                            int record = Integer.parseInt(scanner.nextLine());
                            phoneBook.removeContact(record);
                        }
                        break;
                    case EDIT:
                        if (phoneBook.getCount() == 0) {
                            System.out.println("No records to edit!");
                        } else {
                            phoneBook.listContacts();
                            System.out.print("Select a record: ");
                            int record = Integer.parseInt(scanner.nextLine());
                            phoneBook.editContact(record);
                        }
                        break;
                    case EXIT:
                        break;
                    default:
                        System.out.println(option + " not yet implemented.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong Action!");
            }

        }
    }
}
