package by.academy.lavka;

public abstract class Fruct {
    protected double weight;
    protected double price;

    protected Fruct(){
        super();
    }

    protected Fruct(double weight, double price) {
        this.weight = weight;
        this.weight = price;
    }

    protected abstract double getPrice ();

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruct{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
