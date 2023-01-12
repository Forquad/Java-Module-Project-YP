import java.util.Scanner;

public class People {
    static Scanner scanner = new Scanner(System.in);

    public static int howMuchPeople() {
        int quantity; //переменная в которой хранится количество человек
        System.out.println("Сколько Вас, ребят?");
        while (true) {
            if (scanner.hasNextInt()) {
                quantity = scanner.nextInt();
                if (quantity == 1) {
                    System.out.println("Ты что, дурак? Ты ешь один...Попробуй еще раз...");
                } else if (quantity < 1) {
                    System.out.println("Серьезно? Ты пересмотрелл Рикк и Морти? Богатый внутренний мир... попробуй еще раз...");
                } else if (quantity > 1){
                    break;
                }
            } else {
                System.out.println("О боги!... Вы же не буквы или половинчатые...Кожанный, давай попробуем еще раз...");
                scanner.next();
            }
        }
        return quantity;
    }
}