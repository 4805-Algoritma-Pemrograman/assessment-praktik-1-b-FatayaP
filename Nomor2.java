import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int jumlahTransaksi = 0;
        double totalPendapatan = 0;

        String ulang = "Y"; 

        do {
            System.out.print("Masukkan kode bungalow [1/2/3]: ");
            int kode = input.nextInt();

            System.out.print("Lama menginap (malam): ");
            int lamaMenginap = input.nextInt();

            double tarifPerMalam = 0;
            double persenPelayanan = 0;

            switch (kode) {
                case 1:
                    tarifPerMalam = 50000;
                    persenPelayanan = 0.30;
                    break;
                case 2:
                    tarifPerMalam = 40000;
                    persenPelayanan = 0.20;
                    break;
                case 3:
                    tarifPerMalam = 30000;
                    persenPelayanan = 0.10;
                    break;
                default:
                    System.out.println("Kode bungalow tidak valid!");
                    continue; 
            }

            double biayaMenginap = lamaMenginap * tarifPerMalam;
            double biayaPelayanan = biayaMenginap * persenPelayanan;
            double totalBiaya = biayaMenginap + biayaPelayanan;

            totalPendapatan += totalBiaya;
            jumlahTransaksi++;

            System.out.print("Input lagi (Y/N)? ");
            ulang = input.next();

        } while (ulang.equalsIgnoreCase("Y"));

        System.out.println("Jumlah transaksi penyewaan bungalow = " + jumlahTransaksi);
        System.out.println("Total pendapatan = " + totalPendapatan);
        
    }
}
