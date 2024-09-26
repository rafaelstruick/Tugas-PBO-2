public class Smartphone extends Handphone {
    String emailTujuan;
    String subjek;

    public Smartphone(String merk, String model) {
        super(merk, model);

    }

    @Override
    void nyalakan() {
        System.out.println("Smartphone" + " " + merk + " " + model + " " + "sedang booting..");
    }

    @Override
    void matikan() {
        System.out.println("Smartphone" + " " + merk + " " + model + " " + "sedang shutdown..");
    }

    @Override
    void kirimpesan(String nomorTujuan, String Pesan) {
        this.nomorTujuan = nomorTujuan;
        this.Pesan = Pesan;
    }

    void kirimpesan(String emailTujuan, String subjek, String Pesan) {
        this.emailTujuan = emailTujuan;
        this.subjek = subjek;
        System.out.println("Mengirim email dengan subjek " + " " + subjek + " ke email " + " " + emailTujuan + " "
                + "dengan pesan " + Pesan);
    }

    void aksesInternet() {
        System.out.println("Mengakses Internet.. .");
    }
}