
package Operatormatematika;

/**
 *
 * @author Lenovo
 */
public class Aritmetika {
    int a;
    int b;
    String nama;
    
    void jumlah(){
        System.out.println("Bilangan 1: "+a);
        System.out.println("Bilangan 2: "+b);
        System.out.println("Hasil jumlah: "+(a+b));
        System.out.println("");
    }
    void kurang(){
        System.out.println("Bilangan 1: "+a);
        System.out.println("Bilangan 2: "+b);
        System.out.println("Selisih: "+(a-b));
       
        
    }
    
    public static void main(String args[]){
        Aritmetika obyek1=new Aritmetika ();
        Aritmetika obyek2=new Aritmetika ();
        perkalian objkali1=new perkalian ();
        
        obyek1.nama="obyek 1: ";
        obyek1.a=50;
        obyek1.b=40;
        System.out.println(obyek1.nama);
        obyek1.jumlah();
        
        obyek2.nama="obyek 2: ";
        obyek2.a=300;
        obyek2.b=900;
        System.out.println(obyek2.nama);
        
        System.out.println(obyek1.nama);
        obyek1.a=300;
        obyek2.b=6000;
        obyek1.kurang();
        
        System.out.println(obyek2.nama);
        obyek2.a=3000;
        obyek2.b=700;
        obyek2.kurang();
        
        System.out.println("");
        System.out.println("obyek kali");
        objkali1.x=666;
        objkali1.y=2;
        objkali1.kali(objkali1.x, objkali1.y);
                
        
                
    }
}