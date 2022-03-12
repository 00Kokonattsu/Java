import java.util.Scanner;

public class Panggil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        App pe = new App();
        System.out.println("Masukkan nama");
        pe.namaSiswa = input.next();
        System.out.println("Masukkan alamat");
        pe.alamat = input.next();
        System.out.println("Masukkan usia");
        pe.setUsia(input.nextInt());
        pe.cetakBiodata();
        System.out.println("Usia: " + pe.getUsia());
        input.close();
    }
}
