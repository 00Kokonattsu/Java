public class Identitas {
    private String nama;
    private String kelamin;
    private int nomorPegawai;
    private String pekerjaan;
    private int gaji;

    public String nama(String nama) {
        this.nama = nama;
        System.out.println("Nama = " + this.nama);
        return nama;
    }

    public String kelamin(String kelamin) {
        this.kelamin = kelamin;
        System.out.println("Jenis kelamin = " + this.kelamin);
        return kelamin;
    }

    public int nomorPegawai(int nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
        System.out.println("Nomor pegawai " + this.nomorPegawai);
        return nomorPegawai;
    }

    public String pekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
        System.out.println("Bekerja di bagian " + this.pekerjaan);
        return pekerjaan;
    }

    public int gaji(int gaji) {
        this.gaji = gaji;
        System.out.println("Gaji utama yang didapat " + this.gaji);
        return gaji;
    }

    public int gaji(int gaji, int bonus) {
        this.gaji = gaji + bonus;
        System.out.println("Gaji yang didapatkan jika bekerja secara baik menjadi " + this.gaji);
        return gaji;
    }

    public void Diah() {
        System.out.println("Berikut identitas pegawai: ");
        nama("Diah");
        kelamin("perempuan");
        nomorPegawai(333333);
        pekerjaan("Akuntansi");
        gaji(800000);
    }
}
