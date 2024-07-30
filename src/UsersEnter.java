public class UsersEnter {
    public static final String CHECKSUMBOLS = "qwertyuiopasdfghjklzxcvbnm1234567890_";

    public static void checkUsers(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20 || !checkString(login)) {
            throw new WrongLoginException();
        }

        if (password.length() > 20 || !checkString(password) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }

    private static boolean checkString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!CHECKSUMBOLS.contains(String.valueOf(str.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

}