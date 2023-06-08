public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається");
    }

    public void talk() {
        System.out.println(fullName + " говорить");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John Smith", 35);

        person1.move();
        person2.talk();
    }
}
