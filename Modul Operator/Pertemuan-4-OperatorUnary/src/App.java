public class App {
    public static void main(String[] args) throws Exception {
        int a;
        int b;
        a = 60;
        b = 13;
        System.out.println("nilai a=" + a);
        System.out.println("nilai b=" + b);

        ++a;
        b++;
        System.out.println("nilai a kedua=" + a);
        System.out.println("nilai b kedua=" + b);

        int hasilA;
        int hasilB;
        hasilA = a++;
        hasilB = b++;
        System.out.println("nilai hasilA=" + hasilA);
        System.out.println("nilai hasilB=" + hasilB);

        ++a;
        --b;
        --b;
        hasilA = a;
        hasilB = --b;
        System.out.println("nilai a ketiga=" + a);
        System.out.println("nilai b ketiga=" + b);
        System.out.println("nilai hasilA kedua=" + hasilA);
        System.out.println("nilai hasilB kedua=" + hasilB);

    }
}
