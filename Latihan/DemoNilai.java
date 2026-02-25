/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author ASUS
 */

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
