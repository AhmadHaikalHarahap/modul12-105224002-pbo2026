public class Main {
    public static void main(String[] args) {
        FormatterLaporanDenda formatter = new FormatterTeks();
        System.out.println(formatter.format(25000));
    }
}

interface FormatterLaporanDenda {
    String format(double jumlahDenda);
}

class FormatterTeks implements FormatterLaporanDenda {
    public String format(double jumlahDenda) {
        return "Total Denda: Rp " + jumlahDenda;
    }
}