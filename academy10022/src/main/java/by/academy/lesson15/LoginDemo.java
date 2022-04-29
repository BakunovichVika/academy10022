package by.academy.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginDemo {

    public static final Pattern LOGIN_TEMPLATE = Pattern.compile("\\w{3,20}");
    public static final Pattern PASSWORD_TEMPLATE = Pattern.compile("\\w{3,20}");

    public static void main(String[] args) {
        try {
            login("kdsjdk", "jsdhkjdkfskjdhnjkdssljkdlsn", "sdhkjdkfskjdh");
        } catch (WrongLoginException e) {
            System.out.println("Ошибка логина " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка пароля " + e.getMessage());
        }
    }

    public static boolean login(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (password==null){
            throw new WrongPasswordException("Вы не ввели пароль");
        }
        if (login==null){
            throw new WrongLoginException("Вы не ввели логин");
        }

        Matcher matcher1 = LOGIN_TEMPLATE.matcher(login);
        Matcher matcher2 = PASSWORD_TEMPLATE.matcher(password);

        if (!matcher1.matches()){
            throw new WrongLoginException("Логин должен быть от 3 до 20");
        }
        if (!matcher2.matches()){
            throw new WrongPasswordException("Пароль должен быть от 3 до 20");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароли не совпадают");
        }
        return true;
    }

}
