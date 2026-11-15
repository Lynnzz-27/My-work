package BangunDatar;
import java.util.Scanner;
public class MainLingkaran2 {
    public static void main(String[] args){
        Scanner masuk=new Scanner(System.in);
        Scanner jari_2=new Scanner(System.in);
        Scanner d=new Scanner(System.in);
        ClassLingkaran Ling=new ClassLingkaran();
    int inp;
    double jari;
    double diameter;
    String garis = "-------------------------------";
       System.out.println(garis);
       System.out.println(" MAIN MENU LINGKARAN");
       System.out.println(garis);
       System.out.println(" 1. HITUNG LUAS LINGKARAN ");
       System.out.println(" 2. HITUNG KELILING LINGKARAN ");
       System.out.println(" 3. PILIH < 1 - 3 > :");
       inp=masuk.nextInt();
       masuk.nextLine();
       switch (1){ //menggunakan switch(1) karena program akan selalu masuk ke case 1.
                   //tidak menggunakan inp karena jika menggunakan inp program akan memilih case berdasarkan nilai inp sehingga pilihan 2&3 tidak akan terbaca
       case 1 :{
                if (inp==1){
                    System.out.println("Pilih D atau r: ");
                    String diketahui=masuk.nextLine();
                     if (diketahui.equalsIgnoreCase("D")){
                         System.out.println("Masukkan Diameter: ");
                         diameter=d.nextDouble();
                         Ling.LuasLingkaranDiameter(diameter);
                    }
                     else if (diketahui.equalsIgnoreCase("r")) {
                           System.out.println("Masukkan jari-jari: ");
                           jari=jari_2.nextDouble();
                           Ling.LuasProsedur(jari);
                     }
                     else {
                         System.out.println("Pilih diantara kedua pilihan tersebut");
                     }
                }
                else if (inp==2) {
                    System.out.println("Pilih D atau r: "); 
                    String diketahui=masuk.nextLine();
                    if (diketahui.equalsIgnoreCase("D")){
                        System.out.println("Masukkan Diameter: ");
                        diameter=d.nextDouble();
                        Ling.KelilingLingkaranDiameter(diameter);
                    }
                    else if (diketahui.equalsIgnoreCase("r")){
                        System.out.println("Masukkan jari-jari: ");
                        jari=jari_2.nextDouble();
                        Ling.KelilinglingkaranJariJari(jari);
                    }
                    else {
                        System.out.println("Pilih diantara dua pilihan tersebut");
                    }
                }
                else if (inp==3) {
                    System.out.println("Keluar");
                } 
                else{
                    System.out.println("PILIHANMU SALAH!!");
                }
            }
       break;
        }
    }
}
