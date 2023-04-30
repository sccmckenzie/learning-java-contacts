package contacts;

public class ContactOrg extends Contact {
    private String orgName;

    private String address;

    public ContactOrg(String orgName, String address, String number) {
        super(number);
        this.orgName = orgName;
        this.address = address;
    }


    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShortDescription() {
        return getOrgName();
    }

    @Override
    public void printLongDescription() {
        System.out.println("Organization name: " + getOrgName());
        System.out.println("Address: " + getAddress());
        super.printLongDescription();
    }
}
