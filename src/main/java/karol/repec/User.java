package karol.repec;

import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private long age;
    private Address address;
    private List<PhoneNumber> phoneNumbers;

    public User(String firstName, String lastName, long age, Address address, List<PhoneNumber> phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }
}
