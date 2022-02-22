public class Kelistrikan {

    public int tarif(int golongan, int kwh) {
        int tarif = 0;
        if (golongan == 1) {
            tarif = kwh * 1000;
            if (tarif < 50000) {
                tarif = 50000;
            }
            tarif += 13000;
            return tarif;
        } else if (golongan == 2) {
            tarif = kwh * 1300;
            if (tarif < 50000) {
                tarif = 50000;
            }
            tarif += 13000;
            return tarif;
        } else if (golongan == 3) {
            tarif = kwh * 1500;
            if (tarif < 50000) {
                tarif = 50000;
            }
            tarif += 13000;
            return tarif;
        }
        return tarif;
    }

    public void identitas(int id) {
        String identitas[][] = { { "ID", "Nama", "Golongan", "Alamat" }, { "1", "Galuh", "1", "Sawojajar" },
                { "2", "Indro", "3", "Kedung Kandang" }, { "3", "Jedi", "2", "Ijen" }, { "4", "Kanu", "3", "Dinoyo" } };
        System.out.println(identitas[0][0] + " " + identitas[0][1] + " " + identitas[0][2] + " " + identitas[0][3]);
        System.out.println(identitas[id][0] + " " + identitas[id][1] + " " + identitas[id][2] + " " + identitas[id][3]);
    }
}
