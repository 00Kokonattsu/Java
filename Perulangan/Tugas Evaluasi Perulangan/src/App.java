import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Output angka kelipatan 3");
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        int bilangan = 0;
        do {
            bilangan += 3;
            System.out.println(bilangan);
        } while (bilangan < angka);
        input.close();
    }
}
