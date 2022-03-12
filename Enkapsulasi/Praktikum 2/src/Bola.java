import java.lang.Math;

public class Bola {
    private double jarijari;

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double newJarijari) {
        jarijari += newJarijari;
    }

    public void showDiameter() {
        double diameter = jarijari * 2;
        System.out.println("Diameter dari bola adalah " + diameter + " cm");
    }

    public void showLuasPermukaan() {
        double luasPermukaan = 4 * Math.PI * jarijari * jarijari;
        System.out.println("Luas permukaan dari bola berjari jari " + jarijari + " adalah " + luasPermukaan + " cm2");
    }

    public void showVolume() {
        double volume = 4 / 3 * Math.PI * jarijari * jarijari * jarijari;
        System.out.println("Volume dari bola berjari jari " + jarijari + " adalah " + volume + " cm3");
    }
}
