import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in); //Добавляем сканер длядальнейшего использования в методах.
    static String items = "";
    static double sum = 0;

    static int quantity=0;

    public static void main(String[] args) {

        int numberOfPeople = People.howMuchPeople();
        whatInBill();
        double personalCost = sum/numberOfPeople;
        String rub = CorrectRub.getFormatRub();
        printResult (personalCost, rub);
    }

    public static void whatInBill() {
        StringBuilder builder = new StringBuilder();
        System.out.println("Ну, и что ели?");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Завершить")) {
                System.out.println("Фух! Я надеюсь вы не лопните...");
                break;
            }
            builder.append(items+input).append("\n");
            System.out.println("А сколько стоило?");
            double price;
            while (true) {
                if (scanner.hasNextDouble()) {
                    price = scanner.nextDouble();
                    if (price < 0) {
                        System.out.println("Серьезно, покормили и денег дали? Давай еще раз...");
                    } else {
                        sum = price + sum;//Считаем стоимость товаров
                        System.out.println("Товар добавлен, общая сумма: " + sum + " руб. Что еще добавить из блюд? Если ничего, напиши 'Завершить'");
                        break;
                    }
                } else {
                    System.out.println("Не шути со мной, кожанный, у тебя последняя попытка");
                    scanner.nextLine();
                }
            }
            scanner.nextLine();
        }
        items=builder.toString();
    }


    static void printResult(double personalCost, String rub) {
        System.out.println("Добавленные товары: ");
        System.out.print(items);
        System.out.printf("Короче, клоуны, с каждого к оплате: %.2f %s", personalCost, rub);
    }
}