import java.util.Scanner;

class Mobil {
    String merek;
    String nama;
    String harga;

    class Part {
        String mesin;
        String bahan;
    }

    String kekuatan;
    String kemampuan;
}

class Mahasiswa {
    String nama;
    int NIM;
    String jurusan;
    double IPK;
    int umur;
}

class Luas {
    double Panjang;
    double Lebar;

    public static double Hasil(double Panjang, double Lebar) {
        double Hasil = 0;
        double Operasi = Panjang * Lebar;
        Hasil += Operasi;
        return Hasil;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ucup";
        mahasiswa1.NIM = 12345678;
        mahasiswa1.jurusan = "Teknik perteknikan";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 17;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "A";
        mahasiswa2.NIM = 23456789;
        mahasiswa2.jurusan = "Teknik Arsitek Blackhole";
        mahasiswa2.IPK = 5.3;
        mahasiswa2.umur = 25;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

        // Mobil homemade = new Mobil();
        // Mobil.Part homemadePart = new Mobil.Part();
        // homemade.merek = "Homemade";
        // homemade.nama = "Multicontainer";
        // homemade.harga = "Not to be sold";
        // homemadePart.mesin = "Ship machine";

        Luas PersegiPanjang = new Luas();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang = ");
        PersegiPanjang.Panjang = input.nextDouble();
        System.out.print("Masukkan lebar persegi panjang = ");
        PersegiPanjang.Lebar = input.nextDouble();
        System.out.println("\nHasilnya adalah " + Luas.Hasil(PersegiPanjang.Panjang, PersegiPanjang.Lebar));
        input.close();
    }
}
