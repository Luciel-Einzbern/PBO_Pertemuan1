
package Latihan;

// @author Dimas Indrawijaya

public class DemoNilai {
    public static void main(String[] args) {
        Nilai mahasiswa = new Nilai();
    
        mahasiswa.nim = "2510631170032";
        mahasiswa.nama = "Dimas Indrawijaya";
        mahasiswa.absen = 100;
        mahasiswa.tugas = 85;
        mahasiswa.uts = 83;
        mahasiswa.uas = 80;
        
        mahasiswa.cetakNilai();
    }
}
