public class MySQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connected to MySQL");
    }

    @Override
    public void save(KRS krs) {
        System.out.println("KRS disimpan ke MySQL");
    }
}