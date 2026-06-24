public class MBKMStrategy implements UKTStrategy {

    @Override
    public double hitungUKT(int sks) {
        return sks * 100000;
    }
}