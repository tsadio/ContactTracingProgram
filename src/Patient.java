public class Patient extends Address {
    String name;
    String phone;
    String email;
    String symptoms;

    public Patient() {
    }

    public Patient(String name, String phone, String email, String symptoms) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.symptoms = symptoms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms (String symptoms) {
        this.symptoms = symptoms;
    }


    public String toString() {
        return "Name: " + getName() + "\nPhone: " + getPhone() + "\nEmail: " + getEmail();
        //System.out.println(toString());

    }
}
