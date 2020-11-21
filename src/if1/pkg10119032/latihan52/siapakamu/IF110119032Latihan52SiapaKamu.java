/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan52.siapakamu;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program untuk mengklasifikasikan user
 * dengan pendekatan object oriented dan konsep pewarisan
 */

public class IF110119032Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dosen = new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setNip("41227829930");
        dosen.setMataKuliah("PBO");
        System.out.println("NIP : ".concat(dosen.getNip()));
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Ginanjar Tubagus Gumilar");
        mhs.setUmur(19);
        mhs.setNim("10119032");
        mhs.setKelas("IF-1");
        System.out.println("\nNIM : ".concat(mhs.getNim()));
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}