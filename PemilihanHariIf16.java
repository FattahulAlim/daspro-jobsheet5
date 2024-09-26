import java.util.Scanner;

public class PemilihanHariIf16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte dataType;

        System.out.print("input number: ");
        dataType = sc.nextByte();

        if (dataType <= 5) {
            System.out.println("Weekday");
        }
        else if (dataType <=7) {
            System.out.println("Weekend");
        }
        else {
            System.out.println("Invalid number");
        } 

    }
}
