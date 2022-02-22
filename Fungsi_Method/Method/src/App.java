public class App {
    // Method Void, yang tidak mengembalikan nilai
    public static void hitungLPersegi(int sisi) {
        int hasil = sisi * sisi;
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah " + hasil);
    }

    // Method Tipe Data, yang mengembalikan nilai
    public static double hitungLLingkaran(int jari) {
        double luas = 3.14 * jari * jari;
        return luas;
    }

    public static void main(String[] args) throws Exception {
        hitungLPersegi(12);
        System.out.println("Luas lingkaran adalah " + hitungLLingkaran(100));
    }
}
