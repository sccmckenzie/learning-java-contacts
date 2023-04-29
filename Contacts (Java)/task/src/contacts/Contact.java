package contacts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
    private String name;
    private String surname;
    private String number;

    public Contact(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;

        if (isNumberValid(number)) {
            this.number = number;
        } else {
            System.out.println("Wrong number format!");
        }
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

    public String getNumber() {
        if (number == null) {
            return "[no number]";
        }
        return number;
    }

    public void setNumber(String number) {
        if (isNumberValid(number)) {
            this.number = number;
        } else {
            this.number = null;
            System.out.println("Wrong number format!");
        }
    }

    public static boolean isNumberValid(String input) {
        Pattern pattern = Pattern.compile("^\\+?(\\(\\w+\\)|\\w+[\\s-]\\(\\w{2,}\\)|\\w+)([\\s-]\\w{2,})*");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
