package no.hvl.dat108.task3;

public class Main {
    @FunctionalInterface
    public interface Funksjon {
        public double endretLonn(double aarslonn);
    }

    public static void main(String[] args) {
        Funksjon kronetillegg = x -> x + 10000;
        Funksjon prosenttillegg = returFunksjon();
        Funksjon kronetillegghvislav = x -> {
            if (x < 510000) {
                x = x + 10000;
            }
            return x;
        };

        Ansatt a = new Ansatt("Hans", "Hansen", "Mann", "Sjef", 600000);
        Ansatt b = new Ansatt("John", "Johnsen", "Mann", "Ansatt", 500000);
        Ansatt c = new Ansatt("Per", "Persen", "Mann", "Ansatt", 500000);

        System.out.println(a.getAarslonn());
        System.out.println(b.getAarslonn());
        System.out.println(c.getAarslonn());

        a.endreLonn(kronetillegg);
        b.endreLonn(kronetillegghvislav);
        c.endreLonn(prosenttillegg);

        System.out.println(a.getAarslonn());
        System.out.println(b.getAarslonn());
        System.out.println(c.getAarslonn());
    }

    public static Funksjon returFunksjon() {
        return x -> x + (x * 0.2);
    }
}