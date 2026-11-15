package PaketLingkaran;

import PaketLingkaran.interface_lingkaran.Shape;
    import java.util.Scanner;

public class Lingkaran implements Shape {
    protected double jariJari;

    public Lingkaran(double r) {
        this.jariJari = r;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public void info() {
        System.out.println("Ini adalah bentuk Lingkaran.");
    }

    public void info(String nama) {
        System.out.println("Ini adalah: " + nama);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROGRAM LINGKARAN & ELIPS ===");
        
        // Input untuk Lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = scanner.nextDouble();
        
        Lingkaran bulat = new Lingkaran(r);
        bulat.info("Hasil Dari Luas dan Keliling Lingkaran");
        System.out.printf("Luas: %.2f\n", bulat.hitungLuas());
        System.out.printf("Keliling: %.2f\n", bulat.hitungKeliling());

         System.out.println("\n---------------------------\n");

        // Input untuk Elips
        System.out.print("Masukkan semi-major axis elips (a): ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan semi-minor axis elips (b): ");
        double b = scanner.nextDouble();

        Elips oval = new Elips(a, b);
        oval.info(); // Memanggil method overload
        System.out.printf("Luas Elips: %.2f\n", oval.hitungLuas());
        System.out.printf("Keliling Elips (pendekatan): %.2f\n", oval.hitungKeliling());

        scanner.close();
    }
}