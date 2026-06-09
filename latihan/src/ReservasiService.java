public class ReservasiService {

    private KeretaRepository repository;
    private Validator validator;

    public ReservasiService(
            KeretaRepository repository,
            Validator validator) {

        this.repository = repository;
        this.validator = validator;
    }

    public void pesanTiket(
            String kodeKereta,
            Penumpang penumpang,
            int jumlah)

            throws RuteTidakDitemukanException,
                   TiketHabisException {

        validator.validate(penumpang);

        Kereta kereta =
                repository.cariByKode(kodeKereta);

        if (jumlah > kereta.getSisaKursi()) {

            throw new TiketHabisException(
                    kereta.getNama(),
                    kereta.getSisaKursi());
        }

        kereta.kurangiKursi(jumlah);

        System.out.println("\nReservasi Berhasil");
        System.out.println("Nama : "
                + penumpang.getNama());
        System.out.println("Kereta : "
                + kereta.getNama());
    }
}