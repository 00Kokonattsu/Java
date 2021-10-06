import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int jumlah = 1;
        int nilai;
        System.out.println("Masukkan angka");
        int batas = input.nextInt();
        for (nilai = 1; nilai <= batas; nilai++) {
            if (nilai < batas) {
                System.out.print(nilai + ", ");
            } else if (nilai == batas) {
                System.out.println(nilai);
            }
            jumlah = jumlah * nilai;
        }
        System.out.println("Jumlahnya " + jumlah);

        System.out.println("Masukkan angka batas: ");
        int nilaiPrima;
        int batasPrima = input.nextInt();
        input.close();
        for (nilaiPrima = 2; nilaiPrima <= batasPrima; nilaiPrima++) {
            if (nilaiPrima % 2 != 0 && nilaiPrima % 3 != 0 && nilaiPrima % 5 != 0) {
                System.out.println(nilaiPrima);
            }
        }
        input.close();
    }
}
