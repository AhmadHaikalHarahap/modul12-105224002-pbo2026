class DendaStandar implements PenghitungDenda {

    @Override
    public double hitungDenda(int hariTerlambat) {
        return hariTerlambat * 5000;
    }
}