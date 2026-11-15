package Collection;
import java.util.Scanner;
public class index {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int pilih;
        do{
            System.out.println("\n=============================================");
            System.out.println("SISTEM PENJARA INDONESIA");
            System.out.println("1.Tahanan Baru");
            System.out.println("2.Tahanan Bebas");
            System.out.println("3.Tahanan Hukuman Mati");
            System.out.println("0.Keluar");
            System.out.println("===============================================");
            System.out.println("Masukkan Pilihan");
            pilih = input.nextInt();
            switch(pilih){
                case 1:
                    ArrayListData.main(null);
                    break;
                case 2:
                    StackData.main(null);
                    break;
                case 3:
                    QueueData.main(null);
                    break;
                case 0:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }
        }while (pilih!=0);
    }
}