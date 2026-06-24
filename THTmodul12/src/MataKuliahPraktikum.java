public class MataKuliahPraktikum
        implements MataKuliah, Praktikum {

    @Override
    public String getNama() {
        return "Praktikum PBO";
    }

    @Override
    public void alokasiAsistenLab() {
        System.out.println("Asisten dialokasikan");
    }

    @Override
    public void cekPeralatan() {
        System.out.println("Peralatan dicek");
    }
}