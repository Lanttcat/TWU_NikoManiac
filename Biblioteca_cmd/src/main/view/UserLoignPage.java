package main.view;

/**
 * @program: Biblioteca_cmd
 * @description: user login view
 * @author: NikoLan
 * @create: 2018-07-19 16
 */
public class UserLoignPage extends View{

    public String page() {
        return super.showView(drawView());

    }
    @Override
    protected String drawView() {
        Components components = new Components(60);
        String viewText = components.cmdTip("Please input userName:");
        return viewText;
    }

    public String inputUserName() {
        Components components = new Components(60);
        String viewText = components.cmdTip("Please input password:");
        return  super.showView(viewText);
    }

    public String errorPage() {
        return super.showView(errorView());
    }
    private String errorView() {
        Components components = new Components(60);
        String viewText = components.cmdTip("Error! Please input again:");
        return viewText;
    }

}
