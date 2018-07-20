package main;

import main.controller.MainController;

/**
 * @program: Biblioteca_cmd
 * @description: app main entry
 * @author: NikoLan
 * @create: 2018-07-18 12
 */
public class MainApp {
    public static void main(String[] args) {
        new MainApp().start();
    }

    private void start() {
        new MainController();
    }

}
