package Turunan_3;

class Komponen {

    public int getL_PP(int panjang, int lebar) {
        int luas1 = panjang * lebar;
        System.out.println("Hasil = " + luas1);
        return luas1;
    }

    public int getL_SG(int tinggi, int alas) {
        int luas2 = alas * tinggi / 2;
        return luas2;
    }

    public int getL_KB(int panjang, int lebar, int tinggi) {
        int luas3 = panjang * lebar * tinggi;
        return luas3;
    }
}

class Hitung_AX extends Komponen {
    public static void main(String[] args) {
        Hitung_AX obj = new Hitung_AX();
        System.out.print("PENGHITUNGAN PERSEGI DENGAN MODEL INHERITANCE = "
                          + obj.getL_PP(9, 9));
    }
}
