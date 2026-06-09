class LibraryManager {

    private PencarianBuku pencarianBuku;
    private LayananPeminjaman layananPeminjaman;
    private FormatterLaporanDenda formatter;

    public LibraryManager(
            PencarianBuku pencarianBuku,
            LayananPeminjaman layananPeminjaman,
            FormatterLaporanDenda formatter) {

        this.pencarianBuku = pencarianBuku;
        this.layananPeminjaman = layananPeminjaman;
        this.formatter = formatter;
    }

    public Buku cariBuku(String judul) {
        return pencarianBuku.cariBerdasarkanJudul(judul);
    }

    public String buatLaporanDenda(int hariTerlambat) {
        double denda = layananPeminjaman.hitungDendaKeterlambatan(hariTerlambat);
        return formatter.format(denda);
    }
}