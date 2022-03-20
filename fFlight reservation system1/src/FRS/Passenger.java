package FRS;


public class Passenger {
    private static int idCounter = 0;
    private int id;
    private Passenger.Address address;
    private Passenger.Contact contact;

    public Passenger(String street, String city, String state, String name, String phone, String email) {
        this.id = ++idCounter;
        this.address = new Passenger.Address(street, city, state);
        this.contact = new Passenger.Contact(name, phone, email);
    }

    public int getId() {
        return this.id;
    }

    public String getAddressDetails() {
        return "Street: " + this.address.street + ", City: " + this.address.city + ", State: " + this.address.state;
    }

    public String getContactDetails() {
        return "Name: " + this.contact.name + ", Phone: " + this.contact.phone + ", Email: " + this.contact.email;
    }

    public static int getPassengerCount() {
        return idCounter;
    }

    private static class Contact {
        String name;
        String phone;
        String email;

        Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    private static class Address {
        String street;
        String city;
        String state;

        Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
}

