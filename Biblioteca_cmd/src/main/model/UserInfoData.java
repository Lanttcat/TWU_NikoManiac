package main.model;

/**
 * @program: Biblioteca_cmd
 * @description: strage user infamation
 * @author: NikoLan
 * @create: 2018-07-19 16
 */
public class UserInfoData {
    private static UserInfo normalUser = new UserInfo("normal", "lan", "test001");
    private static UserInfo manageUser = new UserInfo("manage", "lanM", "test001M");

    public static UserInfo getNormalUser() {
        return normalUser;
    }

    public static UserInfo getManageUser() {
        return manageUser;
    }
}
