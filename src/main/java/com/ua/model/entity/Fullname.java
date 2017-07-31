package main.java.com.ua.model.entity;

/**
 * Created by Alexandr on 30.07.2017.
 */
public class Fullname {

    private String surname;

    private String name;

    private String patronymic;

    private String truncatedName;

    public Fullname(String surname, String name, String patronymic, String truncatedName) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.truncatedName = truncatedName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getTruncatedName() {
        return truncatedName;
    }

    public void setTruncatedName(String truncatedName) {
        this.truncatedName = truncatedName;
    }
}
