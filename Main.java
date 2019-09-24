/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopmodul3;

/**
 *
 * @author L5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        karyawan_kontrak kk = new karyawan_kontrak(1202174325, "Andhikurniawan", 15000, "Luarbiasa", 4);
        karyawan_tetap kt = new karyawan_tetap(1202184077, "Nanda Arfan Hakim", 20000, "B");
        
        kk.hitungBonus(20);
        kt.hitungBonus(26);
        
        kk.show();
        System.out.println("");
        kt.show();
    }
    
}
