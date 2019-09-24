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
public class karyawan {
    protected int id, kehadiran, uangmakan;
    protected String nama;
    
    karyawan(int id, String nama, int uangmakan) {
        this.id = id;
        this.nama = nama;
        this.uangmakan = uangmakan;
    }
           
    public int hitungGaji() {
        return 0;
    }
    
    public int hitungBonus() {
        return 0;
    }
    
    public void show() {
        System.out.println("Id\t\t: "+id);
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Kehadiran:\t: "+kehadiran+" kali/bulan");
        System.out.println("Uang Makan\t: Rp"+uangmakan+"/hari");
    }
    
}
