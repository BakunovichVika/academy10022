package by.academy.lesson16;

public class Lyamda {
    public static void main(String[] args) {

        Bird  bird = new Bird ("Вася");
        Flyable f = b -> System.out.println("Птица " + bird.name + " летает");
        f.fly(bird);
        
    }
}
