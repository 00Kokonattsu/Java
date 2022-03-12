public class TestSiswa {
    public static void main(String[] args) {
        Encapsiswa siswa = new Encapsiswa();
        siswa.setNama("Paijo");
        siswa.setAddress("Malioboro");
        siswa.setAbsen(30);
        siswa.setAge(20);

        System.out.println(
                "Nama: " + siswa.getNama() + " alamat " + siswa.getAddress() + " berumur " + siswa.getAge() + " tahun");
    }
}