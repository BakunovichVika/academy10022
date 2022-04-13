package by.academy.shop;

public class AmericanPhoneValidator implements Validator {

    @Override
    public boolean validate(String valid) {
        if (Regex.checkAmerican(valid) == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
