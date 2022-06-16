package model;

import java.util.regex.Pattern;

public class Customer {

    private String firstName;
    private String lastName;
    private String email = "^(.+)@(.+).(.+)$";
    private Pattern pattern = Pattern.compile(email);

    public Customer(String firstName, String lastName, String email) {
        if(!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException("Error! Invalid email.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + email;
    }
}
