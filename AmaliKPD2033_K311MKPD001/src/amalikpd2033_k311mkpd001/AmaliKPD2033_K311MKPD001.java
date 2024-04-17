package amalikpd2033_k311mkpd001;
import java.util.Scanner;

public class AmaliKPD2033_K311MKPD001 {
    public static void main(String[] args) {
    
        String nama;
        int hari_kerja;
        int gaji = 160;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Pekerja : ");
        nama = input.next();
        
        System.out.print("Masukkan bilangan hari bekerja : ");
        hari_kerja = input.nextInt();
        
        do {  
            if (hari_kerja > 31) {
                System.out.println("Bilangan hari tidak boleh melebihi 31 hari.");
                System.out.print("Masukkan SEMULA bilangan hari bekerja : ");
                hari_kerja = input.nextInt();
            }
        } while (hari_kerja > 31);
            
        gaji = hari_kerja * gaji;
           
        System.out.println("Rumusan gaji bulanan bagi : " + nama);
        System.out.println("Jumlah hari bekerja :  " + hari_kerja);
        System.out.println("GAJI SEBULAN ADALAH " + gaji);
    }   
}
