import java.util.Scanner;

public class UjiBus {
    Scanner input = new Scanner(System.in);
    Bus Lyn = new Bus(10);

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Bus Lyn = new Bus(10);
        System.out.println("Masukkan password");
        Lyn.getPassword(input.next());
        Lyn.cetak();

        if (Lyn.passwordLock.equalsIgnoreCase("true")) {
            Lyn.tambahPenumpang(3);
            Lyn.setCounter(input.nextInt());
            Lyn.setCounter(input.nextInt());
            Lyn.setCounter(input.nextInt());
            Lyn.cetak();
            Lyn.getAverage();

            Lyn.tambahPenumpang(1);
            Lyn.setCounter(input.nextInt());
            Lyn.cetak();
            Lyn.getAverage();

            Lyn.tambahPenumpang(1);
            Lyn.setCounter(input.nextInt());
            Lyn.cetak();
            Lyn.getAverage();
        } else if (Lyn.passwordLock.equalsIgnoreCase("false")) {
            System.out.println("Password salah");
        }
        input.close();
    }
}
