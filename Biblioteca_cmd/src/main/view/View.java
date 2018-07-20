package main.view;

/**
 * @program: Biblioteca_cmd
 * @description: View base class
 * @author: NikoLan
 * @create: 2018-07-19 00
 */
public abstract class View {
    public View() {
    }

    protected abstract String page();

    protected String showView(String string) {
        System.out.print(string);
        String userInput = UserAction.getUserInput();
        return userInput;
    }

    protected abstract String drawView();
}

