package BangunDatar;
import java.util.Scanner;
public class MainLingkaran {
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
       System.out.println(" 1. HITUNG LUAS LINGKARAN (D)");
       System.out.println(" 2. HITUNG LUAS LINGKARAN (R)");
       System.out.println(" 3. HITUNG KELILING LINGKARAN (D) ");
       System.out.println(" 4. HITUNG KELILING LINGKARAN (R) ");
       System.out.println(" 5. KELUAR LINGKARAN ");
       System.out.println(" 6. PILIH < 1 - 5 > :");
       inp=masuk.nextInt();
       
       switch (inp){
           case 1 :{
               System.out.println("Hitung Luas (D)");
               System.out.println("Masukkan diameter lingkaran: ");
               diameter = d.nextDouble();
               Ling.LuasLingkaranDiameter(diameter);
               
           }
               break;
            case 2 :{
                System.out.println("Hitung Luas (r)");
                System.out.println("Masukkan jari-jari lingkaran: ");
                jari = jari_2.nextDouble();
                Ling.LuasProsedur(jari);
            } 
               break;                    
            case 3 :{
               System.out.println("Hitung Keliling (D)");
               System.out.println("Masukkan diameter lingkaran: ");
               diameter = d.nextDouble();
               Ling.KelilingLingkaranDiameter(diameter);
            }
               break;
            case 4 :{
               System.out.println("Hitung Keliling (r)");
               System.out.println("Masukkan jari-jari lingkaran: ");
               jari = jari_2.nextDouble();
               Ling.KelilinglingkaranJariJari(jari);
            }
               break;
            case 5 :
               System.out.println("Keluar");
               break;
            default :
               System.out.println("PILIHANMU SALAH");
               break;
            
       }
    }
}