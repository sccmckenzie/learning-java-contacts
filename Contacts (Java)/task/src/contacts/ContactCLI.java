package contacts;

import java.util.Scanner;

public class ContactCLI {
    public static ContactBuilder getContactBuilderFromCLI() {
        ContactBuilder builder = new ContactBuilder();

        // Get name from CLI
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        builder.setName(name);

        // Get surname from CLI
        System.out.print("Enter the surname: ");
        String surname = scanner.nextLine();
        builder.setSurname(surname);

        // Get number from CLI
        System.out.print("Enter the number: ");
        String number = scanner.nextLine();
        builder.setNumber(number);
        return builder;
    }
}
