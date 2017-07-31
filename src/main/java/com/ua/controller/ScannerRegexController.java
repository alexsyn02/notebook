package main.java.com.ua.controller;

import main.java.com.ua.view.View;
import main.java.com.ua.view.ViewConstants;

import java.util.Scanner;

/**
 * Created by Alexandr on 30.07.2017.
 */
public class ScannerRegexController {

    private View view;

    public ScannerRegexController(View view) {
        this.view = view;
    }

    /**
     * Gets data from user.
     * If the entered data is not verified, they will be re-entered.
     * @param sc
     * @param inputProperty
     * @param regex
     * @return inputted data
     */
    public String inputStringInAccordanceWithRegex(Scanner sc, String inputProperty, String regex) {
        String inputMessage = getMessageFromBundle(inputProperty);
        String inputField;

        view.printMessage(inputMessage);

        while (!(inputField = sc.nextLine()).matches(regex)) {
            view.printMessage(getMessageFromBundle(ViewConstants.WRONG_INPUT));
            view.printMessage(inputMessage);
        }

        return inputField;
    }

    private String getMessageFromBundle(String propertyName) {
        return view.getBundle().getString(propertyName);
    }
}