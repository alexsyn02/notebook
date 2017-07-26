package main.java.com.ua.entity;

import java.util.Date;
import java.util.Set;

/**
 * Created by Alexandr on 26.07.2017.
 */
public class Model {

    private String name;
    private String surname;
    private String patronymic;
    private String nickname;
    private String comment;
    private Set<Group> groups;
    private String homePhone;
    private String phone;
    private String anotherPhone;
    private String email;
    private String skype;
    private Address address;
    private Set<Date> datesOfChanges;
    private Date lastChangeDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAnotherPhone() {
        return anotherPhone;
    }

    public void setAnotherPhone(String anotherPhone) {
        this.anotherPhone = anotherPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Date> getDatesOfChanges() {
        return datesOfChanges;
    }

    public void setDatesOfChanges(Set<Date> datesOfChanges) {
        this.datesOfChanges = datesOfChanges;
    }

    public Date getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(Date lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    public String getPerson() {
        return surname + " " + name.charAt(0) + ".";
    }

    @Override
    public String toString() {
        return "Record [surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
                + ", nickName=" + nickname + ", comment=" + comment + ", groups=" + groups + ", homePhoneNumber="
                + homePhone + ", mobilePhone=" + phone + ", anotherPhone=" + anotherPhone + ", email="
                + email + ", skype=" + skype + ", address=" + address + ", datesOfChanges=" + datesOfChanges
                + ", lastChange=" + lastChangeDate + "]";
    }
}
