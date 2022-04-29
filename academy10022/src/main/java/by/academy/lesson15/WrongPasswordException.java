package by.academy.lesson15;

public class WrongPasswordException extends Exception{

    public WrongPasswordException(){
    }

    public WrongPasswordException (String message){
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" + "message=" + getMessage() + "}";
    }
}
