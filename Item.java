public class Item {
    private double hargaItem;
    private String namaItem;
    private String kodeItem;
    private int kuantitas;

    public Item(String kode, String nama, double harga, int kuantitas) {
        this.kodeItem = kode;
        this.namaItem = nama;
        this.hargaItem = harga;
        this.kuantitas = kuantitas;
    }

    public double getPrice() {
        return hargaItem;
    }

    public String getCode() {
        return kodeItem;
    }

    public String getName() {
        return namaItem;
    }

    public int getKuantity() {
        return kuantitas;
    }

    public double getSubTotal() {
        return hargaItem * kuantitas;
    }
}
