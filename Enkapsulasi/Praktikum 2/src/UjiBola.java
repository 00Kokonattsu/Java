import java.util.Scanner;

public class UjiBola {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari jari dari bola");
        double jarijari = input.nextInt();
        Bola bola = new Bola();

        bola.setJarijari(jarijari);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();

        input.close();
    }
}
