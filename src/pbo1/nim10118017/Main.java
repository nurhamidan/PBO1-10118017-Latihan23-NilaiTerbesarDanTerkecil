package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menampilkan data nilai serta menentukan nilai terbesar dan terkecilnya.
 * 
 */
public class Main {
    //Konstanta
    public static final String FOOTER = "\n(Developed by : Agung Nurhamidan)";
    
    //Deklarasi variabel
    private static String namaPetugas;
    private static int banyakNilai;
    private static int[] dataNilaiMahasiswa;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inputDataNilai();
        tampilkanHasil();
        
        System.out.println(FOOTER);
    }
    
    //Method untuk memasukkan data nilai.
    public static void inputDataNilai() {
        Scanner scanner = new Scanner(System.in);
        
        //Memasukkan nilai
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakNilai = scanner.nextInt();
        dataNilaiMahasiswa = new int[banyakNilai];
        
        //Proses memasukkan nilai mahasiswa
        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " = ");
            dataNilaiMahasiswa[i] = scanner.nextInt();
        }
    }
    
    //Method untuk menampilkan hasil.
    public static void tampilkanHasil() {
        //Menampilkan semua nilai.
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        int terbesar = dataNilaiMahasiswa[0];
        int terkecil = dataNilaiMahasiswa[0];
        for (int i = 0; i < dataNilaiMahasiswa.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " = " + dataNilaiMahasiswa[i]);
        }
        
        //Mencari nilai terbesar dan terkecil.
        for (int i = 0; i < (dataNilaiMahasiswa.length - 1); i++) {
            if (terbesar < dataNilaiMahasiswa[i + 1]) {
                terbesar = dataNilaiMahasiswa[i + 1];
            }
            if (terkecil > dataNilaiMahasiswa[i + 1]) {
                terkecil = dataNilaiMahasiswa[i + 1];
            }
        }
        
        //Menampilkan nilai terbesar dan terkecil.
        System.out.println("\nNilai terbesar adalah " + terbesar);
        System.out.println("Nilai terkecil adalah " + terkecil + "\n");
        System.out.println("Petugas : " + namaPetugas);
    }
    
}
