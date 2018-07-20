package main.view;

/**
 * @program: Biblioteca_cmd
 * @description: welcome page view
 * @author: NikoLan
 * @create: 2018-07-18 15
 */
public class WelcomePage extends View {
    public String page() {
        return super.showView(drawView());

    }

    @Override
    public String  drawView() {
        Components components = new Components(60);
        String viewStringTitle = components.drawFrameTitle("welcome to Bilioteca");
        String viewStringTip = components.cmdTip("Please enter the user type number:");
        String viewSelectText = components.drawBaseText("1.user 2.manager", "left");
        return viewStringTitle + viewSelectText + viewStringTip;
    }
}
