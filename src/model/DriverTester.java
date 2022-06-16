package model;

public class DriverTester {
    public static void main(String[] args) {
        Customer customer = new Customer("first", "last", "test@test.com");
        System.out.println(customer);

        Customer customerTwo = new Customer("Bill", "Blass", "email");
        System.out.println(customerTwo);
    }
}
