package contacts;

import java.util.Scanner;

public abstract class ContactCLI {
    public static ContactPersonBuilder getContactPersonBuilderFromCLI() {
        ContactPersonBuilder builder = new ContactPersonBuilder();

        // Get name from CLI
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        builder.setName(name);

        // Get surname from CLI
        System.out.print("Enter the surname: ");
        String surname = scanner.nextLine();
        builder.setSurname(surname);

        // Get birthdate from CLI
        System.out.print("Enter the birth date: ");
        String birthdate = scanner.nextLine();
        builder.setBirthdate(birthdate);

        // Get gender from CLI
        System.out.print("Enter the gender (M, F): ");
        String gender = scanner.nextLine();
        builder.setGender(gender);

        // Get number from CLI
        System.out.print("Enter the number: ");
        String number = scanner.nextLine();
        builder.setNumber(number);

        return builder;
    }

    public static ContactOrgBuilder getContactOrgBuilderFromCLI() {
        ContactOrgBuilder builder = new ContactOrgBuilder();

        // Get organization name from CLI
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the organization name: ");
        String name = scanner.nextLine();
        builder.setOrgName(name);

        // Get address from CLI
        System.out.print("Enter the address: ");
        String address = scanner.nextLine();
        builder.setAddress(address);

        // Get number from CLI
        System.out.print("Enter the number: ");
        String birthdate = scanner.nextLine();
        builder.setNumber(birthdate);

        return builder;
    }
}
