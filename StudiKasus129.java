package PraktikumDaspro29;
import java.util.Scanner;

public class StudiKasus129 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon = 0, totalBayar;
        int kembalian = 0, kurang = 0;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10/100;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total harga : " + totalHarga);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total bayar : " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian : " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
        input.close();
    }
}
