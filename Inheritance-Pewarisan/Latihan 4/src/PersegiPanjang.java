public class PersegiPanjang extends BangunDatar {
    float panjang, lebar;

    public void luas() {
        float luas = panjang * lebar;
        System.out.println("Luas persegi panjang = " + luas);
    }

    public void keliling() {
        float keliling = (panjang + lebar) * 2;
        System.out.println("Keliling persegi panjang = " + keliling);
    }
}
