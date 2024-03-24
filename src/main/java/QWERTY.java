import data.Config;
import util.UserManager;

public class QWERTY {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserListFromCsv(Config.PATH_USER_DATA));

    }
}
