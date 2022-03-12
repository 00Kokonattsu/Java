public class App {
    public String namaSiswa;
    private int usia;
    protected String alamat;

    public void cetakBiodata() {
        // Menampilkan identitas siswa
        System.out.println("Nama: " + namaSiswa);
        System.out.println("Alamat: " + alamat);
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }
}
