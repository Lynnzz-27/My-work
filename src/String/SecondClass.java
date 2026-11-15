package String;

import java.io.UnsupportedEncodingException;

public class SecondClass {
    
    public void cekPanjang(String s1, String s2) {
        System.out.println("Panjang string 1: " + s1.length());
        System.out.println("Panjang string 2: " + s2.length());
    }

    public void gabungString(String s1, String s2) {
        System.out.println("Hasil gabungan: " + s1.concat(" " + s2));
    }

    public void bandingkanString(String s1, String s2) {
        System.out.println("Hasil compareTo: " + s1.compareTo(s2));
    }

    public void cekKosong(String s1) {
        System.out.println("Apakah string kosong? " + s1.isEmpty());
    }

    public void hapusSpasi(String s1) {
        System.out.println("String asli (dengan spasi): '" + s1 + "'");
        System.out.println("Hasil trim(): '" + s1.trim() + "'");
    }

    public void ubahHurufKecil(String s1) {
        System.out.println("Original: " + s1);
        System.out.println("Menjadi huruf kecil: " + s1.toLowerCase());
    }

    public void ubahHurufBesar(String s1) {
        System.out.println("Original: " + s1);
        System.out.println("Menjadi huruf KAPITAL: " + s1.toUpperCase());
    }

    public void konversiNilai(int angka, int penambah) {
        String s1 = String.valueOf(angka);
        System.out.println("Hasil valueOf (digabung dengan " + penambah + "): " + (s1 + penambah));
        System.out.println("(Perhatikan: " + angka + " + " + penambah + " hasilnya digabung teks, bukan penjumlahan matematika)");
    }

   public void gantiKarakter(String s1, char oldChar, char newChar) {
        System.out.println("Ganti Karakter: " + s1.replace(oldChar, newChar));
    }
    
    public void gantiKata(String s1, String target, String replacement) {
        System.out.println("Ganti Kata: " + s1.replace(target, replacement));
    }

    public void cariKata(String s1, String keyword) {
        System.out.println("Apakah mengandung '" + keyword + "'? " + s1.contains(keyword));
    }

   public void cekSama(String s1, String s2) {
        System.out.println("Apakah sama (ignore case)? " + s1.equalsIgnoreCase(s2));
    }

    public void cekAkhiran(String s1, String suffix) {
        System.out.println("Apakah berakhiran dengan '" + suffix + "'? " + s1.endsWith(suffix));
    }
    
    public void ubahKeArrayChar(String s1) {
        char[] ch = s1.toCharArray();
        System.out.print("Char Array: ");
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void ubahKeBytes(String s1) {
        try {
            byte[] b = s1.getBytes("UTF-8");
            System.out.print("Bytes (UTF-8): ");
            for (byte val : b) {
                System.out.print(val + " ");
            }
            System.out.println();
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error encoding: " + e.getMessage());
        }
    }
}