package Polimorfisme; // Menentukan lokasi package (folder) bernama Polimorfisme untuk mengelompokkan file kode ini.

public class Bangun_persegi extends Bangun { // Mendeklarasikan class Bangun_persegi yang merupakan turunan (subclass) dari class Bangun.

    @Override // Anotasi yang menandakan bahwa method deskripsi() di bawah ini menggantikan (override) method yang sama di parent class (Bangun).
    public void deskripsi() { // Mendeklarasikan method deskripsi dengan akses publik dan tidak mengembalikan nilai (void).
        System.out.println("\n--- Mengelola Bangun Persegi ---"); // Mencetak teks ke konsol sebagai identitas bahwa program sedang mengelola objek persegi.
    }

    public double hitungKeliling(double s) { // Mendeklarasikan method untuk menghitung keliling yang menerima parameter s (sisi) bertipe double.
        return 4 * s; // Mengembalikan hasil perhitungan rumus keliling persegi (4 kali sisi).
    }
}