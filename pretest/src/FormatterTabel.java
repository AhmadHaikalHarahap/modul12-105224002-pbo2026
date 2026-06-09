class FormatterTabel implements FormatterLaporanDenda {

    @Override
    public String format(double jumlahDenda) {
        return "| Total Denda |\n" +
               "| Rp " + jumlahDenda + " |";
    }
}