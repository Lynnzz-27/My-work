package Polimorfisme; // Menentukan lokasi folder/package dari file ini dalam struktur project        

// Mendefinisikan class Bangun_lingkaran yang merupakan turunan (subclass) dari class Bangun
public class Bangun_lingkaran extends Bangun {

    @Override // Anotasi yang menandakan bahwa kita menulis ulang (override) method dari parent class (Bangun)
    public void deskripsi() { // Deklarasi method deskripsi dengan akses publik
        // Mencetak teks ke konsol untuk memberi informasi bahwa program sedang mengelola objek Lingkaran
        System.out.println("\n--- Mengelola Bangun Lingkaran ---");
    } 

    // Method untuk menghitung keliling lingkaran dengan dua parameter input bertipe double
    public double hitungKeliling(double phi, double r) { 
        // Mengembalikan hasil perhitungan keliling menggunakan rumus: 2 * phi * jari-jari
        return 2 * phi * r; 
    }
}