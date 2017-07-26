package main.java.com.ua.view;

import com.sun.org.apache.xpath.internal.operations.Mod;
import main.java.com.ua.entity.Model;

/**
 * Created by Alexandr on 26.07.2017.
 */
public class View {
    private final String INVITATION = "Enter ";
    private final String ERROR = "Incorrect! Try again!";
    private final String COLON = ":";

    private final String NAME = "Name: ";
    private final String SURNAME = "Surname: ";
    private final String PATRONYMIC = "Patronymic: ";
    private final String NICKNAME = "Nickname: ";
    private final String SKYPE = "Skype: ";
    private final String HOME_PHONE = "Home phone: ";
    private final String MOBILE_PHONE = "Mobile phone: ";
    private final String ANOTHER_PHONE = "Another phone: ";
    private final String EMAIL = "E-mail: ";
    private final String GROUPS = "Groups: ";
    private final String COMMENT = "Comment: ";
    private final String DATES_OF_CHANGES = "Dates of changes: ";
    private final String LAST_CHANGE = "Last change: ";
    private final String POSTCODE = "Postcode: ";
    private final String CITY = "City: ";
    private final String STREET = "Street: ";
    private final String HOUSE_NUMBER = "House number: ";
    private final String FLAT_NUMBER = "Flat number: ";

    private String[] titles = { "name", "surname", "patronymic", "nickname", "skype", "mobilephone", "homephone", "anotherphone",
            "group", "email", "comment", "postcode", "city", "street", "house", "flat" };

    public void showInvitation(int index) {
        System.out.println(INVITATION + titles[index] + COLON);
    }

    public void showError() {
        System.out.println(ERROR);
    }

    public void show(Model model) {

        System.out.println(NAME + model.getName());
        System.out.println(SURNAME + model.getSurname());
        System.out.println(PATRONYMIC + model.getPatronymic());
        System.out.println(NICKNAME + model.getNickname());
        System.out.println(SKYPE + model.getSkype());
        System.out.println(HOME_PHONE + model.getHomePhone());
        System.out.println(MOBILE_PHONE + model.getPhone());
        System.out.println(ANOTHER_PHONE + model.getAnotherPhone());
        System.out.println(EMAIL + model.getEmail());
        System.out.println(GROUPS + model.getGroups());
        System.out.println(COMMENT + model.getComment());
        System.out.println(DATES_OF_CHANGES + model.getDatesOfChanges());
        System.out.println(LAST_CHANGE + model.getLastChangeDate());
        System.out.println(POSTCODE + model.getAddress().getPostcode());
        System.out.println(CITY + model.getAddress().getCity());
        System.out.println(STREET + model.getAddress().getStreet());
        System.out.println(HOUSE_NUMBER + model.getAddress().getHouse());
        System.out.println(FLAT_NUMBER + model.getAddress().getFlat());
    }
}
