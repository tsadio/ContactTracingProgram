public class Address {
    public String street;
    public String city;
    public String state;
    public String date;


    public Address() {
    }

    public Address(String street, String city, String state, String date) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.date = date;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void theAddress (String street, String city, String state) {
        System.out.println("Address: " + street + ", " + city + ", " + state);
    }

    public void theDate (String date) {
        System.out.println("Contacted Date: " + date);
    }
}
