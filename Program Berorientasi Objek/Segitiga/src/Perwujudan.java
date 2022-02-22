import java.util.Scanner;

public class Perwujudan {

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan alas segitiga ");
        int alas = input.nextInt();
        System.out.println("Masukkan tinggi segitiga ");
        int tinggi = input.nextInt();
        s.luasSegitiga(alas, tinggi);

        System.out.println();

        System.out.println("Masukkan sisi pertama segitiga");
        int sisi1 = input.nextInt();
        System.out.println("Masukkan sisi kedua segitiga ");
        int sisi2 = input.nextInt();
        System.out.println("Masukkan sisi ketiga segitiga ");
        int sisi3 = input.nextInt();
        s.KelilingSegitiga(sisi1, sisi2, sisi3);
        input.close();
    }

}
