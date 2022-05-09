package by.academy.lesson16;

public class Bird {
    String name;

    public Bird() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }
}
