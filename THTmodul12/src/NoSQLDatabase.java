public class NoSQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connected to NoSQL");
    }

    @Override
    public void save(KRS krs) {
        System.out.println("KRS disimpan ke NoSQL");
    }
}