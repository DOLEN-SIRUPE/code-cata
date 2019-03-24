import logic.CarRacing;

public class Main {
    public static void main(String[] args) {
        CarRacing carRacing = new CarRacing();
        carRacing.inputInitData();
        carRacing.makeCars();
        carRacing.doRacing();
    }
}
