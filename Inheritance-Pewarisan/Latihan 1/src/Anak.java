public class Anak extends Ayah {
    double nilaimax = 99.9;
    String nama = "Dina";
    int age = 17;

    public void cetak() {
        System.out.println("Anak ini memiliki sifat " + super.sifat);
        System.out.println("yang bernama " + nama);
        System.out.println("berumur " + age);
        System.out.println("dengan tinggi badan " + super.TB);
        super.hobby();
    }
}
