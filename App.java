import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Cashier cashier = new Cashier();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Tampilkan Total");
            System.out.println("4. Pembayaran");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan Kode Barang: ");
                    String addCode = scanner.next();
                    System.out.print("Masukkan Nama Barang: ");
                    String addName = scanner.next();
                    System.out.print("Masukkan Harga Barang: ");
                    double addPrice = scanner.nextDouble();
                    System.out.print("Masukkan Jumlah Barang: ");
                    int kuantitas = scanner.nextInt();
                    cashier.addItem(addPrice, addCode, addName, kuantitas);
                    break;
                case 2:
                    System.out.print("Masukkan kode barang yang akan dihapus: ");
                    String removeCode = scanner.next();
                    cashier.removeItem(removeCode);
                    break;
                case 3:
                    cashier.displayItems();  
                    break;
                case 4:
                    System.out.println("Masukkan Total Uang yang dibayar: ");
                    double pembayaran = scanner.nextDouble();
                    cashier.displayItems(); 
                    cashier.processPayment(pembayaran);  
                    return;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem kasir ku :)!");
                    return;
                default:
                    System.out.println("Maaf Anda salah Menginput.");
                    System.out.println("Tolong input Ulang, Tapi Jangan pakai Perasaan.");
            }
        }
    }
}
