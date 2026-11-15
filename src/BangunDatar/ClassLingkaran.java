package BangunDatar;
public class ClassLingkaran {
    float diameter;
    float jariJari;
    double phi=22.0/7.0; 
//menggunakan f karena jika hanya 22/7 maka akan terjadi pembagian integer dan akan memberikan hasil 3 bukan 3,14. f sebagai penanda pembbagian float
    
    void LuasProsedur(){
      System.out.println("jari-jari lingkaran: "+jariJari);
      System.out.println("Luas lingkaran: "+(phi*jariJari*jariJari));
    }
    void LuasProsedur(double r){
         System.out.println("jari-jari lingkaran: "+r);
         System.out.println("Luas lingkaran: "+(phi*r*r));
    }
    void LuasLingkaranDiameter(double d){
         System.out.println("diameter lingkaran: "+d);
         System.out.println("Luas lingkaran: "+((1.0/4.0)*phi*d*d));
    }
    void KelilingLingkaranDiameter(double d){
        System.out.println("Diameter lingkaran: "+d);
        System.out.println("Keliling lingkaran: "+(phi*d));
    }
    void KelilinglingkaranJariJari(double r){
        System.out.println("Jari-jari lingkaran: "+r);
        System.out.println("Keliling lingkaran: "+(2*phi*r));
    }
    double LuasFungsi() {
        double luas;
        luas=phi*jariJari*jariJari;
        return luas;
    }
    double LuasFungsi(double r){
        
        return (phi*r*r);
        
    }
}
