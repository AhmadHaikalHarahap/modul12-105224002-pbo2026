public class KRSRepository {

    private Database database;

    public KRSRepository(Database database) {
        this.database = database;
    }

    public void simpan(KRS krs) {
        database.save(krs);
    }
}