package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.openDoor();
        electricCar.charge();

        System.out.println("================================");

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.openDoor();
        gasCar.fillUp();

        System.out.println("================================");

        HybrogenCar hybrogenCar = new HybrogenCar();
        hybrogenCar.move();
        hybrogenCar.openDoor();
        hybrogenCar.fillHydrogen();
    }
}
