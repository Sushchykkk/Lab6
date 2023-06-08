import java.util.Scanner;

public class Baggage {
    private int numberOfItems;
    private double totalWeight;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість речей: ");
        numberOfItems = scanner.nextInt();

        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Введіть вагу речі " + i + " (в кілограмах): ");
            double weight = scanner.nextDouble();
            totalWeight += weight;
        }
    }

    public void printTotalWeight() {
        System.out.println("Загальна вага багажу: " + totalWeight + " кг");
    }


public static void main(String[] args) {
        Baggage baggage = new Baggage();
        baggage.input();
        baggage.printTotalWeight();
        }
}