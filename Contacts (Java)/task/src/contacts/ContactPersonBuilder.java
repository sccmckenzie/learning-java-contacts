package contacts;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ContactPersonBuilder extends Builder {
    private String name;
    private String surname;
    private LocalDate birthdate;
    private Gender gender;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(String birthdate) {
        try {
            this.birthdate = LocalDate.parse(birthdate);
        } catch (DateTimeParseException e) {
            this.birthdate = null;
            System.out.println("Bad birth date!");
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


    public Contact getResult() {
        return new ContactPerson(name, surname, birthdate, gender, number);
    }
}
