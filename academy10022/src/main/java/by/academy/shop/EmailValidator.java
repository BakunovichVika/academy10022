package by.academy.shop;

public class EmailValidator implements Validator {

    @Override
    public boolean validate(String valid) {
        if (Regex.checkEmail(valid) == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
