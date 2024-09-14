public class index {
    public static void main(String[] args) {
        item item1 = new item("Kulkas", 100.0);
        order order1 = new order("order1", item1.getHarga(), item1.getNamaBarang());
        order1.displayItem();
        System.out.println();
        order1.takeOrder();
        System.out.println();
        rushOrder rushOrder = new rushOrder("rush1", 150.0, "TV", 20.0);
        System.out.println("Rush Order:");
        rushOrder.displayOrderDetails();
    }
}

class order {
    private String orderID;
    private double harga;
    private String namaBarang;
    public order(String orderID, double harga, String namaBarang) {
        this.orderID = orderID;
        this.namaBarang = namaBarang;
        this.harga = harga;
    }
    public void displayItem() {
        System.out.println("Item(s) bought: ");
        System.out.println("Item name: " + namaBarang);
        System.out.println("Amount: $" + harga);
    } 
    account acc1 = new account("123", "andi", "ciwaruga");
    public void takeOrder () {
        System.out.println("Order ID: " + orderID);
        System.out.println("Order taken by:");
        System.out.println("ID: " + acc1.getID());
        System.out.println("Name: " + acc1.getNama());  
        System.out.println("Address: " + acc1.getAlamat());
    }
}

class account {
    private String ID;
    private String nama;
    private String alamat;

    public account(String ID, String nama, String alamat) {
        this.ID = ID;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getID() {
        return ID;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
}

class item {
    private String namaBarang;
    private double harga;
    public item (String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public double getHarga() {
        return harga;
    }
}

class rushOrder extends order {
    private double rushFee;
    private double total;
    public rushOrder(String orderID, double harga, String namaBarang, double rushFee) {
        super(orderID, harga, namaBarang);
        this.rushFee = rushFee;
        this.total = rushFee + harga;
    }
    public void displayOrderDetails() {
        super.displayItem();
        System.out.println("Rush Fee: $" + rushFee);
        System.out.println("Total Amount: $" + total);
    }
}