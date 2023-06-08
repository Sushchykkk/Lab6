public class Truck extends task4 {
    public Truck(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void brake() {
        System.out.println("Вантажівка їде");
    }
}
