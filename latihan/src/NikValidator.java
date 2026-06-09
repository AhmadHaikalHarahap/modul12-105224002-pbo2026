public class NikValidator implements Validator {

    @Override
    public void validate(Penumpang penumpang) {

        if (!penumpang.getNik().matches("\\d{16}")) {
            throw new DataPenumpangTidakValidException(
                    "NIK harus terdiri dari 16 digit angka");
        }
    }
}