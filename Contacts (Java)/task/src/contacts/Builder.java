package contacts;

public abstract class Builder {
    protected String number;

    public abstract Contact getResult();

    public void setNumber(String number) {
        if (Contact.isNumberValid(number)) {
            this.number = number;
        } else {
            this.number = null;
            System.out.println("Wrong number format!");
        }
    }


}