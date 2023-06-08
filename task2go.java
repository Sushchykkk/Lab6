public class task2go {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("555-1234", "Samsung");
        Phone phone3 = new Phone("555-5678", "iPhone", 0.2);

        System.out.println("Телефон 1: номер - " + phone1.getNumber() + ", модель - " + phone1.model + ", вага - " + phone1.weight);
        System.out.println("Телефон 2: номер - " + phone2.getNumber() + ", модель - " + phone2.model + ", вага - " + phone2.weight);
        System.out.println("Телефон 3: номер - " + phone3.getNumber() + ", модель - " + phone3.model + ", вага - " + phone3.weight);

        phone1.receiveCall("Юлія Бойкова");
        phone2.receiveCall("Сущик Олександр");
        phone3.receiveCall("Залізний Роман", "555-9012");

        phone2.sendMessage("555-4321", "555-6789");
    }
}
