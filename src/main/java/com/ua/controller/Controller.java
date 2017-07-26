package main.java.com.ua.controller;

import main.java.com.ua.entity.Model;
import main.java.com.ua.view.View;
import main.java.com.ua.util.Reader;

/**
 * Created by Alexandr on 26.07.2017.
 */
public class Controller {

    private Reader reader;
    private View view;
    private Model model;

    public Controller(Model model, View view, Reader reader) {
        this.model = model;
        this.view = view;
        this.reader = reader;
    }

    public void doProcess() {
        Model model = reader.read();
        view.show(model);
    }
}