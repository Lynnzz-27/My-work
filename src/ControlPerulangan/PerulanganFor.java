package ControlPerulangan;

public class PerulanganFor {
    int nilaiAwal;
    int ganjil;
    int nilaiAkhir;
    
    void Perulangan_1(){
        int x=nilaiAwal;
        int i=x;
        for (x=nilaiAwal; x<=nilaiAkhir; x=x+1){
            if (i<x){
                System.out.print(","+x);
            }
            else {
                System.out.print(x);
        }
        }
    }
    
    void Perulangan_2(){
        int x=ganjil;
        int i=x;
        for (x=ganjil; x<=i; x=x%1){
            if (x>i){
                System.out.print(","+x);
            }
            else {
                System.out.print(x);
        }
        }
    }
}
