public class Progdas2 {
    public static void main(String[] args) {
        // operator/operasi digunakan untuk menghitung (+,-,*,/)
        int bagi = 16 / 2;
        int kali = 8 * 4;
        int tambah = 32 + 64;
        int kurang = 100 - 50;
        System.out.println("# 16/2= " + bagi);
        System.out.println("= 8*4= " + kali);
        System.out.println("= 32+64= " + tambah);
        System.out.println("= 100-50= " + kurang);

        int hasil;
        int angka1 = 5;
        int angka2 = 6;

        // Penjumlahan menggunakan +
        hasil = angka1 + angka2;
        System.out.println(angka1 + " + " + angka2 + " = " + hasil);
        // Pengurangan menggunakan -
        // Dengan menggunakan printf, kita bisa menulis rumus lalu menulis isinya secara
        // berurutan
        hasil = angka1 - angka2;
        System.out.printf("%d - %d = %d \n", angka1, angka2, hasil);
        // Perkalian menggunakan *
        hasil = angka1 * angka2;
        System.out.printf("%d * %d = %d \n", angka1, angka2, hasil);
        // Pembagian menggunakan /
        hasil = angka1 / angka2;
        System.out.printf("%d / %d = %d \n", angka1, angka2, hasil);
        // interger (int) tidak bisa memuat bilangan desimal. Karena itu, kita harus
        // menggunakan float atau double
        float angka3 = 5;
        float angka4 = 6;
        float hasilFloat;
        hasilFloat = angka3 / angka4;
        System.out.println(angka3 + " / " + angka4 + " = " + hasilFloat);
        // Modulus (hasil sisa pembagian) menggunakan dua tanda persentase (%%)
        int angka5 = 12;
        int angka6 = 5;
        hasil = angka5 % angka6;
        System.out.printf("%d %% %d = %d \n", angka5, angka6, hasil);
    }
}
