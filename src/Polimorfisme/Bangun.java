package Polimorfisme; // Mendeklarasikan package bernama Polimorfisme

import java.util.Scanner; // Mengimport class Scanner dari library Java untuk menerima input user

public class Bangun { // Mendefinisikan class utama bernama Bangun

    // Method Overloading: Menghitung luas persegi (1 parameter)
    public double hitung(double s) { // Method hitung dengan parameter sisi (s) untuk luas persegi
        return s * s; // Mengembalikan hasil perkalian s x s (rumus luas persegi)
    }

    // Method Overloading: Menghitung luas lingkaran (2 parameter)
    public double hitung(double phi, double r) { // Method hitung dengan parameter phi dan jari-jari (r)
        return phi * r * r; // Mengembalikan hasil phi x r x r (rumus luas lingkaran)
    }

    public void deskripsi() { // Method untuk menampilkan deskripsi bentuk secara umum
        System.out.println("Ini adalah deskripsi umum bentuk bangun datar."); // Mencetak teks ke layar
    }

    public static void main(String[] args) { // Method utama (entry point) untuk menjalankan program
        Scanner input = new Scanner(System.in); // Membuat objek 'input' dari class Scanner untuk membaca input keyboard
        
        Bangun bangunUmum = new Bangun(); // Membuat objek 'bangunUmum' dari class Bangun
        
        // Asumsi: Class Bangun_persegi dan Bangun_lingkaran adalah subclass dari Bangun
        Bangun_persegi persegi = new Bangun_persegi(); // Instansiasi objek 'persegi' dari class Bangun_persegi
        Bangun_lingkaran lingkaran = new Bangun_lingkaran(); // Instansiasi objek 'lingkaran' dari class Bangun_lingkaran

        System.out.println("=== PROGRAM BANGUN DATAR ==="); // Mencetak judul program
        System.out.println("1. Persegi"); // Mencetak pilihan menu 1
        System.out.println("2. Lingkaran"); // Mencetak pilihan menu 2
        System.out.print("Pilih menu (1/2): "); // Meminta user memilih menu
        int pilihan = input.nextInt(); // Menyimpan input angka pilihan user ke variabel 'pilihan'

        if (pilihan == 1) { // Logika jika user memilih angka 1 (Persegi)
            persegi.deskripsi(); // Memanggil method deskripsi dari objek persegi (Overriding)
            System.out.print("Masukkan panjang sisi: "); // Meminta input sisi dari user
            double s = input.nextDouble(); // Menyimpan input sisi ke variabel 's' bertipe double
            System.out.println("Luas Persegi: " + persegi.hitung(s)); // Memanggil method hitung(s) dan mencetak hasilnya
            System.out.println("Keliling Persegi: " + persegi.hitungKeliling(s)); // Memanggil method hitungKeliling dari class persegi
            
        } else if (pilihan == 2) { // Logika jika user memilih angka 2 (Lingkaran)
            lingkaran.deskripsi(); // Memanggil method deskripsi dari objek lingkaran (Overriding)
            System.out.print("Masukkan jari-jari: "); // Meminta input jari-jari dari user
            double r = input.nextDouble(); // Menyimpan input jari-jari ke variabel 'r'
            double phi = 3.14; // Mendeklarasikan nilai konstanta phi
            System.out.println("Luas Lingkaran: " + lingkaran.hitung(phi, r)); // Memanggil method hitung(phi, r) dan mencetak hasilnya
            System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling(phi, r)); // Memanggil method hitungKeliling dari class lingkaran
            
        } else { // Logika jika user memasukkan angka selain 1 atau 2
            System.out.println("Pilihan tidak tersedia."); // Mencetak pesan error
        }

        input.close(); // Menutup objek scanner untuk menghemat penggunaan memori
    }
}