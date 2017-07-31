package main.java.com.ua;

import main.java.com.ua.controller.Controller;
import main.java.com.ua.model.Model;
import main.java.com.ua.view.View;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
