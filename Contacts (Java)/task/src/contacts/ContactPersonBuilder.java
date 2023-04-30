package contacts;

public class ContactPersonBuilder implements Builder {
    private String name;
    private String surname;
    private String birthDate;
    private String gender;
    private String number;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    public Contact getResult() {
        return new ContactPerson(name, surname, birthDate, gender, number);
    }
}
