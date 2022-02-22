import java.util.Scanner;

class Kelipatan3 {
    public int hitung(int absen) {
        int hitung = 0;
        for (int a = 0; a <= absen; a++) {
            if (a % 3 == 0 && a != 0) {
                System.out.print(a + " ");
            }
        }
        return hitung;
    }
}

public class Call {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Kelipatan3 kel = new Kelipatan3();
        System.out.print("Masukkan nomer absen = ");
        int absen = input.nextInt();
        kel.hitung(absen);
        input.close();
    }
}
