import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        KeretaRepository repository =
                new KeretaRepositoryImpl();

        Validator validator =
                new NikValidator();

        ReservasiService service =
                new ReservasiService(
                        repository,
                        validator);

        boolean jalan = true;

        while (jalan) {

            try {

                System.out.println("\n===== JAVA EXPRESS =====");
                System.out.println("1. Lihat Jadwal");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");

                int pilihan = input.nextInt();
                input.nextLine(); // membersihkan buffer

                switch (pilihan) {

                    case 1:

                        System.out.println("\n=== DAFTAR KERETA ===");

                        for (Kereta k : repository.getSemuaKereta()) {

                            System.out.println(
                                    k.getKode() + " | " +
                                    k.getNama() + " | " +
                                    k.getRute() + " | " +
                                    "Sisa Kursi: " +
                                    k.getSisaKursi());
                        }
                        break;

                    case 2:

                        System.out.print("Kode Kereta : ");
                        String kodeKereta = input.nextLine();

                        System.out.print("NIK : ");
                        String nik = input.nextLine();

                        System.out.print("Nama Penumpang : ");
                        String nama = input.nextLine();

                        System.out.print("Jumlah Tiket : ");
                        int jumlahTiket = input.nextInt();
                        input.nextLine();

                        Penumpang penumpang =
                                new Penumpang(nik, nama);

                        service.pesanTiket(
                                kodeKereta,
                                penumpang,
                                jumlahTiket);

                        break;

                    case 3:

                        jalan = false;
                        System.out.println(
                                "Terima kasih telah menggunakan JAVA EXPRESS.");
                        break;

                    default:

                        System.out.println(
                                "Menu tidak tersedia!");
                }

            } catch (InputMismatchException e) {

                System.out.println(
                        "Input harus berupa angka!");

                input.nextLine(); // membersihkan buffer

            } catch (DataPenumpangTidakValidException e) {

                System.out.println(
                        "Error Data Penumpang: "
                                + e.getMessage());

            } catch (RuteTidakDitemukanException e) {

                System.out.println(
                        "Error Rute: "
                                + e.getMessage());

            } catch (TiketHabisException e) {

                System.out.println(
                        "Error Tiket: "
                                + e.getMessage());
            }
        }

        try {
            input.close();
        } finally {
            System.out.println(
                    "Sistem reservasi ditutup.");
        }
    }
}