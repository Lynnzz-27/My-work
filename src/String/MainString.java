package String;

import java.util.Scanner;

public class MainString {
    
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecondClass teks = new SecondClass();
        char lanjut;
        
        do{
        System.out.println("===== SILAHKAN PILIH DARI 1-13 =====");
        System.out.println("1.  Cek Panjang String (Length)");
        System.out.println("2.  Gabung String (Concat)");
        System.out.println("3.  Bandingkan String (CompareTo)");
        System.out.println("4.  Cek String Kosong (IsEmpty)");
        System.out.println("5.  Hapus Spasi (Trim)");
        System.out.println("6.  Ubah ke Huruf Kecil (LowerCase)");
        System.out.println("7.  Ubah ke Huruf Besar (UpperCase)");
        System.out.println("8.  Konversi Angka ke String (ValueOf)");
        System.out.println("9.  Ganti Karakter/Kata (Replace)");
        System.out.println("10. Cari Kata (Contains)");
        System.out.println("11. Cek Kesamaan (Equals)");
        System.out.println("12. Cek Akhiran (EndsWith)");
        System.out.println("13. Konversi ke Array/Byte");
        
        System.out.print("\nPilih menu (1-13): ");
        int menu = input.nextInt();
        input.nextLine();

        switch (menu) {
            case 1:
                System.out.print("String 1: "); String l1 = input.nextLine();
                System.out.print("String 2: "); String l2 = input.nextLine();
                teks.cekPanjang(l1, l2);
                break;
            case 2:
                System.out.print("String Awal: "); String c1 = input.nextLine();
                System.out.print("String Tambahan: "); String c2 = input.nextLine();
                teks.gabungString(c1, c2);
                break;
            case 3:
                System.out.print("String 1: "); String comp1 = input.nextLine();
                System.out.print("String 2: "); String comp2 = input.nextLine();
                teks.bandingkanString(comp1, comp2);
                break;
            case 4:
                System.out.print("Masukkan String (bisa kosong): "); String e1 = input.nextLine();
                teks.cekKosong(e1);
                break;
            case 5:
                System.out.print("Masukkan kalimat dengan spasi di awal/akhir: "); 
                String t1 = input.nextLine();
                teks.hapusSpasi(t1);
                break;
            case 6:
                System.out.print("Masukkan kalimat (HURUF BESAR): "); 
                String low1 = input.nextLine();
                teks.ubahHurufKecil(low1);
                break;
            case 7:
                System.out.print("Masukkan kalimat (huruf kecil): "); 
                String up1 = input.nextLine();
                teks.ubahHurufBesar(up1);
                break;
            case 8:
                System.out.print("Masukkan angka (integer): "); 
                int v1 = input.nextInt();
                System.out.print("Masukkan angka kedua (untuk digabung teks): ");
                int v2 = input.nextInt();
                teks.konversiNilai(v1, v2);
                break;
            case 9:
                System.out.print("String kalimat: "); String rep1 = input.nextLine();
                System.out.println("a. Ganti huruf\nb. Ganti kata");
                String subMenu = input.nextLine();
                if(subMenu.equalsIgnoreCase("a")) {
                    System.out.print("Huruf lama: "); char oldC = input.next().charAt(0);
                    System.out.print("Huruf baru: "); char newC = input.next().charAt(0);
                    teks.gantiKarakter(rep1, oldC, newC);
                } else {
                    System.out.print("Kata lama: "); String oldS = input.nextLine();
                    System.out.print("Kata baru: "); String newS = input.nextLine();
                    teks.gantiKata(rep1, oldS, newS);
                }
                break;
            case 10:
                System.out.print("Kalimat utama: "); String cont1 = input.nextLine();
                System.out.print("Cari kata: "); String cont2 = input.nextLine();
                teks.cariKata(cont1, cont2);
                break;
            case 11:
                System.out.print("String 1: "); String eq1 = input.nextLine();
                System.out.print("String 2: "); String eq2 = input.nextLine();
                teks.cekSama(eq1, eq2);
                break;
            case 12:
                System.out.print("Kalimat: "); String end1 = input.nextLine();
                System.out.print("Akhiran yg dicek: "); String end2 = input.nextLine();
                teks.cekAkhiran(end1, end2);
                break;
            case 13:
                System.out.print("Masukkan String: "); String conv = input.nextLine();
                teks.ubahKeBytes(conv);
                teks.ubahKeArrayChar(conv);
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
            System.out.print("\nApakah anda ingin melanjutkan? (Y/X): ");
            lanjut = input.next().charAt(0);
            input.nextLine();

        } while (Character.toUpperCase(lanjut) == 'Y');

        System.out.println("Program Selesai.");
    }
}