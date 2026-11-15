package PaketLingkaran;

    public class Elips extends Lingkaran {
    private double jariJariMinor; // Tambahan parameter untuk elips

    // Konstruktor Child Class
    public Elips(double a, double b) {
        super(a); 
        this.jariJariMinor = b;
    }

    // Method Override: Mengganti rumus luas khusus elips
    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJariMinor;
    }

    // Method Override: Rumus keliling pendekatan Ramanujan
    @Override
    public double hitungKeliling() {
        double a = jariJari;
        double b = jariJariMinor;
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public void info() {
        System.out.println("Ini adalah bentuk Elips.");
    }
}