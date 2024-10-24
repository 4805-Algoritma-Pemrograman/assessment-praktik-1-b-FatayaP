

public class Nomor1{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        
        double totalPenjualan = input.nextDouble();
        double komisi;

        if (totalPenjualan <= 500000) {
            komisi = totalPenjualan * 0.10; 
        } else {
            komisi = 500000 * 0.10 + (totalPenjualan - 500000) * 0.15;
        }

        System.out.println(komisi);
        
    }  
    
}
