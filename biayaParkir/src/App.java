import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jam masuk (0-23): ");
        int jamMAsuk = input.nextInt();
        System.out.print("Jam keluar (0-23): ");
        int jamKeluar = input.nextInt();
        System.out.print("Biaya per jam: ");
        int biayaPerJam = input.nextInt();

        int lamaParkir = (jamKeluar - jamMAsuk);

        int biayaParkir = (lamaParkir*biayaPerJam);

        System.out.print("Maka Biaya Parkir= " + biayaParkir);
    } 


}