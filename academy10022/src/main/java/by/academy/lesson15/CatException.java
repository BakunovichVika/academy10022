package by.academy.lesson15;

public class CatException extends Exception {

    public CatException(int age, String message) {
            super (message);
    }

    @Override
    public String toString() {
        return "CatException{" + "message=" + getMessage() + "}";
    }
}
