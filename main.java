public class main {
    public class Main {
        public static void main(String[] args) throws Exception {

            Smartphone Vivo = new Smartphone("Vivo", "V20");
            FeaturePhone nok = new FeaturePhone("Nokia", "3300");

            Vivo.nyalakan();
            Vivo.aksesInternet();
            Vivo.kirimpesan("starlight.dei09@gmail.com", "Pengumpulan Tinggi Badan", "Hello");
            Vivo.kirimpesan("082285352789", "Selamat Pagi");
            Vivo.matikan();
            nok.nyalakan();
            nok.mainGameSnake();
            nok.kirimpesan("088955432291", "082285352789", "Selamat Pagi");
            nok.matikan();
        }
    }
}
