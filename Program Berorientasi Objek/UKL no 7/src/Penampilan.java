import java.util.Scanner;

public class Penampilan {
    public static void main(String[] args) throws Exception {
        System.out.print(">>[Selamat Datang di Panel Listrik]<<\nMasukkkan golongan listrik = ");
        Scanner input = new Scanner(System.in);
        int golongan = input.nextInt();
        System.out.print("Masukkan jumlah KWH yang digunakan = ");
        int kwh = input.nextInt();
        Kelistrikan listrik = new Kelistrikan();
        System.out.print("Jumlah listrik yang digunakan adalah " + listrik.tarif(golongan, kwh)
                + "\n\nApakah anda mau memasukkan ID akun anda? (ya/tidak) ");
        String akun = input.next();
        if (akun.equalsIgnoreCase("ya") || akun.equalsIgnoreCase("iya") || akun.equalsIgnoreCase("yes")) {
            System.out.print("Masukkan id akun anda = ");
            int id = input.nextInt();
            if (id == 1 || id == 2 || id == 3 || id == 4) {
                listrik.identitas(id);
            } else {
                System.out.println("ID yang anda masukkan salah");
            }
        } else if (akun.equalsIgnoreCase("tidak") || akun.equalsIgnoreCase("no") || akun.equalsIgnoreCase("nggak")) {
            System.out.println("Terima kasih");
        } else {
            System.out.println("Pilihan yang anda masukkan salah");

        }
        input.close();
    }
}
