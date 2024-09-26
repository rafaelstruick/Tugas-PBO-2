public class Handphone {
    protected String merk;
    protected String model;
    String nomorTujuan;
    String Pesan;
    String nomorTujuan1;
    String nomorTujuan2;
    String[] daftarnomor;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    void nyalakan() {
        System.out.println("Handphone Dinyalakan. . .");
    }

    void matikan() {
        System.out.println("Handphone Dimatikan. . .");
    }

    void kirimpesan(String nomorTujuan, String Pesan) {
        this.nomorTujuan = nomorTujuan;
        this.Pesan = Pesan;
        System.out.println("Mengirim" + " " + Pesan + " " + "ke nomor : " + nomorTujuan);
    }

    void kirimpesan(String nomorTujuan1, String nomorTujuan2, String Pesan) {
        this.nomorTujuan1 = nomorTujuan2;
        this.nomorTujuan2 = nomorTujuan2;
        this.Pesan = Pesan;
        System.out.println("Mengirim" + " " + Pesan + " " + "ke nomor : " + nomorTujuan1 + " " + "dan " + nomorTujuan2);
    }

    void kirimpesan(String[] daftarnomor, String Pesan) {
        this.daftarnomor = daftarnomor;
        this.Pesan = Pesan;
        System.out.println("Mengirim" + " " + Pesan + "ke " + daftarnomor);
    }
}