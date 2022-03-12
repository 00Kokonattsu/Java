public class Hitung {
    public static void main(String[] args) throws Exception {
        BangunDatar bangundatar = new BangunDatar();

        Persegi persegi = new Persegi();
        persegi.sisi = 8;

        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.lebar = 11;
        persegipanjang.panjang = 2;

        bangundatar.luas();
        bangundatar.keliling();

        persegi.luas();
        persegi.keliling();

        persegipanjang.luas();
        persegipanjang.keliling();
    }
}
