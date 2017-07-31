package main.java.com.ua.controller;

import main.java.com.ua.model.Model;
import main.java.com.ua.model.entity.Record;
import main.java.com.ua.model.util.NicknameAlreadyExistsException;
import main.java.com.ua.view.View;

/**
 * Created by Alexandr on 26.07.2017.
 */
public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Gets data from user. Creates record and adds it in model.
     */
    public void processUser() {
        ScannerRegexController scannerRegexController = new ScannerRegexController(view);
        InputNotebookController inputNotebookController = new InputNotebookController(scannerRegexController);

        Record record = inputNotebookController.inputRecord();

        addRecord(inputNotebookController, record);

        view.showRecord(record);
    }

    /**
     * Checks inputed record with record thar are storing in model.
     * If the model contains an identical email address, it will re-enter.
     * @param inputNotebookController
     * @param record
     */
    void addRecord(InputNotebookController inputNotebookController, Record record) {
        boolean transactionIncompleted = true;

        do {
            try {
                model.addRecord(record);

                transactionIncompleted = false;
            } catch (NicknameAlreadyExistsException ex) {
                record = ex.getRecord();
                inputNotebookController.inputNickname();
                record.setNickname(inputNotebookController.getNickname());
                record.setDateOfLastChanging(inputNotebookController.getDateOfLastChanging());
            }
        } while (transactionIncompleted);
    }
}
