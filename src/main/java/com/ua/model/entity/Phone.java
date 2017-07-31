package main.java.com.ua.model.entity;

/**
 * Created by Alexandr on 30.07.2017.
 */
public class Phone {

    private String phone;
    private String otherPhone;

    public Phone(String phone, String otherPhone) {
        this.phone = phone;
        this.otherPhone = otherPhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public void setOtherPhone(String otherPhone) {
        this.otherPhone = otherPhone;
    }
}
