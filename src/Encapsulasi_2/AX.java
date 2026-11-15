package Encapsulasi_2;

public class AX {
    private int lebar;
    private int panjang;
    private int luas;
    
    public void setLebarPanjang (int lebar, int panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public int getHitungLuas() {
      luas = panjang * lebar;
      return luas;
    }
}
    

