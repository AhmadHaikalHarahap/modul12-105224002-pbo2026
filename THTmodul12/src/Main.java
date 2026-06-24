public class Main {

    public static void main(String[] args) {

        UKTCalculator calculator =
                new UKTCalculator(new MBKMStrategy());

        System.out.println(
                "UKT = " + calculator.hitung(20)
        );

        Database db = new NoSQLDatabase();

        KRSRepository repo =
                new KRSRepository(db);

        repo.simpan(new KRS());
    }
}