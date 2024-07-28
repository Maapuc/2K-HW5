public class UsersEnter {
    public static final String CHECKSUMBOLS = "qwertyuiopasdfghjklzxcvbnm1234567890_";

    public static void checkUsers(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !checkLogin(login)) {
            throw new WrongLoginException();
        }

        if (password.length() > 20 || !checkPassword(password) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }

    private static boolean checkLogin(String login) {
        for (int i = 0; i < login.length(); i++) {
            if (!CHECKSUMBOLS.contains(String.valueOf(login.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkPassword(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!CHECKSUMBOLS.contains(String.valueOf(password.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}