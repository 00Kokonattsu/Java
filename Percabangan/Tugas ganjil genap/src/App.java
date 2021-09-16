import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int angka;
        System.out.println("Ganjil/genap");
        System.out.print("Masukkan angka = ");
        angka = input.nextInt();

        if (angka % 2 == 1) {
            System.out.println(angka + " adalah angka ganjil");
        } else {
            System.out.println(angka + " adalah angka genap");
        }
        input.close();
    }
}
