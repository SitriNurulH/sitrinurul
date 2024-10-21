import java.util.ArrayList;

public class Cashier {
    private ArrayList<Item> items;

    public Cashier() {
        items = new ArrayList<>();
    }

    public void addItem(double harga, String kode, String nama, int kuantitas) {
        items.add(new Item(kode, nama, harga, kuantitas));
        System.out.println("Barang ditambahkan.");
    }

    public void removeItem(String kode) {
        boolean found = false;
        System.out.println("Jumlah item sebelum dihapus: " + items.size());

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getCode().equals(kode.trim())) {
                items.remove(i);
                System.out.println("Barang dengan kode " + kode + " berhasil dihapus.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
        }

        System.out.println("Jumlah item setelah dihapus: " + items.size());
    }

    public void displayItems() {
        System.out.println("Daftar Barang: ");
        double totalSemua = 0;
        for (Item item : items) {
            double subTotal = item.getSubTotal();
            totalSemua += subTotal;
            System.out.println(item.getCode() + " | " + item.getName() + " | Rp" + item.getPrice() + " | " + item.getKuantity() + " pcs | Subtotal: Rp" + subTotal);
        }
        System.out.println("Total Harga Semua Barang: Rp" + totalSemua);
    }

    public double getTotal() {
        double totalSemua = 0;
        for (Item item : items) {
            totalSemua += item.getSubTotal();
        }
        return totalSemua;
    }

    public void processPayment(double pembayaran) {
        double totalSemua = getTotal();
        if (pembayaran >= totalSemua) {
            double kembalian = pembayaran - totalSemua;
            System.out.println("Dibayar: Rp" + pembayaran);
            System.out.println("Kembalian: Rp" + kembalian);
        } else {
            System.out.println("Uang anda tidak cukup!");
        }
    }
}
