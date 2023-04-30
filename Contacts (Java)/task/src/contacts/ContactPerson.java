package contacts;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ContactPerson extends Contact {
    private String name;
    private String surname;
    private LocalDate birthDate;

    private Gender gender;

    public ContactPerson(String name, String surname, String birthDate, String gender, String number) {
        super(number);
        this.name = name;
        this.surname = surname;
        setBirthDate(birthDate);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        if (this.birthDate == null) {
            return "[no data]";
        } else {
            return this.birthDate.toString();
        }
    }

    public void setBirthDate(String birthDate) {
        try {
            this.birthDate = LocalDate.parse(birthDate);
        } catch (DateTimeParseException e) {
            this.birthDate = null;
            System.out.println("Bad birth date!");
        }
    }

    public String getGender() {
        if (this.gender == null) {
            return "[no data]";
        } else {
            return this.gender.toString();
        }
    }

    public void setGender(String gender) {
        try {
            this.gender = Gender.valueOf(gender.toUpperCase());
        } catch (IllegalArgumentException e) {
            this.gender = null;
            System.out.println("Bad gender!");
        }
    }

    public String getShortDescription() {
        return getName() + " " + getSurname();
    }

    @Override
    public void printLongDescription() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Birth date: " + getBirthDate());
        System.out.println("Gender: " + getGender());
        super.printLongDescription();
    }
}
