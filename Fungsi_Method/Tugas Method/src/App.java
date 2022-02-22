import java.lang.Math;
import java.util.Scanner;

public class App {
    public static void hitung(int a, int b) {
        System.out.println((a + b));
    }

    public static void print() {
        System.out.println("Nilai a dan b adalah ");
    }

    public static void maks(int a2, int b2, int c) {
        int maks;
        System.out.print("nilai tertinggi = ");
        maks = Math.max(a2, b2);
        if (c > maks) {
            maks = c;
        }
        System.out.println(maks);

    }

    public static int jumlah(int a, int b) {
        int tambah = a + b;
        System.out.println("Hasilnya adalah = " + tambah);
        return tambah;
    }

    public static int selisih(int a, int b) {
        int kurang = a - b;
        System.out.println("Hasilnya adalah = " + kurang);
        return kurang;
    }

    public static int lipatGanda(int a, int b) {
        int kali = a * b;
        System.out.println("Hasilnya adalah = " + kali);
        return kali;
    }

    public static int pembagian(int a, int b) {
        int bagi = a / b;
        System.out.println("Hasilnya adalah = " + bagi);
        return bagi;
    }

    public static void Ganjil(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void Genap(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void presensi(String nama, int absen) {
        System.out.println("Selamat pagi " + nama);
        int hasilBagi = 0;
        for (int j = 1; j <= absen; j++) {
            if (absen % j == 0) {
                hasilBagi++;
            }
        }
        if (absen % 2 == 1) {
            System.out.print(absen + " adalah bilangan ganjil ");
        } else if (absen % 2 == 0) {
            System.out.print(absen + " adalah bukan bilangan ganjil ");
        }
        boolean prima;
        if (hasilBagi == 2) {
            prima = true;
        } else {
            prima = false;
        }
        if (prima == true) {
            System.out.print("dan merupakan bilangan prima");
        } else if (prima == false) {
            System.out.print("dan bukan bilangan prima");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Pertemuan 1 - Method Void
                Pertemuan 2 - Method Void #2
                <(+)> Kalkulator sederhana - Method int
                <(1/2)> Ganjil/Genap - Method void
                <(Nama)> Nama & nomer absen""");
        System.out.print("Masukkan pilihanmu: ");
        String pilihanString = input.nextLine();
        if (pilihanString.equalsIgnoreCase("Method Void") || pilihanString.equalsIgnoreCase("1")
                || pilihanString.equalsIgnoreCase("Pertemuan 1") || pilihanString.equalsIgnoreCase("Method Void #1")) {
            // Pertemuan 1 - Method Void
            int a = 10;
            int b = 2;
            print();
            hitung(a, b);
        } else if (pilihanString.equalsIgnoreCase("2") || pilihanString.equalsIgnoreCase("Pertemuan 2")
                || pilihanString.equalsIgnoreCase("Method Void #2")) {
            // Pertemuan 2 - Method Void #2
            int a2, b2, c;

            System.out.print("Masukan nilai a : ");
            a2 = input.nextInt();

            System.out.print("Masukan nilai b : ");
            b2 = input.nextInt();

            System.out.print("Masukan nilai c: ");
            c = input.nextInt();
            maks(a2, b2, c);
        } else if (pilihanString.equalsIgnoreCase("<(+)>") || pilihanString.equalsIgnoreCase("Kalkulator")
                || pilihanString.equalsIgnoreCase("Kalkulator sederhana") || pilihanString.equalsIgnoreCase("+")
                || pilihanString.equalsIgnoreCase("3")) {
            System.out.print("Masukkan angka pertama = ");
            int a = input.nextInt();
            System.out.print("Masukkan operator matematika = ");
            String operator = input.next();
            System.out.print("Masukkan angka kedua = ");
            int b = input.nextInt();
            if (operator.equalsIgnoreCase("Penjumlahan") || operator.equalsIgnoreCase("Tambah")
                    || operator.equalsIgnoreCase("+")) {
                jumlah(a, b);
            } else if (operator.equalsIgnoreCase("Pengurangan") || operator.equalsIgnoreCase("Kurang")
                    || operator.equalsIgnoreCase("-")) {
                selisih(a, b);
            } else if (operator.equalsIgnoreCase("Perkalian") || operator.equalsIgnoreCase("Kali")
                    || operator.equalsIgnoreCase("x") || operator.equalsIgnoreCase("*")) {
                lipatGanda(a, b);
            } else if (operator.equalsIgnoreCase("Pembagian") || operator.equalsIgnoreCase("Bagi")
                    || operator.equalsIgnoreCase(":") || operator.equalsIgnoreCase("/")) {
                pembagian(a, b);
            }
        } else if (pilihanString.equalsIgnoreCase("<(1/2)>") || pilihanString.equalsIgnoreCase("Ganjil/Genap")
                || pilihanString.equalsIgnoreCase("ganjil") || pilihanString.equalsIgnoreCase("genap")
                || pilihanString.equalsIgnoreCase("1/2") || pilihanString.equalsIgnoreCase("4")) {
            System.out.println("Masukkan pilihanmu");
            System.out.println("Ganjil/Genap?");
            String masuk = input.next();
            System.out.print("Masukkan angka awal = ");
            int a = input.nextInt();
            System.out.print("Masukkan angka akhir = ");
            int b = input.nextInt();
            if (masuk.equalsIgnoreCase("Ganjil") || masuk.equalsIgnoreCase("1")) {
                Ganjil(a, b);
            } else if (masuk.equalsIgnoreCase("Genap") || masuk.equalsIgnoreCase("2")) {
                Genap(a, b);
            }
        } else if (pilihanString.equalsIgnoreCase("<(Nama)>") || pilihanString.equalsIgnoreCase("Nama")
                || pilihanString.equalsIgnoreCase("Nama & Nomer absen") || pilihanString.equalsIgnoreCase("absen")
                || pilihanString.equalsIgnoreCase("5") || pilihanString.equalsIgnoreCase("nomer")
                || pilihanString.equalsIgnoreCase("nomer absen") || pilihanString.equalsIgnoreCase("&")) {
            System.out.print("Nama : ");
            String nama = input.next();
            System.out.print("No. Absen : ");
            int absen = input.nextInt();
            presensi(nama, absen);
        }
        input.close();
    }
}
