import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nominal, uangkertas;

        System.out.print("Nominal: ");
        nominal = input.nextInt();
        
        uangkertas = nominal / 50000;
        if (uangkertas > 0) {
            System.out.print(uangkertas + "Lembar 50 ribuan");
            nominal = nominal % 50000;
        }

        uangkertas = nominal / 20000;
        if (uangkertas > 0) {
            System.out.print(uangkertas + "Lembar 20 ribuan");
            nominal = nominal % 20000;
        }

        uangkertas = nominal / 10000;
        if (uangkertas > 0) {
            System.out.print(uangkertas + "Lembar 10 ribuan");
            nominal = nominal % 10000;
        }

        uangkertas = nominal / 5000;
        if (uangkertas > 0) {
            System.out.print(uangkertas + "Lembar 5 ribuan");
            nominal = nominal % 5000;
        }

        uangkertas = nominal / 2000;
        if (uangkertas > 0) {
            System.out.print(uangkertas + "Lembar 2 ribuan");
            nominal = nominal % 2000;
        }

        uangkertas = nominal / 1000;
        if (uangkertas > 0) {
            System.out.print(uangkertas + "Lembar 1 ribuan");
            nominal = nominal % 1000;
        }

        uangkertas = nominal / 500;
        if (uangkertas > 0) {
            System.out.print(uangkertas + "Lembar 1 ribuan");
            nominal = nominal % 500;
        }
    }
}
