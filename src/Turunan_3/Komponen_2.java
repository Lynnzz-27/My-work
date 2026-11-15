package Turunan_3;

class Komponen {
    public int getL_PP(int panjang, int lebar) {
        return panjang * lebar;
    }

    public int getL_SG(int tinggi, int alas) {
        return alas * tinggi / 2;
    }
}

class HitungPP extends Komponen {
    public void cetakPP() {
        System.out.println("Luas Persegi Panjang = " + getL_PP(10, 4));
    }
}

class HitungSG extends Komponen {
    public void cetakSG() {
        System.out.println("Luas Segitiga = " + getL_SG(7, 6));
    }
}

class HitungAX extends Komponen {
    public static void main(String[] args) {
        HitungPP a = new HitungPP();
        HitungSG b = new HitungSG();

        a.cetakPP();
        b.cetakSG();
    }
}