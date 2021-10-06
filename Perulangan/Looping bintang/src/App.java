import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka tinggi baris: ");
        int tinggi;
        tinggi = input.nextInt();
        for (int a = 1; a <= tinggi; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("Masukkan angka tinggi baris: ");
        tinggi = input.nextInt();
        for (int a = tinggi; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("Masukkan angka: ");
        tinggi = input.nextInt();
        input.close();
        for (int a = 1; a <= tinggi; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + "\t");
            }
            System.out.println();
        }
    }
}
