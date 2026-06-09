class LayananPeminjaman {

    private PenghitungDenda penghitungDenda;

    public LayananPeminjaman(PenghitungDenda penghitungDenda) {
        this.penghitungDenda = penghitungDenda;
    }

    public void pinjamBuku(Anggota anggota, Buku buku) {
        // Logika peminjaman buku
    }

    public double hitungDendaKeterlambatan(int hariTerlambat) {
        return penghitungDenda.hitungDenda(hariTerlambat);
    }
}