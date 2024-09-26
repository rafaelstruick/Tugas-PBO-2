public class FeaturePhone extends Handphone {

    public FeaturePhone(String merk, String model) {
        super(merk, model);
    }

    @Override
    void nyalakan() {
        System.out.println("Feature Phone " + merk + " " + model + " dinyalakan.");
    }

    @Override
    void matikan() {
        System.out.println("Feature Phone " + merk + " " + model + " dimatikan.");
    }

    void mainGameSnake() {
        System.out.println("Memainkan game Snake.");
    }
}