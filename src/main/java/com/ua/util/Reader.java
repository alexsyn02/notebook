package main.java.com.ua.util;

import com.sun.prism.impl.Disposer;
import main.java.com.ua.entity.Address;
import main.java.com.ua.entity.Group;
import main.java.com.ua.entity.Model;
import main.java.com.ua.view.View;

import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Alexandr on 26.07.2017.
 */
public class Reader {

    private final int AMOUNT_OF_FIELDS = 16;
    private CheckFields checkFields = new CheckFields();
    private Model model = new Model();
    private Address address = new Address();
    private View view;

    public Reader(View view) {
        this.view = view;
    }

    public Model read() {

        Scanner sc = new Scanner(System.in);
        int index = 0;

        String msg = null;
        boolean success = false;

        while (index < AMOUNT_OF_FIELDS) {

            view.showInvitation(index);
            msg = sc.nextLine();

            switch (index) {

                case 0:
                    success = setName(msg);
                    break;
                case 1:
                    success = setSurname(msg);
                    break;
                case 2:
                    success = setPatronymic(msg);
                    break;
                case 3:
                    success = setNickname(msg);
                    break;
                case 4:
                    success = setSkype(msg);
                    break;
                case 5:
                    success = setHomePhone(msg);
                    break;
                case 6:
                    success = setPhone(msg);
                    break;
                case 7:
                    success = setAnotherPhone(msg);
                    break;
                case 8:
                    success = setGroup(msg);
                    break;
                case 9:
                    success = setEmail(msg);
                    break;
                case 10:
                    success = setComment(msg);
                    break;
                case 11:
                    success = setPostcode(msg);
                    break;
                case 12:
                    success = setCity(msg);
                    break;
                case 13:
                    success = setStreet(msg);
                    break;
                case 14:
                    success = setHouse(msg);
                    break;
                case 15:
                    success = setFlat(msg);
                    break;
            }

            if (success) {
                index++;
                success = false;
            } else {
                view.showError();
            }
        }

        model.setAddress(address);
        Date now = new Date();
        Set<Date> dates = new HashSet<Date>();
        dates.add(now);
        model.setDatesOfChanges(dates);
        model.setLastChangeDate(now);

        return model;
    }

    private boolean setName(String message) {
        if (checkFields.check(message, CheckFields.NAME_PATTERN)) {
            model.setName(message);
            return true;
        }
        return false;
    }

    private boolean setSurname(String message) {
        if (checkFields.check(message, CheckFields.NAME_PATTERN)) {
            model.setSurname(message);
            return true;
        }
        return false;
    }

    private boolean setPatronymic(String message) {
        if (checkFields.check(message, CheckFields.NAME_PATTERN)) {
            model.setPatronymic(message);
            return true;
        }
        return false;
    }

    private boolean setNickname(String message) {
        if (checkFields.check(message, CheckFields.NICK_PATTERN)) {
            model.setNickname(message);
            return true;
        }
        return false;
    }

    private boolean setSkype(String message) {
        if (checkFields.check(message, CheckFields.NICK_PATTERN)) {
            model.setSkype(message);
            return true;
        }
        return false;
    }

    private boolean setPhone(String message) {
        if (checkFields.check(message, CheckFields.PHONE_PATTERN)) {
            model.setPhone(message);
            return true;
        }
        return false;
    }

    private boolean setHomePhone(String message) {
        if (checkFields.check(message, CheckFields.PHONE_PATTERN)) {
            model.setHomePhone(message);
            return true;
        }
        return false;
    }

    private boolean setAnotherPhone(String message) {
        if (checkFields.check(message, CheckFields.PHONE_PATTERN)) {
            model.setAnotherPhone(message);
            return true;
        }
        return false;
    }

    private boolean setGroup(String message) {
        if (checkFields.check(message, CheckFields.ENUM_PATTERN)) {
            Set<Group> groups = new HashSet<Group>();
            if (message.equals("friends")) {
                groups.add(Group.FRIENDS);
            } else if (message.equals("relatives")) {
                groups.add(Group.RELATIVES);
            } else if (message.equals("colleagues")) {
                groups.add(Group.COLLEAGUES);
            } else if (message.equals("favorites")) {
                groups.add(Group.FAVORITES);
            }

            model.setGroups(groups);

            return true;
        }
        return false;
    }

    private boolean setEmail(String message) {
        if (checkFields.check(message, CheckFields.EMAIL_PATTERN)) {
            model.setEmail(message);
            return true;
        }
        return false;
    }

    private boolean setComment(String message) {
        model.setComment(message);
        return true;
    }

    private boolean setPostcode(String message) {
        if (checkFields.check(message, CheckFields.POST_CODE_PATTERN)) {
            address.setPostcode(message);
            return true;
        }
        return false;
    }

    private boolean setCity(String message) {
        if (checkFields.check(message, CheckFields.CITY_STREET_PATTERN)) {
            address.setCity(message);
            return true;
        }
        return false;
    }

    private boolean setStreet(String message) {
        if (checkFields.check(message, CheckFields.CITY_STREET_PATTERN)) {
            address.setStreet(message);
            return true;
        }
        return false;
    }

    private boolean setHouse(String message) {
        if (checkFields.check(message, CheckFields.HOUSE_NUMBER_PATTERN)) {
            address.setHouse(Integer.valueOf(message));
            return true;
        }
        return false;
    }

    private boolean setFlat(String message) {
        if (checkFields.check(message, CheckFields.HOUSE_NUMBER_PATTERN)) {
            address.setFlat(Integer.valueOf(message));
            return true;
        }
        return false;
    }
}
