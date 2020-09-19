import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float price;
        int miles;

        do {
            System.out.println("Введите цену вашего билета");

            price = scanner.nextFloat();
        } while (price < 0);


        System.out.printf("Вы заплатили за билет: %.2f\n", price);

        miles = (int)Math.floor(price / 20);

        System.out.printf("Ваше количество заработанных милей: %d\n", miles);
    }
}
