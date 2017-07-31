package main.java.com.ua.model.entity;

import java.util.ArrayList;
import main.java.com.ua.model.util.NicknameAlreadyExistsException;

/**
 * Created by Alexandr on 30.07.2017.
 */
public class Notebook {
    private ArrayList<Record> records;

    public Notebook() {
        records = new ArrayList<Record>();
    }

    public void add(Record inputedRecord) throws NicknameAlreadyExistsException {
        checkNicknameForUniq(inputedRecord);

        inputedRecord.refreshDateOfEntryInNoteBook();
        records.add(inputedRecord);
    }

    /**
     * Checks for the existence of the entered e-mail address in the record array.
     * @param inputedRecord
     * @throws NicknameAlreadyExistsException
     */
    void checkNicknameForUniq(Record inputedRecord) throws NicknameAlreadyExistsException {
        for (Record r : records) {
            if (r.getNickname().equals(inputedRecord.getNickname())) {
                throw new NicknameAlreadyExistsException(inputedRecord);
            }
        }
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<Record> records) {
        this.records = records;
    }
}
