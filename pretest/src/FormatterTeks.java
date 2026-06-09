public class FormatterTeks implements FormatterLaporanDenda {

    @Override
    public String format(double jumlahDenda) {
        return "Total Denda: Rp " + jumlahDenda;
    }
}