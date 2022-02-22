public class Tugas1 {
    public static void main(String[] args) {
        String nama = "Fauzan Farhan Al Qodri Irawan";
        String kelas = "XR8/19";
        String alamat = "Jl. Jamrud 4 no. 38";
        String hobby = "Nonton youtube";
        int umur = 14;

        System.out.println("Identitas siswa: ");
        System.out.println("Nama            : " + nama);
        System.out.println("Kelas           : " + kelas);
        System.out.println("Umur            : " + umur);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Hobby           : " + hobby);
        System.out.println(" ");

        String rumus;
        // segitiga
        rumus = "a * t / 2";
        int alas = 24;
        int tinggi = 19;
        int hasil;
        hasil = alas * tinggi / 2;

        System.out.println("Luas segitiga 19 = " + rumus);
        System.out.println("= " + alas + " * " + tinggi + " / 2 = " + hasil);

        // lingkaran
        rumus = "pi * r^2";
        int r = 24;
        double pi = 3.14;
        double hasilDouble = pi * r * r;

        System.out.println("Luas lingkaran 19 = " + rumus);
        System.out.println("= " + pi + " * " + r + " * " + r + " = " + hasilDouble);

    }

}
