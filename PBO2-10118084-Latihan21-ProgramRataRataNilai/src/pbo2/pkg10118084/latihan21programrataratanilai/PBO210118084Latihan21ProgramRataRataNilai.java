/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan21programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author Freza
 * Nama  : Divi Adiffia Freza Alana
 * Kelas : PBO2
 * Nim   : 10118084
 * Deskripsi Program : Program ini berisi program untuk menghitung rata rata nilai
 */
public class PBO210118084Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner (System.in);
        int Banyakmahasiswa;
        int ratarata=0;
        int totalnilai=0;
       
        
        System.out.print("Masukkan Banyaknya Mahasiswa :");  
        Banyakmahasiswa=Scanner.nextInt();
        int nilai[] = new int[Banyakmahasiswa];
        
        for (int i = 1; i <= Banyakmahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-"+ i +" :");
            nilai[i-1] = Scanner.nextInt();
            totalnilai=totalnilai+nilai[i-1];
        }
        ratarata=totalnilai/Banyakmahasiswa;
        System.out.print(" Maka Rata-rata Nilainya adalah" + ratarata);
    }
    
}
