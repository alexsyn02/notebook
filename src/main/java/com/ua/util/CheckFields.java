package main.java.com.ua.util;

/**
 * Created by Alexandr on 26.07.2017.
 */
public class CheckFields {
    public static final String NAME_PATTERN = "^[a-zA-Z]+(([\\'\\,\\.\\- ][a-zA-Z ])?[a-zA-Z]*)*$";
    public static final String PHONE_PATTERN = "^(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*$";
    public static final String DATE_PATTERN = "((0?[13578]|10|12)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[01]?))(-|\\/)((\\d{4})|(\\d{2}))|(0?[2469]|11)(-|\\/)((0[0-9])|([12])([0-9]?)|(3[0]?))(-|\\/)((\\d{4}|\\d{2})))";
    public static final String EMAIL_PATTERN = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
    public static final String ENUM_PATTERN = "friends|relatives|colleagues|favorites";
    public static final String NICK_PATTERN = "^[a-zA-Z][a-zA-z0-9\\.,\\-_]{5,31}$";
    public static final String CITY_STREET_PATTERN = "[a-zA-Z]*";
    public static final String HOUSE_NUMBER_PATTERN = "[0-9]{1,3}$";
    public static final String POST_CODE_PATTERN = "[0-9]{5}$";

    public boolean check(String expression, String pattern) {
        return expression.matches(pattern);
    }
}
