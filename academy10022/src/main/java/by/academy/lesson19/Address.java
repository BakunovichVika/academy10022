package by.academy.lesson19;

public class Address {

    private int doorNo;
    private String street;
    private String city;
    private String zip;

    public Address(int doorNo, String street, String city, String zip) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public Address() {
        super();
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo=" + doorNo +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
