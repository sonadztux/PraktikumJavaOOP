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
public class karyawan_tetap extends karyawan {
    private String golongan;
    
    karyawan_tetap(int id, String nama, int uangmakan, String golongan) {
        super(id, nama, uangmakan);
        this.golongan = golongan;
    }
    
    public int hitungGaji() {
        int gaji = 0;
        switch (golongan) {
            case "A":
                gaji = 3500000;
                break;
            case "B":
                gaji = 4500000;
                break;
            case "C":
                gaji = 5500000;
                break;
        }
        return (gaji + (uangmakan*kehadiran));
    }
    
    public int hitungBonus(int kehadiran) {
        this.kehadiran = kehadiran;
        int bonus = 0;
        if(kehadiran == 26) {
            bonus = 1500000;
        }else if(kehadiran >= 22 && kehadiran < 26) {
            bonus = 800000;
        }else if(kehadiran >= 18 && kehadiran < 22){
            bonus = 500000;
        }
        return bonus;
    }
    
    public void show(){
        System.out.println("======== Data Karyawan Tetap ========");
        super.show();
        System.out.println("Golongan\t: "+golongan);
        System.out.println("Gaji\t\t: Rp"+hitungGaji());
        System.out.println("Bonus\t\t: Rp"+hitungBonus(kehadiran));
    }
    
}
