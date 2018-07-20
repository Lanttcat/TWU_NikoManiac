package main.view;

import main.model.Book;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @program: Biblioteca_cmd
 * @description: the view base components
 * @author: NikoLan
 * @create: 2018-07-18 16
 */
public class Components {

    private int framewidth;

    public Components(int width) {
        this.framewidth = width;
    }

    public Components() {

    }

    public String batchChar(char printChar, int width) {
        String chars = "";
        for (int i = 0; i < width; i++) {
            chars += printChar;
        }
        return chars;
    }

    public String centerString(String text, int width, String sideStr) {
        String chars = "";
        int textLen = text.length();
        int sideStrLen = sideStr.length();

        int spaceLen = (width - textLen - 2 * sideStrLen) / 2;

        chars = sideStr
                + this.batchChar(' ', spaceLen)
                + text
                + this.batchChar(' ', spaceLen)
                + (textLen % 2 == 1 ? ' ' : "")
                + sideStr;

        return chars + '\n';
    }

    public String rightString(String text, int width, String sideStr) {
        String chars = "";
        int textLen = text.length();
        int sideStrLen = sideStr.length();

        int spaceRightLen = (width - textLen - 2 * sideStrLen);

        chars = sideStr
                + this.batchChar(' ', spaceRightLen)
                + text
                + (textLen % 2 == 1 ? ' ' : "")
                + sideStr;

        return chars;
    }

    public String leftString(String text, int width, String sideStr) {
        String chars = "";
        int textLen = text.length();
        int sideStrLen = sideStr.length();

        int spaceRightLen = (width - textLen - 2 * sideStrLen) -  (textLen % 2 == 1 ? 1 : 0);

        chars = sideStr
                + text
                + this.batchChar(' ', spaceRightLen)
                + (textLen % 2 == 1 ? ' ' : "")
                + sideStr;

        return chars + '\n';
    }

    public String cmdTip(String tipText){
        String cmdTipString = "**" + tipText;

        return cmdTipString;
    }
    public String drawFrameTitle(String windowTitle) {

        String titleText = "";

        titleText = this.batchChar('*', this.framewidth) + '\n'
                                    + centerString(windowTitle, this.framewidth, "*&&*")
                                    + this.batchChar('*', this.framewidth) + '\n';

        return titleText;

    }

    public String drawBaseText(String text, String align) {
        String result ="";
        try {
            String methodName = align + "String";
            Class<?> clx = Class.forName("main.view.Components");

            Method method = clx.getMethod("leftString", String.class, int.class, String.class);

            result = (String) method.invoke(clx.newInstance(), text, this.framewidth, "**");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    public static void drawFrameMainContent() {

    }

    public String listComponent(LinkedHashSet data, String columnName) {

        String text = "";
        text = this.leftString(columnName, this.framewidth, "**");
        Iterator it = data.iterator();
        while (it.hasNext()) {
            Book bookItem = (Book)it.next();
            text += this.leftString(" " + bookItem.getBookOrder() + "   "+ bookItem.getBookName(), this.framewidth, "**");
        }

        return text;

    }

    public static void runDrawFrame() {

    }
}
