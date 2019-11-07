/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan51;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");
        String nik = sc.nextLine();
        m.setNik(nik);
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        m.setNama(nama);
        System.out.print("Masukkan Golongan (1/2/3) : ");
        int golongan = sc.nextInt();
        m.setGolongan(golongan);
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        String jabatan = sc.next();
        m.setJabatan(jabatan);
        System.out.print("Masukkan Jumlah Kehadiran : ");
        int hadir = sc.nextInt();
        m.setKehadiran(hadir);
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t\t: "+m.getNik());
        System.out.println("NAMA\t\t: "+m.getNama());
        System.out.println("GOLONGAN\t\t: "+m.getGolongan());
        System.out.println("JABATAN\t\t: "+m.getJabatan());
        System.out.println("\nTUNJANGAN GOLONGAN\t\t: "+m.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN\t\t: "+m.tunjanganJabatan(m.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t\t: "+m.tunjanganKehadiran(m.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t\t: "+m.gajiTotal());
    }

}
