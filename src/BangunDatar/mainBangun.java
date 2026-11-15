package BangunDatar;
public class mainBangun {
    public static void main(String args[]){
        ClassLingkaran ling1=new ClassLingkaran();
        
        System.out.println("MENGHITUNG LUAS LINGKARAN");
        System.out.println("Menggunakan Prosedur");
        ling1.jariJari=1000;
        ling1.LuasProsedur();
        ling1.LuasProsedur(ling1.jariJari);
        
        System.out.println("Menggunakan fungsi 1");
        System.out.println("Jari-jari Lingkaran: "+ling1.jariJari);
        System.out.println("Luas Lingkaran Adalah: "+ling1.LuasFungsi());
        
        System.out.println("Menggunakan Fungsi 2");
        System.out.println("Jari-jari lingkaran: "+ling1.jariJari);
        System.out.println("Luas Lingkaran: "+ling1.LuasFungsi(ling1.jariJari));
    }
}
