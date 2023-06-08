public class task4go {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Honda Civic", "юілий", 200);
        Truck truck = new Truck("ВАЗ", "чорний", 150);

        sedan.gas();
        truck.gas();

        sedan.brake();
        truck.brake();
    }
}
