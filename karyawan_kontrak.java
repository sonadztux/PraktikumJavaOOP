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
public class karyawan_kontrak extends karyawan {
    private String status;
    private int masa_kontrak;
    
    karyawan_kontrak(int id, String nama, int uangmakan, String status, int masa_kontrak) {
        super(id, nama, uangmakan);
        this.status = status;
        this.masa_kontrak = masa_kontrak;
    }
    
    @Override
    public int hitungGaji() {
        int gaji = 0;
        switch (status) {
            case "Biasa":
                gaji = 1000000;
                break;
            case "Spesial":
                gaji = 2000000;
                break;
            case "Luarbiasa":
                gaji = 3000000;
                break;
        }
        return (gaji + (uangmakan*kehadiran));
    }
    
    public int hitungBonus(int kehadiran) {
        this.kehadiran = kehadiran;
        int bonus = 0;
        if(kehadiran == 26) {
            bonus = bonus + 1000000;
        }else if(kehadiran >= 22 && kehadiran < 26) {
            bonus = bonus +500000;
        }else if(kehadiran >= 18 && kehadiran < 22){
            bonus = bonus +100000;
        }
        return bonus;
    }
    
    @Override
    public void show() {
        System.out.println("======== Data Karyawan Kontrak ========");
        super.show();
        System.out.println("Status\t\t: "+status);
        System.out.println("Masa Kontrak\t: "+masa_kontrak+" tahun");
        System.out.println("Bonus\t\t: Rp"+hitungBonus(kehadiran)+"/bulan");
        System.out.println("Gaji\t\t: Rp"+hitungGaji()+"/bulan");
    }
}
