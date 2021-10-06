import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Deretan angka prima 1-100");
        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();
        int nilai;
        input.close();
        for (nilai = 2; nilai <= angka; nilai++) {
            if (nilai % 2 == 1 || nilai == 2) {
                if (nilai % 3 == 1 || nilai % 3 == 2 || nilai == 3) {
                    if (nilai % 5 == 1 || nilai % 5 == 2 || nilai % 5 == 3 || nilai % 5 == 4 || nilai == 5) {
                        if (nilai % 7 == 1 || nilai % 7 == 2 || nilai % 7 == 3 || nilai % 7 == 4 || nilai % 7 == 5
                                || nilai % 7 == 6 || nilai == 7) {
                            System.out.print(nilai + ", ");
                        }
                    }
                }
            }
        }
    }
}
