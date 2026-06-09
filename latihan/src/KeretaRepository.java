import java.util.List;

public interface KeretaRepository {

    Kereta cariByKode(String kode)
            throws RuteTidakDitemukanException;

    List<Kereta> getSemuaKereta();
}