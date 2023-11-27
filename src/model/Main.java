package model;

public class Main {
    public static void main(String[] args) {
        System.out.println("XE MÁY");
        Bike b = new Bike(299,"BMW","Prenium","S1000rr");
        b.name();
        b.speed();
        b.brand();
        b.color();

        System.out.println("----------------------------------------");

        System.out.println("XE HƠI");
        Car c = new Car(299,"Nissan","Grey","GTR-15");
        c.name();
        c.speed();
        c.brand();
        c.color();

        System.out.println("----------------------------------------");

        System.out.println("MÁY BAY");
        JetPlane jp = new JetPlane(190604,1299,"Kawasaki","pink");
        jp.seriesNumber();
        jp.brand();
        jp.color();
        jp.speed();
    }
}
