package main.java.com.ua.model.util;

import main.java.com.ua.model.entity.Record;

/**
 * Created by Alexandr on 30.07.2017.
 */
public class NicknameAlreadyExistsException extends Exception {

    private Record record;

    public NicknameAlreadyExistsException(Record record) {
        this.record = record;
    }

    public NicknameAlreadyExistsException(String message, Record record) {
        super(message);
        this.record = record;
    }

    public Record getRecord() {
        return record;
    }
}
