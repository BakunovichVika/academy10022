package by.academy.shop;

public class BelarusPhoneValidator implements Validator {
    @Override
    public boolean validate(String valid) {
        if (Regex.checkBelarus(valid) == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
