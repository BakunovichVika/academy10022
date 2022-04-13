package by.academy.lesson10;

public enum Juice1 {

     COLOR ("ORANGE", "GREEN", "RED"), JUICEPERCENT (10, 15, 20);

    private String c1,c2,c3;
     private int j1,j2,j3;

    Juice1 (String c1, String c2, String c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    Juice1 (int j1, int j2, int j3) {
        this.j1 = j1;
        this.j2 = j2;
        this.j3 = j3;
    }

    Juice1 (String c1, int j1) {
        this.c1=c1;
        this.j1=j1;
    }

    public String getC1() {
        return c1;
    }

    public String getC2() {
        return c2;
    }

    public String getC3() {
        return c3;
    }

    public int getJ1() {
        return j1;
    }

    public int getJ2() {
        return j2;
    }

    public int getJ3() {
        return j3;
    }
}
