package by.academy.lesson19;

import java.util.ArrayList;
import java.util.Set;

public class Customer {

    private String name;
    private Set<Address> addresses;
    private ArrayList<Order> orders;

    public Customer(String name, Set<Address> addresses, ArrayList<Order> orders) {
        this.name = name;
        this.addresses = addresses;
        this.orders = orders;
    }

    public Customer() {
        super();
    }

    void setAddress(Address address){
        addresses.add(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Address> getAddressSet() {
        return addresses;
    }

    public void setAddressSet(Set<Address> addressSet) {
        this.addresses = addressSet;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", addressSet=" + addresses +
                '}';
    }
}
