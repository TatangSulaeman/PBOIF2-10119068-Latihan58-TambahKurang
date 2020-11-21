/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.tambahkurang.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan program Tambah Kurang
 * 
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih(){
        System.out.println("Hasil Selisih " + getX() + " - " + getY() +" = " + (getX() + getY()));
    }
}
