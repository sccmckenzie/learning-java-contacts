package contacts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Contact {
    private String number;
    private final LocalDateTime creationTime;
    private LocalDateTime updateTime;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


    public Contact(String number) {
        setNumber(number);
        LocalDateTime currentTime = LocalDateTime.now();
        this.creationTime = currentTime;
        this.updateTime = currentTime;
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


    public String getCreationTime() {
        return creationTime.format(formatter);
    }

    public String getUpdateTime() {
        return updateTime.format(formatter);
    }

    public void setUpdateTime() {
        this.updateTime = LocalDateTime.now();
    }

    public abstract String getShortDescription();

    public void printLongDescription() {
        System.out.println("Number: " + getNumber());
        System.out.println("Time created: " + getCreationTime());
        System.out.println("Time last edit: " + getUpdateTime());
    }
}