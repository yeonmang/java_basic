package day15.poly.car;

public class Main {
    public static void main(String[] args) {
        Tucson t1 = new Tucson();
        Tucson t2 = new Tucson();
        Tucson t3 = new Tucson();

        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();
        Sonata s4 = new Sonata();

        Driver park = new driver();
        park.driveSonata(s1);

    }

    private static class driver extends Driver {
    }
}
