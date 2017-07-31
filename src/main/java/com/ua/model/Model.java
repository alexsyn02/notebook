package main.java.com.ua.model;

import main.java.com.ua.model.entity.Address;
import main.java.com.ua.model.entity.Group;
import main.java.com.ua.model.entity.Notebook;
import main.java.com.ua.model.entity.Record;
import main.java.com.ua.model.util.NicknameAlreadyExistsException;

import java.util.Date;
import java.util.Set;

/**
 * Created by Alexandr on 26.07.2017.
 */
public class Model {

    private Notebook notebook;

    public Model() {
        notebook = new Notebook();
    }

    public void addRecord(Record record) throws NicknameAlreadyExistsException {
        notebook.add(record);
    }
}