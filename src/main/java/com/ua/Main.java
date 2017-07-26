package main.java.com.ua;

import main.java.com.ua.controller.Controller;
import main.java.com.ua.entity.Model;
import main.java.com.ua.util.Reader;
import main.java.com.ua.view.View;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {

        Model model = new Model();
        View view = new View();
        Reader reader = new Reader(view);

        Controller controller = new Controller(model, view, reader);
        controller.doProcess();
    }
}
