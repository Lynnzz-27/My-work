package Encapsulasi_2;

public class Hasil {
    public static void main(String args[]) {
        AX obj = new AX();
        obj.setLebarPanjang(8, 9);
        System.out.println("PERSEGI DENGAN PRIVATE="+
        obj.getHitungLuas());
    }
}
