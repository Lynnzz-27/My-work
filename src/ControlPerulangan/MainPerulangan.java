package ControlPerulangan;
import java.util.Scanner;
public class MainPerulangan {
   public static void main(String[] args){
       int x,y;
       PerulanganFor for1=new PerulanganFor();
       WhileLoop while1=new WhileLoop();
       Scanner inp=new Scanner(System.in);
       
       System.out.println("Masukkan nilai awal: ");
       x=inp.nextInt();
       System.out.println("Masukkan nilai akhir: ");
       y=inp.nextInt();
       
       for1.nilaiAwal=x;
       for1.nilaiAkhir=y;
       
       for1.Perulangan_1();
       System.out.println("");
       for1.Perulangan_2();
       System.out.println("");
       
       while1.nilai_awal=x;
       while1.nilai_akhir=y;
       while1.UlangWhile();
   } 
}
