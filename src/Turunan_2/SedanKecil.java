package Turunan_2;

class Kendaraan {
    public void JenisKendaraan() {
        System.out.println("Jenis Kendaraan: Mobil");
    }      
}
class Sedan extends Kendaraan {
    public void Merek() {
        System.out.println("Merek: Sedan Family");
    }
    public void Kecepatan() {
        System.out.println("Kecepatan Max: 120 KM/Jam");
    }
}

class Sport extends Kendaraan {
    public void merek_sport() {
        System.out.println("Merk: Sedan Sport");
    }
    public void kecepatan_sport() {
        System.out.println("Kecepatan Max: 200 KM/Jam");
    }
}

public class SedanKecil extends Sedan {
    public static void main(String args[]) {
     SedanKecil sedanMurah = new SedanKecil();
     sedanMurah.JenisKendaraan();
     sedanMurah.Merek();
     sedanMurah.Kecepatan();
    }
}


