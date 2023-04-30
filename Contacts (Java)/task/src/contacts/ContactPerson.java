package contacts;

import java.time.LocalDate;

public class ContactPerson extends Contact {
    private String name;
    private String surname;
    private LocalDate birthdate;
    private Gender gender;

    public ContactPerson(String name, String surname, LocalDate birthdate, Gender gender, String number) {
        super(number);
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.gender = gender;
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

    public String getBirthdate() {
        if (this.birthdate == null) {
            return "[no data]";
        } else {
            return this.birthdate.toString();
        }
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        if (this.gender == null) {
            return "[no data]";
        } else {
            return this.gender.toString();
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getShortDescription() {
        return getName() + " " + getSurname();
    }

    @Override
    public void printLongDescription() {
        System.out.println("Name: " + getName());
        System.out.println("Surname: " + getSurname());
        System.out.println("Birth date: " + getBirthdate());
        System.out.println("Gender: " + getGender());
        super.printLongDescription();
    }
}
