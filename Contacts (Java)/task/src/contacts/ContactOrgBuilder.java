package contacts;

public class ContactOrgBuilder extends Builder {
    private String orgName;
    private String address;


    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Contact getResult() {
        return new ContactOrg(orgName, address, number);
    }
}
