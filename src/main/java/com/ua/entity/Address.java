package main.java.com.ua.entity;

/**
 * Created by Alexandr on 26.07.2017.
 */
public class Address {

    private String postcode;
    private String city;
    private String street;
    private int house;
    private int flat;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Address [postcode=" + postcode + ", city=" + city + ", street=" + street
                + ", houseNumber=" + house + ", flatNumber=" + flat + "]";
    }
}
