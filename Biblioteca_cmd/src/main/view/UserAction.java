package main.view;

import java.util.Scanner;

/**
 * @program: Biblioteca_cmd
 * @description: user cmd action deal
 * @author: NikoLan
 * @create: 2018-07-19 00
 */
public class UserAction {
    public static String getUserInput() {
        Scanner reader = new Scanner(System.in);
        String input = reader.next();

        // if (input.equals("exit")) return;
        return input;
    }
}
