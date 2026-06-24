public class UKTCalculator {

    private UKTStrategy strategy;

    public UKTCalculator(UKTStrategy strategy) {
        this.strategy = strategy;
    }

    public double hitung(int sks) {
        return strategy.hitungUKT(sks);
    }
}