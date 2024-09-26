import java.util.Scanner;

/**
 * Pemilihanpercobaan16
 */
public class PemilihanBilangan16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

      String jenis = angka % 2 == 0 ? "Termasuk bilangan genap" : "Termasuk bilangan ganjil";
      System.out.println(angka + " " + jenis);
    }
}