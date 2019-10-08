/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programrataratanilai;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double rata_rata = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int jumlah = scanner.nextInt();
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            int nilai_mahasiswa = scanner.nextInt();
            rata_rata += nilai_mahasiswa;            
        }
        rata_rata /= (double) jumlah;
        System.out.println("\nMaka, rata-rata nilainya adalah "+rata_rata);
        System.out.println("Developed by : Dandi M Iqbal");
    }
    
}
