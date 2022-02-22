import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String databarang[][] = { { "id", "Nama barang", "Harga" }, { "M1", "Meja", "800.000" },
                { "K1", "Kursi", "430.000" }, { "L1", "Lemari", "120.000" } };

        for (int a = 0; a <= 3; a++) {
            for (int b = 0; b <= 2; b++) {
                System.out.print(databarang[a][b] + " ");
                if (b == 2) {
                    System.out.println();
                }
            }
        }
        input.close();
    }
}
