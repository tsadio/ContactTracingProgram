import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class TracingProgram {
    public static void main (String [] args) {
        String [] symptoms = {"Fever", "Cough", "Shortness of Breath or difficulty breathing",
                               "Tiredness", "Aches", "Chills", "Sore throat", "Loss of Smell",
                               "Loss of Taste", "Headache", "Diarrhea", "Severe Vomiting"};
        ArrayList<String> patientSymptoms = new ArrayList<String>();
        ArrayList<String> numberOfDays = new ArrayList<String>();
        String ans1, ans2, ans3;
        Scanner in = new Scanner(System.in);
        ArrayList <Patient> patientInfo = new ArrayList<Patient>();
        ArrayList <PersonContacted> patientRelation = new ArrayList<PersonContacted>();
        String name, phone, email, street, city, state, date;
        String contName, contPhone, contEmail, contStreet, contCity, contState, contDate;
        Patient myPatient = new Patient ();
        PersonContacted persCont = new PersonContacted();
        Address address = new Address();
        Address contAd = new Address();


        System.out.println("*********** Contact Tracing Program *************");
        System.out.println("Enter a newly infected person's information below.");
        System.out.println("What is the patient's name? ");
        name = in.nextLine();
        myPatient.setName(name);
        System.out.println("What is the patent Phone Number? ");
        phone = in.nextLine();
        myPatient.setPhone(phone);
        System.out.println("What is the patient email? ");
        email = in.nextLine();
        myPatient.setEmail(email);

        System.out.println("What street does the patient live in? ");
        street = in.nextLine();
        address.street = street;
        System.out.println("What city does the patient live in? ");
        city = in.nextLine();
        address.city = city;
        System.out.println("What State does the patient live in? ");
        state = in.nextLine();
        address.state = state;

        patientInfo.add(myPatient);

        for (int i = 0; i < symptoms.length; i++) {
            System.out.println("Does " + myPatient.getName() + " have symptom of " +
                    symptoms[i] + " (yes or no): ");
            ans1 = in.nextLine();
            if (ans1.equals("yes") || ans1.equals("y")) {
                patientSymptoms.add(symptoms[i]);
                System.out.println("How long has " + myPatient.getName() + " has this symptom for? ");
                ans2 = in.nextLine();
                numberOfDays.add(ans2);
            }
        }

        System.out.println("Has " + myPatient.getName() + " met or run into anyone (yes or no)? ");
        ans3 = in.nextLine();
        while (ans3.equals("yes") || ans3.equals("y")) {
            System.out.println("What is his/her name: ");
            contName = in.nextLine();
            persCont.setContactName(contName);
            System.out.println("What is his/her phone number: ");
            contPhone = in.nextLine();
            persCont.setContactPhone(contPhone);
            System.out.println("What is his/her email: ");
            contEmail = in.nextLine();
            persCont.setContactEmail(contEmail);
            System.out.println("What street does he/her live in: ");
            contStreet = in.nextLine();
            contAd.street = contStreet;
            persCont.setContactStreet(contStreet);
            System.out.println("What city does he/her live in: ");
            contCity = in.nextLine();
            persCont.setContactCity(contCity);
            contAd.city = contCity;
            System.out.println("What State does he/her live in: ");
            contState = in.nextLine();
            contAd.state = contState;
            persCont.setContactState(contState);
            System.out.println("When did " + myPatient.getName() + " see him/her (mm/dd/yyyy): ");
            contDate = in.nextLine();
            contAd.date = contDate;
            persCont.setContactDate(contDate);
            patientRelation.add(persCont);

            System.out.println("Does " + myPatient.getName() + " met or run into anyone else (y/n): ");
            ans3 = in.nextLine();
        }

        System.out.println(" ");
        System.out.println("********* Contact Tracing Report ***********");
        System.out.println(myPatient.toString());
        myPatient.theAddress(street, city, state);
        System.out.println(" ");

        System.out.println("\t\t\t\tSymptoms: ");
        for (int i = 0; i < patientSymptoms.size(); i++) {
            System.out.println("\t\t\t\thad " + patientSymptoms.get(i) + " for " + numberOfDays.get(i));
        }
        System.out.println(" ");

        System.out.println(patientRelation.toString());

    }

}