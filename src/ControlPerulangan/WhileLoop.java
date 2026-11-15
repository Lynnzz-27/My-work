package ControlPerulangan;
public class WhileLoop {
    int nilai_awal;
    int nilai_akhir;
    
    void UlangWhile(){
        int i=nilai_akhir;
        int jum=0;
        while (i>=nilai_awal){
            System.out.print(i+",");
            //i--;
            jum=jum+i;
            i--;
        }       
        System.out.println("Jumlahnya: "+jum);
    }
}
