public class RegulerStrategy implements UKTStrategy {

    @Override
    public double hitungUKT(int sks) {
        return sks * 150000;
    }
}