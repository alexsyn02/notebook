package main.java.com.ua.view;

import main.java.com.ua.model.entity.Record;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Alexandr on 26.07.2017.
 */
public class View {

    private ResourceBundle bundle = ResourceBundle.getBundle("input", new Locale("en"));

    /**
     * Prints message in console.
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * Concatenates messages and prints them in console.
     * @param messages
     */
    public void printMessage(String... messages) {
        StringBuilder builder = new StringBuilder();

        for (String message :
                messages) {
            builder.append(message);
        }

        System.out.println(builder);
    }

    public void showRecord(Record record) {

        System.out.print("Fullname: ");
        System.out.println(record.getFullname().getTruncatedName());
        System.out.print("Nickname: ");
        System.out.println(record.getNickname());
        System.out.print("Group: ");
        System.out.println(record.getGroup());
        System.out.print("Description: ");
        System.out.println(record.getDescription());
        System.out.print("Main phone: ");
        System.out.println(record.getPhone().getPhone());
        System.out.print("Additional phone: ");
        System.out.println(record.getPhone().getOtherPhone());
        System.out.print("E-mail: ");
        System.out.println(record.getEmail());
        System.out.print("Skype: ");
        System.out.println(record.getSkype());
        System.out.print("Address: ");
        System.out.println(record.getAddress().getFullAddress());
        System.out.print("Date of entry in notebook: ");
        System.out.println(record.getDateOfEntryInNoteBook());
        System.out.print("Date of last changing: ");
        System.out.println(record.getDateOfLastChanging());
    }

    public ResourceBundle getBundle() {
        return bundle;
    }
}
