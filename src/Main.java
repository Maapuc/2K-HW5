public class Main {
    public static void main(String[] args) {

        try {
            UsersEnter.checkUsers("sca1123dds", "qwerty123*", "qwerty123*");
        } catch (WrongLoginException e) {
            System.out.println(" Логин не верный ");
        } catch (WrongPasswordException e) {
            System.out.println("Пароль не верный ");
        }

    }
}