
package Latihan;

// @author Dimas Indrawijaya

public class Nilai {
    String nim, nama;
    int absen,tugas,uts,uas;    
    
    double nilai(){
        double nilaiAkhir = (absen * 0.1) + (tugas * 0.2) + (uts * 0.3) + (uas * 0.4);
        return nilaiAkhir;
    }
    
    void cetakNilai(){
        System.out.println("NIM                 : " + nim);
        System.out.println("Nama                : " + nama);
        System.out.println("Nilai Absen [10%]   : " + absen);
        System.out.println("Nilai Tugas [20%]   : " + tugas);
        System.out.println("Nilai UTS [30]      : " + uts);
        System.out.println("Nilai UAS [40]      : " + uas);
        System.out.println("Nilai Akhir         : " + nilai());
    }
}
