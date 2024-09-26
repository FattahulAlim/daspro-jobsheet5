import java.util.Scanner;

public class programSiakad16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kualifikasi, nilaihuruf;
        char kelas;
        byte absen;
        double nilaikuis, nilaitugas, nilaiuas, nilaiakhir, nilaiuts;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaikuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaitugas = sc.nextDouble();
        System.out.print("Masukkan nilai uts: ");
        nilaiuts = sc.nextDouble();
        System.out.print("Masukkan nilai uas: ");
        nilaiuas = sc.nextDouble();
        nilaiakhir = (nilaikuis * 0.2) + (nilaitugas * 0.15) + (nilaiuas * 0.35) + (nilaiuts * 0.3);
        System.out.print("Mahasiswa dengan nama: " + nama + " NIM: " + nim);
        System.out.println(" Kelas: " + kelas + " nomor absen: " + absen);
        System.out.println("Nilai akhir: " + nilaiakhir);

        if (nilaiakhir <= 100 && nilaiakhir > 80) {
            nilaihuruf = "A";
            kualifikasi = "Sangat Baik";
        }
        else if (nilaiakhir <= 80 && nilaiakhir > 73) {
            nilaihuruf = "B+";
            kualifikasi = "Lebih dari Baik";            
        }
        else if (nilaiakhir <= 73 && nilaiakhir > 65) {
            nilaihuruf = "B";
            kualifikasi = "Baik";
        }
        else if (nilaiakhir <= 65 && nilaiakhir > 60) {
            nilaihuruf = "C+";
            kualifikasi =  "Lebih dari Cukup";
        }
        else if (nilaiakhir <= 60 && nilaiakhir > 50) {
            nilaihuruf = "C";
            kualifikasi = "Cukup";
        }
        else if (nilaiakhir <= 50 && nilaiakhir > 39) {
            nilaihuruf = "D";
            kualifikasi = "kurang";
        }
        else {
            nilaihuruf = "E";
            kualifikasi = "Gagal";
            
        }
        System.out.println("Nilai akhir huruf: " + nilaihuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
