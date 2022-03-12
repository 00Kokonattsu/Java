public class Persegi extends BangunDatar {
    float sisi;

    public void luas() {
        float luas = sisi * sisi;
        System.out.println("Luas persegi = " + luas);
    }

    public void keliling() {
        float keliling = sisi * 4;
        System.out.println("Keliling persegi = " + keliling);
    }
}
