/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan51;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan = 0, tunjanganJabatan = 0, tunjanganKehadiran = 0;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir){
        this.tunjanganKehadiran = hadir*10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan){
        switch(jabatan.toLowerCase()){
            case "manager":
                this.tunjanganJabatan = 2000000;
                break;
            case "kabag":
                this.tunjanganJabatan = 1000000;
                break;
            default:
                this.tunjanganJabatan = 0;
                break;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        switch(golongan){
            case 1:
                this.tunjanganGolongan = 500000;
                break;
            case 2:
                this.tunjanganGolongan = 1000000;
                break;
            case 3:
                this.tunjanganGolongan = 1500000;
                break;
            default:
                this.tunjanganGolongan = 0;
                break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return (float)(tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran);
    }
}
