import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan gaji bulanan: ");
        int gajiBulanan = input.nextInt();
        System.out.print("Masukkan jumlah jam lembur: ");
        int jamLembur = input.nextInt();
        System.out.print("Masukkan upah lembur per jam: ");
        int upahLemburPerjam = input.nextInt();
        
        double upahLembur = 0;
        if (jamLembur > 0) {
            upahLembur = jamLembur * upahLemburPerjam;
        }

        int totalGaji = (int)(gajiBulanan + upahLembur);
        System.out.println("Total gaji bulanan plus lembur adalah: " + totalGaji);
    }
}
