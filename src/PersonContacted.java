public class PersonContacted {
    //private Address contactAddress;
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    private String contactStreet;
    private String contactCity;
    private String contactState;
    private String contactDate;

    public PersonContacted() {
    }

    public PersonContacted(String contactName, String contactPhone,
                           String contactEmail, String contactStreet, String contactCity,
                           String contactState, String contactDate) {
        //this.contactAddress = contactAddress;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.contactCity = contactCity;
        this.contactStreet = contactStreet;
        this.contactState = contactState;
        this.contactDate = contactDate;

    }

    public String getContactStreet() {
        return contactStreet;
    }

    public void setContactStreet(String contactStreet) {
        this.contactStreet = contactStreet;
    }

    public String getContactCity() {
        return contactCity;
    }

    public void setContactCity(String contactCity) {
        this.contactCity = contactCity;
    }

    public String getContactState() {
        return contactState;
    }

    public void setContactState(String contactState) {
        this.contactState = contactState;
    }

    public String getContactDate() {
        return contactDate;
    }

    public void setContactDate(String contactDate) {
        this.contactDate = contactDate;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String toString() {
        return "Name: " + getContactName() + "\nPhone: " + getContactPhone() +
                "\nEmail: " + getContactEmail() + "\nAddress: " + getContactStreet() +
                " " + getContactCity() + ", " + getContactState() + "\nContacted Date: " + getContactDate();
    }
}
