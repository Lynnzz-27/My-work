package Math;

  import java.util.Scanner;

public class MainMath {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecondClass hitung = new SecondClass();
        char lanjut = 0;
        
        do {
        System.out.println("=== SILAHKAN PILIH DARI 1-6 ===");
        System.out.println("1. Hitung Absolut");
        System.out.println("2. Hitung Pembulatan (Round)");
        System.out.println("3. Hitung Ceil & Floor");
        System.out.println("4. Hitung Min & Max");
        System.out.println("5. Hitung Pangkat & Akar");
        System.out.println("6. Hitung Trigonometri");
        System.out.print("Pilih menu (1-6): ");
        int menu = input.nextInt();

        switch (menu){
            case 1:
                System.out.print("Input int 1: "); int i1 = input.nextInt();
                System.out.print("Input int 2: "); int i2 = input.nextInt();
                System.out.print("Input double 1: "); double d1 = input.nextDouble();
                System.out.print("Input double 2: "); double d2 = input.nextDouble();
                hitung.hitungAbsolut(i1, i2, d1, d2);
                break;
            case 2:
                System.out.print("Input double 1: "); double r1 = input.nextDouble();
                System.out.print("Input double 2: "); double r2 = input.nextDouble();
                hitung.hitungRound(r1, r2);
                break;
            case 3:
                System.out.print("Input double 1: "); double c1 = input.nextDouble();
                System.out.print("Input double 2: "); double c2 = input.nextDouble();
                hitung.hitungCeilFloor(c1, c2);
                break;
            case 4:
                System.out.print("Input int 1: "); int m1 = input.nextInt();
                System.out.print("Input int 2: "); int m2 = input.nextInt();
                System.out.print("Input double 1: "); double md1 = input.nextDouble();
                System.out.print("Input double 2: "); double md2 = input.nextDouble();
                hitung.hitungMinMax(m1, m2, md1, md2);
                break;
            case 5:
                System.out.print("Input angka Log/Exp: "); double val = input.nextDouble();
                System.out.print("Input angka dasar (Base): "); double base = input.nextDouble();
                System.out.print("Input angka pangkat: "); double pow = input.nextDouble();
                System.out.print("Input angka akar (Sqrt): "); double sqrt = input.nextDouble();
                hitung.hitungEksponensial(val, base, pow, sqrt);
                break;
            case 6:
                System.out.print("Input derajat sudut: "); double deg = input.nextDouble();
                System.out.print("Input koordinat X (atan2): "); double x = input.nextDouble();
                System.out.print("Input koordinat Y (atan2): "); double y = input.nextDouble();
                hitung.hitungTrigonometri(deg, x, y);
                break;
            default:
                System.out.println("Menu tidak tersedia.");
            }
                
            System.out.print("\nApakah anda ingin melanjutkan? (Y/X): ");
            lanjut = input.next().charAt(0);

        } while (Character.toUpperCase(lanjut) == 'Y');

        System.out.println("Program Selesai.");
    }
}
